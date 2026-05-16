package net.hyper.weaponry;

import net.fabricmc.api.ModInitializer;

import net.hyper.weaponry.registry.*;
import net.hyper.weaponry.util.WeaponryLootTableModifiers;

public class Weaponry implements ModInitializer {
	public static final String MOD_ID = "weaponry";

	@Override
	public void onInitialize() {
		WeaponryItems.init();
		WeaponryCreativeModeTabs.init();
		WeaponryLootTableModifiers.init();
	}
}