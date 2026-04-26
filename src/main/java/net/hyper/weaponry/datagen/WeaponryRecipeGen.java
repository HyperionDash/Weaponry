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

                shaped(RecipeCategory.COMBAT, WeaponryItems.WOODEN_SHIELD)
                        .pattern("###")
                        .pattern("###")
                        .pattern(" # ")
                        .define('#', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy(getHasName(WeaponryItems.WOODEN_SHIELD), has(ItemTags.WOODEN_TOOL_MATERIALS))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.COPPER_SHIELD)
                        .pattern("###")
                        .pattern("000")
                        .pattern(" 0 ")
                        .define('#', Items.COPPER_INGOT)
                        .define('0', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy(getHasName(WeaponryItems.COPPER_SHIELD), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.IRON_SHIELD)
                        .pattern("###")
                        .pattern("000")
                        .pattern(" 0 ")
                        .define('#', Items.IRON_INGOT)
                        .define('0', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy(getHasName(WeaponryItems.IRON_SHIELD), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.GOLDEN_SHIELD)
                        .pattern("###")
                        .pattern("000")
                        .pattern(" 0 ")
                        .define('#', Items.GOLD_INGOT)
                        .define('0', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy(getHasName(WeaponryItems.GOLDEN_SHIELD), has(Items.GOLD_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, WeaponryItems.DIAMOND_SHIELD)
                        .pattern("###")
                        .pattern("000")
                        .pattern(" 0 ")
                        .define('#', Items.DIAMOND)
                        .define('0', ItemTags.WOODEN_TOOL_MATERIALS)
                        .unlockedBy(getHasName(WeaponryItems.DIAMOND_SHIELD), has(Items.DIAMOND))
                        .save(output);
                netheriteSmithing(WeaponryItems.DIAMOND_SHIELD, RecipeCategory.COMBAT, WeaponryItems.NETHERITE_SHIELD);

                // Smelting
                oreSmelting(List.of(WeaponryItems.COPPER_GREATSWORD, WeaponryItems.COPPER_SHIELD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.COPPER_NUGGET, 0.1f, 200, "copper_nugget_from_smelting_copper_gear");
                oreSmelting(List.of(WeaponryItems.IRON_GREATSWORD, WeaponryItems.IRON_SHIELD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.IRON_NUGGET, 0.1f, 200, "iron_nugget_from_smelting_iron_gear");
                oreSmelting(List.of(WeaponryItems.GOLDEN_GREATSWORD, WeaponryItems.GOLDEN_SHIELD), RecipeCategory.MISC, CookingBookCategory.MISC, Items.GOLD_NUGGET, 0.1f, 200, "gold_nugget_from_smelting_golden_gear");
            }
        };
    }
    @Override
    public String getName() {
        return "recipegen";
    }
}