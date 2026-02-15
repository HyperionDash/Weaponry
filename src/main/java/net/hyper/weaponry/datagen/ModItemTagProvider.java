package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.hyper.weaponry.registry.ModItems;
import net.hyper.weaponry.registry.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.OFFHAND_WHITELIST)
                .add(Items.POTION)
                .add(Items.LINGERING_POTION)
                .add(Items.SPLASH_POTION)
                .add(Items.SNOWBALL)
                .add(Items.EGG)
                .add(Items.WIND_CHARGE)
                .add(Items.LAVA_BUCKET)
                .add(Items.PUFFERFISH_BUCKET)
                .add(Items.FLINT_AND_STEEL)
                .add(Items.FIRE_CHARGE)
                .add(Items.FISHING_ROD)
                .add(Items.ENDER_PEARL)
                .add(Items.FIREWORK_ROCKET)
                .add(Items.END_CRYSTAL)
                .add(Items.TOTEM_OF_UNDYING)
                .add(Items.SHIELD)
                .add(Items.CROSSBOW)
                .add(Items.BOW);

        getOrCreateTagBuilder(ModTags.Items.DUAL_HANDED_WEAPONS)
                .addTag(ModTags.Items.GREATSWORDS);

        getOrCreateTagBuilder(ModTags.Items.GREATSWORDS)
                .add(ModItems.WOODEN_GREATSWORD)
                .add(ModItems.STONE_GREATSWORD)
                .add(ModItems.COPPER_GREATSWORD)
                .add(ModItems.IRON_GREATSWORD)
                .add(ModItems.GOLDEN_GREATSWORD)
                .add(ModItems.DIAMOND_GREATSWORD)
                .add(ModItems.NETHERITE_GREATSWORD);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE);

        getOrCreateTagBuilder(ConventionalItemTags.NUGGETS)
                .add(ModItems.COPPER_NUGGET);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.TOOLS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ConventionalItemTags.ENCHANTABLES)
                .addTag(ModTags.Items.GREATSWORDS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .addTag(ModTags.Items.GREATSWORDS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ConventionalItemTags.ARMORS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);
    }
}