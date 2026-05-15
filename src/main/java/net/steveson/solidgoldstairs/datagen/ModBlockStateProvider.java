package net.steveson.solidgoldstairs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SolidGoldStairsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        stairsBlock(ModBlocks.COAL_STAIRS.get(), blockTexture(Blocks.COAL_BLOCK));
        slabBlock(ModBlocks.COAL_SLAB.get(), blockTexture(Blocks.COAL_BLOCK), blockTexture(Blocks.COAL_BLOCK));
        stairsBlock(ModBlocks.IRON_STAIRS.get(), blockTexture(Blocks.IRON_BLOCK));
        slabBlock(ModBlocks.IRON_SLAB.get(), blockTexture(Blocks.IRON_BLOCK), blockTexture(Blocks.IRON_BLOCK));
        stairsBlock(ModBlocks.GOLD_STAIRS.get(), blockTexture(Blocks.GOLD_BLOCK));
        slabBlock(ModBlocks.GOLD_SLAB.get(), blockTexture(Blocks.GOLD_BLOCK), blockTexture(Blocks.GOLD_BLOCK));
        stairsBlock(ModBlocks.REDSTONE_STAIRS.get(), blockTexture(Blocks.REDSTONE_BLOCK));
        slabBlock(ModBlocks.REDSTONE_SLAB.get(), blockTexture(Blocks.REDSTONE_BLOCK), blockTexture(Blocks.REDSTONE_BLOCK));
        stairsBlock(ModBlocks.EMERALD_STAIRS.get(), blockTexture(Blocks.EMERALD_BLOCK));
        slabBlock(ModBlocks.EMERALD_SLAB.get(), blockTexture(Blocks.EMERALD_BLOCK), blockTexture(Blocks.EMERALD_BLOCK));
        stairsBlock(ModBlocks.LAPIS_STAIRS.get(), blockTexture(Blocks.LAPIS_BLOCK));
        slabBlock(ModBlocks.LAPIS_SLAB.get(), blockTexture(Blocks.LAPIS_BLOCK), blockTexture(Blocks.LAPIS_BLOCK));
        stairsBlock(ModBlocks.DIAMOND_STAIRS.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        slabBlock(ModBlocks.DIAMOND_SLAB.get(), blockTexture(Blocks.DIAMOND_BLOCK), blockTexture(Blocks.DIAMOND_BLOCK));
        stairsBlock(ModBlocks.NETHERITE_STAIRS.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        slabBlock(ModBlocks.NETHERITE_SLAB.get(), blockTexture(Blocks.NETHERITE_BLOCK), blockTexture(Blocks.NETHERITE_BLOCK));
        // chiseled quartz has different top texture
        stairsBlock(ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock(ModBlocks.QUARTZ_BRICK_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        stairsBlock(ModBlocks.AMETHYST_STAIRS.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        slabBlock(ModBlocks.AMETHYST_SLAB.get(), blockTexture(Blocks.AMETHYST_BLOCK), blockTexture(Blocks.AMETHYST_BLOCK));

        stairsBlock(ModBlocks.COPPER_STAIRS.get(), blockTexture(Blocks.COPPER_BLOCK));
        stairsBlock(ModBlocks.EXPOSED_COPPER_STAIRS.get(), blockTexture(Blocks.EXPOSED_COPPER));
        stairsBlock(ModBlocks.WEATHERED_COPPER_STAIRS.get(), blockTexture(Blocks.WEATHERED_COPPER));
        stairsBlock(ModBlocks.OXIDIZED_COPPER_STAIRS.get(), blockTexture(Blocks.OXIDIZED_COPPER));
        stairsBlock(ModBlocks.WAXED_COPPER_STAIRS.get(), blockTexture(Blocks.COPPER_BLOCK));
        stairsBlock(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get(), blockTexture(Blocks.EXPOSED_COPPER));
        stairsBlock(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get(), blockTexture(Blocks.WEATHERED_COPPER));
        stairsBlock(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get(), blockTexture(Blocks.OXIDIZED_COPPER));

        slabBlock(ModBlocks.COPPER_SLAB.get(), blockTexture(Blocks.COPPER_BLOCK), blockTexture(Blocks.COPPER_BLOCK));
        slabBlock(ModBlocks.EXPOSED_COPPER_SLAB.get(), blockTexture(Blocks.EXPOSED_COPPER), blockTexture(Blocks.EXPOSED_COPPER));
        slabBlock(ModBlocks.WEATHERED_COPPER_SLAB.get(), blockTexture(Blocks.WEATHERED_COPPER), blockTexture(Blocks.WEATHERED_COPPER));
        slabBlock(ModBlocks.OXIDIZED_COPPER_SLAB.get(), blockTexture(Blocks.OXIDIZED_COPPER), blockTexture(Blocks.OXIDIZED_COPPER));
        slabBlock(ModBlocks.WAXED_COPPER_SLAB.get(), blockTexture(Blocks.COPPER_BLOCK), blockTexture(Blocks.COPPER_BLOCK));
        slabBlock(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(), blockTexture(Blocks.EXPOSED_COPPER), blockTexture(Blocks.EXPOSED_COPPER));
        slabBlock(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(), blockTexture(Blocks.WEATHERED_COPPER), blockTexture(Blocks.WEATHERED_COPPER));
        slabBlock(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(), blockTexture(Blocks.OXIDIZED_COPPER), blockTexture(Blocks.OXIDIZED_COPPER));

        blockItem(ModBlocks.COAL_STAIRS);
        blockItem(ModBlocks.COAL_SLAB);
        blockItem(ModBlocks.IRON_STAIRS);
        blockItem(ModBlocks.IRON_SLAB);
        blockItem(ModBlocks.GOLD_STAIRS);
        blockItem(ModBlocks.GOLD_SLAB);
        blockItem(ModBlocks.REDSTONE_STAIRS);
        blockItem(ModBlocks.REDSTONE_SLAB);
        blockItem(ModBlocks.EMERALD_STAIRS);
        blockItem(ModBlocks.EMERALD_SLAB);
        blockItem(ModBlocks.LAPIS_STAIRS);
        blockItem(ModBlocks.LAPIS_SLAB);
        blockItem(ModBlocks.DIAMOND_STAIRS);
        blockItem(ModBlocks.DIAMOND_SLAB);
        blockItem(ModBlocks.NETHERITE_STAIRS);
        blockItem(ModBlocks.NETHERITE_SLAB);
        blockItem(ModBlocks.CHISELED_QUARTZ_STAIRS);
        blockItem(ModBlocks.CHISELED_QUARTZ_SLAB);
        blockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        blockItem(ModBlocks.QUARTZ_BRICK_SLAB);
        blockItem(ModBlocks.AMETHYST_STAIRS);
        blockItem(ModBlocks.AMETHYST_SLAB);

        blockItem(ModBlocks.COPPER_STAIRS);
        blockItem(ModBlocks.EXPOSED_COPPER_STAIRS);
        blockItem(ModBlocks.WEATHERED_COPPER_STAIRS);
        blockItem(ModBlocks.OXIDIZED_COPPER_STAIRS);
        blockItem(ModBlocks.WAXED_COPPER_STAIRS);
        blockItem(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
        blockItem(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
        blockItem(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);

        blockItem(ModBlocks.COPPER_SLAB);
        blockItem(ModBlocks.EXPOSED_COPPER_SLAB);
        blockItem(ModBlocks.WEATHERED_COPPER_SLAB);
        blockItem(ModBlocks.OXIDIZED_COPPER_SLAB);
        blockItem(ModBlocks.WAXED_COPPER_SLAB);
        blockItem(ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
        blockItem(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
        blockItem(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath()));
    }

//    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
//        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath() + appendix));
//    }
}
