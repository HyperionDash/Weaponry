package net.hyper.weaponry;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hyper.weaponry.datagen.*;

public class WeaponryDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(WeaponryItemTagGen::new);
		pack.addProvider(WeaponryLangGen::new);
		pack.addProvider(WeaponryRecipeGen::new);
	}
}