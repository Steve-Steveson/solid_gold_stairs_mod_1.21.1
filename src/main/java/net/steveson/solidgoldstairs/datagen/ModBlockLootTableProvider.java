package net.steveson.solidgoldstairs.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.CHISELED_QUARTZ_STAIRS.get());
        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS.get());

        add(ModBlocks.CHISELED_QUARTZ_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHISELED_QUARTZ_SLAB.get()));
        add(ModBlocks.QUARTZ_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
