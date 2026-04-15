package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.hyper.weaponry.registry.WeaponryItems;
import net.hyper.weaponry.registry.WeaponryItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class WeaponryItemTagGen extends FabricTagsProvider.ItemTagsProvider {
    public WeaponryItemTagGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        // Mod Tags
        valueLookupBuilder(WeaponryItemTags.GREATSWORDS)
                .add(WeaponryItems.DIAMOND_GREATSWORD)
                .add(WeaponryItems.STONE_GREATSWORD)
                .add(WeaponryItems.GOLDEN_GREATSWORD)
                .add(WeaponryItems.NETHERITE_GREATSWORD)
                .add(WeaponryItems.WOODEN_GREATSWORD)
                .add(WeaponryItems.IRON_GREATSWORD)
                .add(WeaponryItems.COPPER_GREATSWORD);
        valueLookupBuilder(WeaponryItemTags.DUAL_HANDED_WEAPONS)
                .addTag(WeaponryItemTags.GREATSWORDS);

        // Conventional Tags
        valueLookupBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ConventionalItemTags.ENCHANTABLES)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ConventionalItemTags.TOOLS)
                .addTag(WeaponryItemTags.GREATSWORDS);

        // Enchantments
        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.SWEEPING_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.MELEE_WEAPON_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(WeaponryItemTags.GREATSWORDS);

        // Extra
        valueLookupBuilder(ItemTags.SWORDS)
                .addTag(WeaponryItemTags.GREATSWORDS);
        valueLookupBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .addTag(WeaponryItemTags.GREATSWORDS);
    }
}