package net.hyper.weaponry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hyper.weaponry.Weaponry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
                        entries.add(ModItems.IRON_GREATSWORD);
                        entries.add(ModItems.GOLDEN_GREATSWORD);
                        entries.add(ModItems.DIAMOND_GREATSWORD);
                        entries.add(ModItems.NETHERITE_GREATSWORD);
                    }).build());

    public static void registerItemGroups() {
        Weaponry.LOGGER.info("Registering Item Groups for " + Weaponry.MOD_ID);
    }
}
