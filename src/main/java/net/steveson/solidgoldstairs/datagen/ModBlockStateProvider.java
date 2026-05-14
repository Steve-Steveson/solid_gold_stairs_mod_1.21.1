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

        // chiseled quartz has different top texture
        stairsBlock(ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock(ModBlocks.QUARTZ_BRICK_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));




        blockItem(ModBlocks.CHISELED_QUARTZ_STAIRS);
        blockItem(ModBlocks.CHISELED_QUARTZ_SLAB);
        blockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        blockItem(ModBlocks.QUARTZ_BRICK_SLAB);

    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath()));
    }

//    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
//        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath() + appendix));
//    }
}
