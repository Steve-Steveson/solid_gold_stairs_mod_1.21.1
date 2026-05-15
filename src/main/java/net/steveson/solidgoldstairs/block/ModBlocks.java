package net.steveson.solidgoldstairs.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.custom.*;
import net.steveson.solidgoldstairs.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SolidGoldStairsMod.MOD_ID);

    public static final DeferredBlock<StairBlock> COAL_STAIRS = registerFuelBlock("coal_stairs",
            ()-> new StairBlock( Blocks.COAL_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_BLOCK)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }, 16000);
    public static final DeferredBlock<SlabBlock> COAL_SLAB = registerFuelBlock("coal_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_BLOCK)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            }, 8000);


    public static final DeferredBlock<StairBlock> IRON_STAIRS = registerBlock("iron_stairs",
            ()-> new StairBlock( Blocks.IRON_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<SlabBlock> IRON_SLAB = registerBlock("iron_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.IRON_BLOCK)));

    public static final DeferredBlock<StairBlock> GOLD_STAIRS = registerBlock("gold_stairs",
            ()-> new StairBlock( Blocks.GOLD_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.GOLD_BLOCK)));
    public static final DeferredBlock<SlabBlock> GOLD_SLAB = registerBlock("gold_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GOLD_BLOCK)));

    public static final DeferredBlock<StairBlock> REDSTONE_STAIRS = registerBlock("redstone_stairs",
            ()-> new PoweredStairBlock( Blocks.REDSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.REDSTONE_BLOCK)));
    public static final DeferredBlock<SlabBlock> REDSTONE_SLAB = registerBlock("redstone_slab",
            ()-> new PoweredSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.REDSTONE_BLOCK)));

    public static final DeferredBlock<StairBlock> EMERALD_STAIRS = registerBlock("emerald_stairs",
            ()-> new StairBlock( Blocks.EMERALD_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.EMERALD_BLOCK)));
    public static final DeferredBlock<SlabBlock> EMERALD_SLAB = registerBlock("emerald_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.EMERALD_BLOCK)));

    public static final DeferredBlock<StairBlock> LAPIS_STAIRS = registerBlock("lapis_stairs",
            ()-> new StairBlock( Blocks.LAPIS_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.LAPIS_BLOCK)));
    public static final DeferredBlock<SlabBlock> LAPIS_SLAB = registerBlock("lapis_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LAPIS_BLOCK)));

    public static final DeferredBlock<StairBlock> DIAMOND_STAIRS = registerBlock("diamond_stairs",
            ()-> new StairBlock( Blocks.DIAMOND_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredBlock<SlabBlock> DIAMOND_SLAB = registerBlock("diamond_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.DIAMOND_BLOCK)));

    public static final DeferredBlock<StairBlock> NETHERITE_STAIRS = registerBlockNetherite("netherite_stairs",
            ()-> new StairBlock( Blocks.NETHERITE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.NETHERITE_BLOCK)));
    public static final DeferredBlock<SlabBlock> NETHERITE_SLAB = registerBlockNetherite("netherite_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.NETHERITE_BLOCK)));

    public static final DeferredBlock<StairBlock> CHISELED_QUARTZ_STAIRS = registerBlock("chiseled_quartz_stairs",
            ()-> new StairBlock( Blocks.CHISELED_QUARTZ_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<SlabBlock> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CHISELED_QUARTZ_BLOCK)));

    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            ()-> new StairBlock( Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.QUARTZ_BRICKS)));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.QUARTZ_BRICKS)));

    public static final DeferredBlock<StairBlock> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            ()-> new StairBlock( Blocks.AMETHYST_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<SlabBlock> AMETHYST_SLAB = registerBlock("amethyst_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.AMETHYST_BLOCK)));


    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
            ()-> new UncutWeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, Blocks.OXIDIZED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.OXIDIZED_COPPER)));
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
            ()-> new UncutWeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, Blocks.WEATHERED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.WEATHERED_COPPER)));
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
            ()-> new UncutWeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, Blocks.EXPOSED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.EXPOSED_COPPER)));
    public static final DeferredBlock<StairBlock> COPPER_STAIRS = registerBlock("copper_stairs",
            ()-> new UncutWeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, Blocks.COPPER_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.COPPER_BLOCK)));

    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_STAIRS = registerBlock("waxed_oxidized_copper_stairs",
            ()-> new WaxedCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, Blocks.WAXED_OXIDIZED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_STAIRS = registerBlock("waxed_weathered_copper_stairs",
            ()-> new WaxedCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, Blocks.WAXED_WEATHERED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_STAIRS = registerBlock("waxed_exposed_copper_stairs",
            ()-> new WaxedCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, Blocks.WAXED_EXPOSED_COPPER.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final DeferredBlock<StairBlock> WAXED_COPPER_STAIRS = registerBlock("waxed_copper_stairs",
            ()-> new WaxedCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, Blocks.WAXED_COPPER_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_COPPER_BLOCK)));

    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.OXIDIZED_COPPER)));
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WEATHERED_COPPER)));
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.EXPOSED_COPPER)));
    public static final DeferredBlock<SlabBlock> COPPER_SLAB = registerBlock("copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.COPPER_BLOCK)));

    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            ()-> new WaxedCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_OXIDIZED_COPPER)));
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            ()-> new WaxedCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_WEATHERED_COPPER)));
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            ()-> new WaxedCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_EXPOSED_COPPER)));
    public static final DeferredBlock<SlabBlock> WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            ()-> new WaxedCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofLegacyCopy(Blocks.WAXED_COPPER_BLOCK)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }


    private static <T extends Block> DeferredBlock<T> registerFuelBlock(String name, Supplier<T> block, int burnTime) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerFuelBlockItem(name, toReturn, burnTime);
        return toReturn;
    }
    private static <T extends Block> void registerFuelBlockItem(String name, DeferredBlock<T> block, int burnTime) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()){
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }


    private static <T extends Block> DeferredBlock<T> registerBlockNetherite(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItemNetherite(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItemNetherite(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
