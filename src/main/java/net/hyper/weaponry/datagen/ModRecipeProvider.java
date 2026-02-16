package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.weaponry.registry.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_GREATSWORD)
                .pattern("  0")
                .pattern("00 ")
                .pattern("#0 ")
                .input('#', Items.STICK)
                .input('0', ItemTags.PLANKS)
                .criterion(hasItem(ModItems.WOODEN_GREATSWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_GREATSWORD)
                .pattern("  0")
                .pattern("00 ")
                .pattern("#0 ")
                .input('#', Items.STICK)
                .input('0', ItemTags.STONE_TOOL_MATERIALS)
                .criterion(hasItem(ModItems.STONE_GREATSWORD), conditionsFromItem(Items.STONE_SWORD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_GREATSWORD)
                .pattern("  0")
                .pattern("00 ")
                .pattern("#0 ")
                .input('#', Items.STICK)
                .input('0', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.IRON_GREATSWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLDEN_GREATSWORD)
                .pattern("  0")
                .pattern("00 ")
                .pattern("#0 ")
                .input('#', Items.STICK)
                .input('0', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.GOLDEN_GREATSWORD), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_GREATSWORD)
                .pattern("  0")
                .pattern("00 ")
                .pattern("#0 ")
                .input('#', Items.STICK)
                .input('0', Items.DIAMOND)
                .criterion(hasItem(ModItems.DIAMOND_GREATSWORD), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(ModItems.DIAMOND_GREATSWORD), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, ModItems.NETHERITE_GREATSWORD)
                .criterion(hasItem(ModItems.NETHERITE_GREATSWORD), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "netherite_greatsword_smithing");

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_HORSE_ARMOR), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, ModItems.NETHERITE_HORSE_ARMOR)
                .criterion(hasItem(ModItems.NETHERITE_HORSE_ARMOR), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "netherite_horse_armor_smithing");


        List<ItemConvertible> IRON_SMELTABLES = List.of(ModItems.IRON_GREATSWORD);
        List<ItemConvertible> GOLDEN_SMELTABLES = List.of(ModItems.GOLDEN_GREATSWORD);

        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.1f, 200, "iron_nugget");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.1f, 200, "iron_nugget");
        offerSmelting(exporter, GOLDEN_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1f, 200, "gold_nugget");
        offerBlasting(exporter, GOLDEN_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1f, 200, "gold_nugget");
    }
}