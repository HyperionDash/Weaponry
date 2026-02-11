package net.hyper.weaponry;

import net.fabricmc.api.ModInitializer;

import net.hyper.weaponry.item.ModItemGroups;
import net.hyper.weaponry.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Weaponry implements ModInitializer {
	public static final String MOD_ID = "weaponry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}