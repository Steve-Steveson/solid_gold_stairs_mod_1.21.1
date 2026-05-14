package net.steveson.solidgoldstairs.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SolidGoldStairsMod.MOD_ID);



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




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
