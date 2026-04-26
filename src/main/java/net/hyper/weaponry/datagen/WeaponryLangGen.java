package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.hyper.weaponry.registry.WeaponryItemTags;
import net.hyper.weaponry.registry.WeaponryItems;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class WeaponryLangGen extends FabricLanguageProvider {
    public WeaponryLangGen(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Items
        translationBuilder.add(WeaponryItems.WOODEN_GREATSWORD, "Wooden Greatsword");
        translationBuilder.add(WeaponryItems.STONE_GREATSWORD, "Stone Greatsword");
        translationBuilder.add(WeaponryItems.COPPER_GREATSWORD, "Copper Greatsword");
        translationBuilder.add(WeaponryItems.IRON_GREATSWORD, "Iron Greatsword");
        translationBuilder.add(WeaponryItems.GOLDEN_GREATSWORD, "Golden Greatsword");
        translationBuilder.add(WeaponryItems.DIAMOND_GREATSWORD, "Diamond Greatsword");
        translationBuilder.add(WeaponryItems.NETHERITE_GREATSWORD, "Netherite Greatsword");

        translationBuilder.add(WeaponryItems.WOODEN_SHIELD, "Wooden Shield");
        translationBuilder.add(WeaponryItems.COPPER_SHIELD, "Copper Shield");
        translationBuilder.add(WeaponryItems.IRON_SHIELD, "Iron Shield");
        translationBuilder.add(WeaponryItems.GOLDEN_SHIELD, "Golden Shield");
        translationBuilder.add(WeaponryItems.DIAMOND_SHIELD, "Diamond Shield");
        translationBuilder.add(WeaponryItems.NETHERITE_SHIELD, "Netherite Shield");

        // Tags
        translationBuilder.add(WeaponryItemTags.DUAL_HANDED_WEAPONS, "Dual Handed Weapons");
        translationBuilder.add(WeaponryItemTags.GREATSWORDS, "Greatswords");
        translationBuilder.add(WeaponryItemTags.SHIELDS, "Shields");

        // Other
        translationBuilder.add("creativetab.weaponry.weaponry", "Weaponry");
        translationBuilder.add("text.weaponry.improved_spears", "Improved Spears");
        translationBuilder.add("text.weaponry.cheaper_trims", "Cheaper Trims");
    }
}