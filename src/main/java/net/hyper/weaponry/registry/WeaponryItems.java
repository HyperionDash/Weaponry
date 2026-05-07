package net.hyper.weaponry.registry;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.hyper.weaponry.Weaponry;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.AttackRange;
import net.minecraft.world.item.component.BlocksAttacks;

import java.util.List;
import java.util.Optional;
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

    //public static final Item NETHERITE_SHIELD = registerItem("netherite_shield",
    //        setting -> new Item(setting.durability(779).repairable(Items.NETHERITE_INGOT).equippableUnswappable(EquipmentSlot.OFFHAND).component(DataComponents.BREAK_SOUND, SoundEvents.SHIELD_BREAK)
    //                .delayedComponent(DataComponents.BLOCKS_ATTACKS,context -> new BlocksAttacks(0.25F, 1.0F, List.of(new BlocksAttacks.DamageReduction(90.0F, Optional.empty(), 0.0F, 1.0F)), new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F), Optional.of(context.getOrThrow(DamageTypeTags.BYPASSES_SHIELD)), Optional.of(SoundEvents.SHIELD_BLOCK), Optional.of(SoundEvents.SHIELD_BREAK)))));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, name)))));
    }
    public static void init() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(WOODEN_GREATSWORD, 200);
        });
    }
}