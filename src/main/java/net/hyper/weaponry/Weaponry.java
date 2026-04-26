package net.hyper.weaponry;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.weaponry.registry.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class Weaponry implements ModInitializer {
	public static final String MOD_ID = "weaponry";

	@Override
	public void onInitialize() {
		WeaponryItems.registerItems();
		WeaponryCreativeTabs.registerCreativeTabs();
		WeaponryLootTableModifiers.modifyLootTables();

		FabricLoader.getInstance().getModContainer(Weaponry.MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(Weaponry.MOD_ID,"cheaper_trims"), modContainer,
						Component.translatable("text.weaponry.cheaper_trims"), PackActivationType.DEFAULT_ENABLED));
	}
}