package net.saoirse.saoirsefolklore.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.saoirse.saoirsefolklore.SaoirseFolklore;
import net.saoirse.saoirsefolklore.block.ModBlocks;
import net.saoirse.saoirsefolklore.item.ModItems;
import net.minecraft.world.item.crafting.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> DEEPIUM_SMELTABLES = List.of(ModBlocks.DEEPIUM_ORE, ModBlocks.DEEPSLATE_DEEPIUM_ORE, ModItems.RAW_DEEPIUM);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EYE_OF_THE_DEEP.get())
                .pattern("###")
                .pattern("#E#")
                .pattern("###")
                .define('#', ModItems.DEEPIUM_DUST.get())
                .define('E', Items.ENDER_PEARL)
                .unlockedBy("has_eye_of_the_deep", has(ModItems.EYE_OF_THE_DEEP)).save(recipeOutput,
                        "saoirsefolklore:eye_of_the_deep_from_deepium_ingot_and_ender_pearl");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_DEEPIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_DEEPIUM.get())
                .unlockedBy("has_raw_deepium", has(ModItems.RAW_DEEPIUM)).save(recipeOutput,
                        "saoirsefolklore:raw_deepium_block_from_raw_deepium");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEEPIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DEEPIUM_INGOT.get())
                .unlockedBy("has_deepium_ingot", has(ModItems.DEEPIUM_INGOT)).save(recipeOutput,
                        "saoirsefolklore:deepium_block_from_deepium_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DEEPIUM_INGOT.get(), 9)
                .requires(ModBlocks.DEEPIUM_BLOCK)
                .unlockedBy("has_deepium_block", has(ModBlocks.DEEPIUM_BLOCK)).save(recipeOutput,
                        "saoirsefolklore:deepium_ingot_from_deepium_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_DEEPIUM.get(), 9)
                .requires(ModBlocks.RAW_DEEPIUM_BLOCK)
                .unlockedBy("has_raw_deepium_block", has(ModBlocks.RAW_DEEPIUM_BLOCK)).save(recipeOutput,
                        "saoirsefolklore:raw_deepium_from_raw_deepium_block");

        oreSmelting(recipeOutput, DEEPIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.DEEPIUM_INGOT.get(),
                0.25f, 200, "deepium");

        oreBlasting(recipeOutput, DEEPIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.DEEPIUM_INGOT.get(),
                0.25f, 200, "deepium");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, SaoirseFolklore.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
