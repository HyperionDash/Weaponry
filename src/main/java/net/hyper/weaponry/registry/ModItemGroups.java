package net.hyper.weaponry.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hyper.weaponry.Weaponry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup WEAPONRY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Weaponry.MOD_ID, "test"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DIAMOND_GREATSWORD))
                    .displayName(Text.translatable("itemgroup.weaponry.weaponry"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_GREATSWORD);
                        entries.add(ModItems.STONE_GREATSWORD);
                        entries.add(ModItems.COPPER_GREATSWORD);
                        entries.add(ModItems.IRON_GREATSWORD);
                        entries.add(ModItems.GOLDEN_GREATSWORD);
                        entries.add(ModItems.DIAMOND_GREATSWORD);
                        entries.add(ModItems.NETHERITE_GREATSWORD);
                    }).build());

    public static void registerItemGroups() {
        Weaponry.LOGGER.info("Registering Item Groups for " + Weaponry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.NETHERITE_SWORD,
                    ModItems.WOODEN_GREATSWORD,
                    ModItems.STONE_GREATSWORD,
                    ModItems.COPPER_GREATSWORD,
                    ModItems.IRON_GREATSWORD,
                    ModItems.GOLDEN_GREATSWORD,
                    ModItems.DIAMOND_GREATSWORD,
                    ModItems.NETHERITE_GREATSWORD);

            entries.addAfter(Items.LEATHER_BOOTS,
                    ModItems.COPPER_HELMET,
                    ModItems.COPPER_CHESTPLATE,
                    ModItems.COPPER_LEGGINGS,
                    ModItems.COPPER_BOOTS);

            entries.addAfter(Items.STONE_SWORD,
                    ModItems.COPPER_SWORD);

            entries.addAfter(Items.STONE_AXE,
                    ModItems.COPPER_AXE);

            entries.addAfter(Items.LEATHER_HORSE_ARMOR,
                    ModItems.COPPER_HORSE_ARMOR);

            entries.addAfter(Items.DIAMOND_HORSE_ARMOR,
                    ModItems.NETHERITE_HORSE_ARMOR);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.STONE_HOE,
                    ModItems.COPPER_SHOVEL,
                    ModItems.COPPER_PICKAXE,
                    ModItems.COPPER_AXE,
                    ModItems.COPPER_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.IRON_NUGGET, ModItems.COPPER_NUGGET);
        });
    }
}
