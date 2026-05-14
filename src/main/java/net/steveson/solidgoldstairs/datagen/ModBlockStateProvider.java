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

        stairsBlock(ModBlocks.IRON_STAIRS.get(), blockTexture(Blocks.IRON_BLOCK));
        slabBlock(ModBlocks.IRON_SLAB.get(), blockTexture(Blocks.IRON_BLOCK), blockTexture(Blocks.IRON_BLOCK));
        stairsBlock(ModBlocks.GOLD_STAIRS.get(), blockTexture(Blocks.GOLD_BLOCK));
        slabBlock(ModBlocks.GOLD_SLAB.get(), blockTexture(Blocks.GOLD_BLOCK), blockTexture(Blocks.GOLD_BLOCK));

        stairsBlock(ModBlocks.EMERALD_STAIRS.get(), blockTexture(Blocks.EMERALD_BLOCK));
        slabBlock(ModBlocks.EMERALD_SLAB.get(), blockTexture(Blocks.EMERALD_BLOCK), blockTexture(Blocks.EMERALD_BLOCK));
        stairsBlock(ModBlocks.LAPIS_STAIRS.get(), blockTexture(Blocks.LAPIS_BLOCK));
        slabBlock(ModBlocks.LAPIS_SLAB.get(), blockTexture(Blocks.LAPIS_BLOCK), blockTexture(Blocks.LAPIS_BLOCK));
        stairsBlock(ModBlocks.DIAMOND_STAIRS.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        slabBlock(ModBlocks.DIAMOND_SLAB.get(), blockTexture(Blocks.DIAMOND_BLOCK), blockTexture(Blocks.DIAMOND_BLOCK));

        // chiseled quartz has different top texture
        stairsBlock(ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock(ModBlocks.QUARTZ_BRICK_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        stairsBlock(ModBlocks.AMETHYST_STAIRS.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        slabBlock(ModBlocks.AMETHYST_SLAB.get(), blockTexture(Blocks.AMETHYST_BLOCK), blockTexture(Blocks.AMETHYST_BLOCK));


        blockItem(ModBlocks.IRON_STAIRS);
        blockItem(ModBlocks.IRON_SLAB);
        blockItem(ModBlocks.GOLD_STAIRS);
        blockItem(ModBlocks.GOLD_SLAB);

        blockItem(ModBlocks.EMERALD_STAIRS);
        blockItem(ModBlocks.EMERALD_SLAB);
        blockItem(ModBlocks.LAPIS_STAIRS);
        blockItem(ModBlocks.LAPIS_SLAB);
        blockItem(ModBlocks.DIAMOND_STAIRS);
        blockItem(ModBlocks.DIAMOND_SLAB);

        blockItem(ModBlocks.CHISELED_QUARTZ_STAIRS);
        blockItem(ModBlocks.CHISELED_QUARTZ_SLAB);
        blockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        blockItem(ModBlocks.QUARTZ_BRICK_SLAB);
        blockItem(ModBlocks.AMETHYST_STAIRS);
        blockItem(ModBlocks.AMETHYST_SLAB);

    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath()));
    }

//    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
//        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath() + appendix));
//    }
}
