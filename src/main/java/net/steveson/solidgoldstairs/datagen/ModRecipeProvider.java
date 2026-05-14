package net.steveson.solidgoldstairs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, recipeOutput);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, recipeOutput);

        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB, recipeOutput);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB, recipeOutput);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB, recipeOutput);

        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_SLAB, recipeOutput);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB, recipeOutput);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS, recipeOutput);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_SLAB, recipeOutput);


    }

    private static void registerStairsCraftingRecipe(RecipeCategory category, ItemLike input, DeferredBlock<StairBlock> output, RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(category, output.get(), 4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, SolidGoldStairsMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, output.get())
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, SolidGoldStairsMod.MOD_ID + ":" + "stonecutting/" + getItemName(output.get()));
    }

    private static void registerSlabCraftingRecipe(RecipeCategory category, ItemLike input, DeferredBlock<SlabBlock> output, RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(category, output.get(), 6)
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, SolidGoldStairsMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, output.get(), 2)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, SolidGoldStairsMod.MOD_ID + ":" + "stonecutting/" + getItemName(output.get()));
    }


}
