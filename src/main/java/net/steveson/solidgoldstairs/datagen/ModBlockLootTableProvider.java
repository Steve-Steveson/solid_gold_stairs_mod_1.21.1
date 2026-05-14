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
        dropSelf(ModBlocks.COAL_STAIRS.get());
        dropSelf(ModBlocks.IRON_STAIRS.get());
        dropSelf(ModBlocks.GOLD_STAIRS.get());

        dropSelf(ModBlocks.EMERALD_STAIRS.get());
        dropSelf(ModBlocks.LAPIS_STAIRS.get());
        dropSelf(ModBlocks.DIAMOND_STAIRS.get());
        dropSelf(ModBlocks.NETHERITE_STAIRS.get());
        dropSelf(ModBlocks.CHISELED_QUARTZ_STAIRS.get());
        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS.get());
        dropSelf(ModBlocks.AMETHYST_STAIRS.get());


        add(ModBlocks.COAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COAL_SLAB.get()));
        add(ModBlocks.IRON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.IRON_SLAB.get()));
        add(ModBlocks.GOLD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GOLD_SLAB.get()));

        add(ModBlocks.EMERALD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EMERALD_SLAB.get()));
        add(ModBlocks.LAPIS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LAPIS_SLAB.get()));
        add(ModBlocks.DIAMOND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DIAMOND_SLAB.get()));
        add(ModBlocks.NETHERITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.NETHERITE_SLAB.get()));
        add(ModBlocks.CHISELED_QUARTZ_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHISELED_QUARTZ_SLAB.get()));
        add(ModBlocks.QUARTZ_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB.get()));
        add(ModBlocks.AMETHYST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMETHYST_SLAB.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
