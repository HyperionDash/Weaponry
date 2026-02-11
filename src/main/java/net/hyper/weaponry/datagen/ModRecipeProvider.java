package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.weaponry.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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
    }
}