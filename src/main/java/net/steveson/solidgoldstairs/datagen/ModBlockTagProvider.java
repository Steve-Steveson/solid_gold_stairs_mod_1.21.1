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
                .add(ModBlocks.COAL_STAIRS.get())
                .add(ModBlocks.COAL_SLAB.get())
                .add(ModBlocks.IRON_STAIRS.get())
                .add(ModBlocks.IRON_SLAB.get())
                .add(ModBlocks.GOLD_STAIRS.get())
                .add(ModBlocks.GOLD_SLAB.get())
                .add(ModBlocks.REDSTONE_STAIRS.get())
                .add(ModBlocks.REDSTONE_SLAB.get())
                .add(ModBlocks.EMERALD_STAIRS.get())
                .add(ModBlocks.EMERALD_SLAB.get())
                .add(ModBlocks.LAPIS_STAIRS.get())
                .add(ModBlocks.LAPIS_SLAB.get())
                .add(ModBlocks.DIAMOND_STAIRS.get())
                .add(ModBlocks.DIAMOND_SLAB.get())
                .add(ModBlocks.NETHERITE_STAIRS.get())
                .add(ModBlocks.NETHERITE_SLAB.get())
                .add(ModBlocks.CHISELED_QUARTZ_STAIRS.get())
                .add(ModBlocks.CHISELED_QUARTZ_SLAB.get())
                .add(ModBlocks.QUARTZ_BRICK_STAIRS.get())
                .add(ModBlocks.QUARTZ_BRICK_SLAB.get())
                .add(ModBlocks.AMETHYST_STAIRS.get())
                .add(ModBlocks.AMETHYST_SLAB.get())

                .add(ModBlocks.COPPER_STAIRS.get())
                .add(ModBlocks.EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.OXIDIZED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get())

                .add(ModBlocks.COPPER_SLAB.get())
                .add(ModBlocks.EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get());


        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRON_STAIRS.get())
                .add(ModBlocks.IRON_SLAB.get())
                .add(ModBlocks.LAPIS_STAIRS.get())
                .add(ModBlocks.LAPIS_SLAB.get())

                .add(ModBlocks.COPPER_STAIRS.get())
                .add(ModBlocks.EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.OXIDIZED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get())

                .add(ModBlocks.COPPER_SLAB.get())
                .add(ModBlocks.EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_STAIRS.get())
                .add(ModBlocks.GOLD_SLAB.get())
                .add(ModBlocks.EMERALD_STAIRS.get())
                .add(ModBlocks.EMERALD_SLAB.get())
                .add(ModBlocks.DIAMOND_STAIRS.get())
                .add(ModBlocks.DIAMOND_SLAB.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHERITE_STAIRS.get())
                .add(ModBlocks.NETHERITE_SLAB.get());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.COAL_STAIRS.get())
                .add(ModBlocks.IRON_STAIRS.get())
                .add(ModBlocks.GOLD_STAIRS.get())

                .add(ModBlocks.EMERALD_STAIRS.get())
                .add(ModBlocks.LAPIS_STAIRS.get())
                .add(ModBlocks.DIAMOND_STAIRS.get())
                .add(ModBlocks.NETHERITE_STAIRS.get())
                .add(ModBlocks.CHISELED_QUARTZ_STAIRS.get())
                .add(ModBlocks.QUARTZ_BRICK_STAIRS.get())
                .add(ModBlocks.AMETHYST_STAIRS.get())

                .add(ModBlocks.COPPER_STAIRS.get())
                .add(ModBlocks.EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.OXIDIZED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.COAL_SLAB.get())
                .add(ModBlocks.IRON_SLAB.get())
                .add(ModBlocks.GOLD_SLAB.get())
                .add(ModBlocks.REDSTONE_SLAB.get())
                .add(ModBlocks.EMERALD_SLAB.get())
                .add(ModBlocks.LAPIS_SLAB.get())
                .add(ModBlocks.DIAMOND_SLAB.get())
                .add(ModBlocks.NETHERITE_SLAB.get())
                .add(ModBlocks.CHISELED_QUARTZ_SLAB.get())
                .add(ModBlocks.QUARTZ_BRICK_SLAB.get())
                .add(ModBlocks.AMETHYST_SLAB.get())

                .add(ModBlocks.COPPER_SLAB.get())
                .add(ModBlocks.EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get());


        tag(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.GOLD_STAIRS.get())
                .add(ModBlocks.GOLD_SLAB.get());
    }
}
