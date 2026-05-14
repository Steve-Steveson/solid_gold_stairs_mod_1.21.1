package net.steveson.solidgoldstairs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SolidGoldStairsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CHISELED_QUARTZ_STAIRS.get())
                .add(ModBlocks.CHISELED_QUARTZ_SLAB.get())
                .add(ModBlocks.QUARTZ_BRICK_STAIRS.get())
                .add(ModBlocks.QUARTZ_BRICK_SLAB.get());

        tag(BlockTags.STAIRS)
                .add(ModBlocks.CHISELED_QUARTZ_STAIRS.get())
                .add(ModBlocks.QUARTZ_BRICK_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.CHISELED_QUARTZ_SLAB.get())
                .add(ModBlocks.QUARTZ_BRICK_SLAB.get());


    }
}
