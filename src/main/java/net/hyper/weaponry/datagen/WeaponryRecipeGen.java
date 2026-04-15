package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.weaponry.registry.WeaponryItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class WeaponryRecipeGen extends FabricRecipeProvider {
    public WeaponryRecipeGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {

                // Greatswords
                shaped(RecipeCategory.COMBAT, WeaponryItems.WOODEN_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', ItemTags.WOODEN_TOOL_MATERIALS)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.WOODEN_GREATSWORD), has(ItemTags.WOODEN_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.STONE_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', ItemTags.STONE_TOOL_MATERIALS)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.STONE_GREATSWORD), has(ItemTags.STONE_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.COPPER_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', Items.COPPER_INGOT)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.COPPER_GREATSWORD), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.IRON_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', Items.IRON_INGOT)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.IRON_GREATSWORD), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.GOLDEN_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', Items.GOLD_INGOT)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.GOLDEN_GREATSWORD), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.DIAMOND_GREATSWORD)
                        .pattern("  #")
                        .pattern("## ")
                        .pattern("0# ")
                        .define('#', Items.DIAMOND)
                        .define('0', Items.STICK)
                        .unlockedBy(getHasName(WeaponryItems.DIAMOND_GREATSWORD), has(Items.DIAMOND))
                        .save(output);
                netheriteSmithing(WeaponryItems.DIAMOND_GREATSWORD, RecipeCategory.COMBAT, WeaponryItems.NETHERITE_GREATSWORD);

                // Smelting
                oreSmelting(List.of(WeaponryItems.COPPER_GREATSWORD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.COPPER_NUGGET, 0.1f, 200, "copper_nugget");
                oreSmelting(List.of(WeaponryItems.IRON_GREATSWORD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.IRON_NUGGET, 0.1f, 200, "iron_nugget");
                oreSmelting(List.of(WeaponryItems.GOLDEN_GREATSWORD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.GOLD_NUGGET, 0.1f, 200, "gold_nugget");
            }
        };
    }
    @Override
    public String getName() {
        return "recipegen";
    }
}