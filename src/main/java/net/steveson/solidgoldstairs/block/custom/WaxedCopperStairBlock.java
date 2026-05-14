package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Optional;

public class WaxedCopperStairBlock extends StairBlock {
    private final WeatheringCopper.WeatherState weatherState;

    public WaxedCopperStairBlock(WeatheringCopper.WeatherState weatherState, BlockState baseState, Properties properties) {
        super(baseState, properties);
        this.weatherState = weatherState;
    }


    public WeatheringCopper.WeatherState getWeatheringState() {
        return this.weatherState;
    }

    /**
     * Get the unwaxed (weathering) version of this block for axe scraping
     */
    public Optional<Block> getUnwaxedBlock() {
        return switch (this.weatherState) {
            case UNAFFECTED -> Optional.of(ModBlocks.COPPER_STAIRS.get());
            case EXPOSED -> Optional.of(ModBlocks.EXPOSED_COPPER_STAIRS.get());
            case WEATHERED -> Optional.of(ModBlocks.WEATHERED_COPPER_STAIRS.get());
            case OXIDIZED -> Optional.of(ModBlocks.OXIDIZED_COPPER_STAIRS.get());
        };
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        // Handle axe scraping to remove wax
        if (stack.is(ItemTags.AXES)) {
            Optional<Block> unwaxed = getUnwaxedBlock();
            if (unwaxed.isPresent()) {

                level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3004, pos, 0); // WAX_OFF particles

                if (!level.isClientSide) {
                    BlockState newState = unwaxed.get().withPropertiesOf(state);
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
}
