package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.steveson.solidgoldstairs.block.ModBlocks;
import net.steveson.solidgoldstairs.util.WeatheringHelper;

import java.util.Optional;

public class UncutWeatheringCopperStairBlock extends StairBlock implements WeatheringCopper, SteveHasWeatheringCopper {

    private final WeatherState weatherState;

    public UncutWeatheringCopperStairBlock(WeatherState weatherState, BlockState baseState, Properties properties) {
        super(baseState, properties);
        this.weatherState = weatherState;
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }

    /**
     * Get the next oxidation stage block
     */
    public Optional<Block> getNextBlock() {
        return switch (this.weatherState) {
            case UNAFFECTED -> Optional.of(ModBlocks.EXPOSED_COPPER_STAIRS.get());
            case EXPOSED -> Optional.of(ModBlocks.WEATHERED_COPPER_STAIRS.get());
            case WEATHERED -> Optional.of(ModBlocks.OXIDIZED_COPPER_STAIRS.get());
            case OXIDIZED -> Optional.empty();
        };
    }

    /**
     * Get the previous oxidation stage block (for axe scraping)
     */
    public Optional<Block> getPreviousBlock() {
        return switch (this.weatherState) {
            case UNAFFECTED -> Optional.empty();
            case EXPOSED -> Optional.of(ModBlocks.COPPER_STAIRS.get());
            case WEATHERED -> Optional.of(ModBlocks.EXPOSED_COPPER_STAIRS.get());
            case OXIDIZED -> Optional.of(ModBlocks.WEATHERED_COPPER_STAIRS.get());
        };
    }

    /**
     * Get the waxed version of this block
     */
    public Optional<Block> getWaxedBlock() {
        return switch (this.weatherState) {
            case UNAFFECTED -> Optional.of(ModBlocks.WAXED_COPPER_STAIRS.get());
            case EXPOSED -> Optional.of(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get());
            case WEATHERED -> Optional.of(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get());
            case OXIDIZED -> Optional.of(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get());
        };
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        WeatheringHelper.tryWeather(state, level, pos, random, this::getNextBlockGeneric);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringHelper.canWeather(state, this::getNextBlockGeneric);
    }

//    @Override
//    public Optional<BlockState> getNext(BlockState state) {
//        return WeatheringCopper.super.getNext(state);
//    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        // Handle honeycomb waxing
        if (stack.is(Items.HONEYCOMB)) {
            Optional<Block> waxed = getWaxedBlock();
            if (waxed.isPresent()) {

                level.playSound(player, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3003, pos, 0); // WAX_ON particles

                if (!level.isClientSide) {
                    BlockState newState = waxed.get().withPropertiesOf(state);
                    level.setBlockAndUpdate(pos, newState);
                    if (!player.isCreative()) {
                        stack.shrink(1);
                    }
                }

                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        // Handle axe scraping to reduce oxidation
        if (stack.is(ItemTags.AXES)) {
            Optional<Block> previous = getPreviousBlock();
            if (previous.isPresent()) {

                level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3005, pos, 0); // SCRAPE particles

                if (!level.isClientSide) {
                    BlockState newState = previous.get().withPropertiesOf(state);
                    level.setBlockAndUpdate(pos, newState);
                    if (!player.isCreative()) {
                        stack.hurtAndBreak(1, player, player.getEquipmentSlotForItem(stack));
                    }
                }

                return ItemInteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    public Optional<Block> getPreviousBlockGeneric(Block block) {
        return getPreviousBlock();
    }

    @Override
    public Optional<Block> getNextBlockGeneric(Block block) {
        return getNextBlock();
    }
}
