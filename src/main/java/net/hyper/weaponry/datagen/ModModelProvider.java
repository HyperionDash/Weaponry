package net.hyper.weaponry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hyper.weaponry.item.ModItems;
import net.hyper.weaponry.util.ModModels;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
        itemModelGenerator.register(ModItems.IRON_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_GREATSWORD, ModModels.GREATSWORD);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD, "_gui", Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GREATSWORD, ModModels.GREATSWORD);
    }
}