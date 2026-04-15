package net.hyper.weaponry.registry;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.hyper.weaponry.Weaponry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class WeaponryCreativeTabs {
    public static final CreativeModeTab WEAPONRY = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, "weaponry"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(WeaponryItems.NETHERITE_GREATSWORD))
                    .title(Component.translatable("creativetab.weaponry.weaponry"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(WeaponryItems.WOODEN_GREATSWORD);
                        entries.accept(WeaponryItems.STONE_GREATSWORD);
                        entries.accept(WeaponryItems.COPPER_GREATSWORD);
                        entries.accept(WeaponryItems.IRON_GREATSWORD);
                        entries.accept(WeaponryItems.GOLDEN_GREATSWORD);
                        entries.accept(WeaponryItems.DIAMOND_GREATSWORD);
                        entries.accept(WeaponryItems.NETHERITE_GREATSWORD);
                    }).build());

    public static void registerCreativeTabs() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(entries -> {
            entries.insertAfter(Items.NETHERITE_SWORD, WeaponryItems.WOODEN_GREATSWORD,
                    WeaponryItems.STONE_GREATSWORD,
                    WeaponryItems.COPPER_GREATSWORD,
                    WeaponryItems.IRON_GREATSWORD,
                    WeaponryItems.GOLDEN_GREATSWORD,
                    WeaponryItems.DIAMOND_GREATSWORD,
                    WeaponryItems.NETHERITE_GREATSWORD);
        });
    }
}