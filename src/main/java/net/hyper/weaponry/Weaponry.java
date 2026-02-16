package net.hyper.weaponry;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.hyper.weaponry.registry.ModItemGroups;
import net.hyper.weaponry.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Weaponry implements ModInitializer {
	public static final String MOD_ID = "weaponry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		FuelRegistry.INSTANCE.add(ModItems.WOODEN_GREATSWORD, 200);
	}
}