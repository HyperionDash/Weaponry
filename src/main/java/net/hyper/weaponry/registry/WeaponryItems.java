package net.hyper.weaponry.registry;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.hyper.weaponry.Weaponry;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.AttackRange;

import java.util.function.Function;

public class WeaponryItems {
    public static final Item WOODEN_GREATSWORD = registerItem("wooden_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 4F, -3.2F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item STONE_GREATSWORD = registerItem("stone_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 4F, -3.2F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item COPPER_GREATSWORD = registerItem("copper_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 4F, -3.2F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 5F, -3.1F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item GOLDEN_GREATSWORD = registerItem("golden_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 4F, -3.1F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 5F, -3.1F)
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));
    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 5F, -3.1F).fireResistant()
                    .component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.75F, 0.0F, 5.75F, 0.3F, 1F))));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, name)))));
    }
    public static void registerItems() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(WOODEN_GREATSWORD, 200);
        });
    }
}