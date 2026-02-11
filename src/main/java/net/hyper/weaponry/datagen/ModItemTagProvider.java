package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.hyper.weaponry.item.ModItems;
import net.hyper.weaponry.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.GREATSWORDS)
                .add(ModItems.WOODEN_GREATSWORD)
                .add(ModItems.STONE_GREATSWORD)
                .add(ModItems.IRON_GREATSWORD)
                .add(ModItems.GOLDEN_GREATSWORD)
                .add(ModItems.DIAMOND_GREATSWORD)
                .add(ModItems.NETHERITE_GREATSWORD);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.TOOLS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.ENCHANTABLES)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
    }
}