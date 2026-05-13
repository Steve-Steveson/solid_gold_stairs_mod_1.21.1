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


//    public static final DeferredBlock<Block> CHISELED_QUARTZ_STAIRS = registerBlock("chiseled_quartz_stairs",
//            ()-> new StairBlock(
//                    BlockBehaviour.Properties.ofLegacyCopy(Blocks.CHISELED_QUARTZ_BLOCK)));
    public static final DeferredBlock<Block> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CHISELED_QUARTZ_BLOCK)));


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
