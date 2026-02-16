package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.hyper.weaponry.registry.ModItems;
import net.hyper.weaponry.registry.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider (FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        // Items
        translationBuilder.add(ModItems.WOODEN_GREATSWORD, "Wooden Greatsword");
        translationBuilder.add(ModItems.STONE_GREATSWORD, "Stone Greatsword");
        translationBuilder.add(ModItems.IRON_GREATSWORD, "Iron Greatsword");
        translationBuilder.add(ModItems.GOLDEN_GREATSWORD, "Golden Greatsword");
        translationBuilder.add(ModItems.DIAMOND_GREATSWORD, "Diamond Greatsword");
        translationBuilder.add(ModItems.NETHERITE_GREATSWORD, "Netherite Greatsword");

        translationBuilder.add(ModItems.NETHERITE_HORSE_ARMOR, "Netherite Horse Armor");

        // Tags
        translationBuilder.add(ModTags.Items.GREATSWORDS, "Greatswords");
        translationBuilder.add(ModTags.Items.OFFHAND_WHITELIST, "Offhand Whitelist");
        translationBuilder.add(ModTags.Items.DUAL_HANDED_WEAPONS, "Dual Handed Weapons");

        // Creative Tabs
        translationBuilder.add("itemgroup.weaponry.weaponry", "Weaponry");
    }
}