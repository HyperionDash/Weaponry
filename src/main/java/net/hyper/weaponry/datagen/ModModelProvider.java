package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hyper.weaponry.registry.ModItems;
import net.hyper.weaponry.registry.ModModels;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.STONE_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.COPPER_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.IRON_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD, ModModels.GREATSWORD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
    }
}