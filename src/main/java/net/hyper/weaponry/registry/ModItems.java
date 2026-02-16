package net.hyper.weaponry.registry;

import net.hyper.weaponry.Weaponry;
import net.hyper.weaponry.item.GreatswordItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Greatswords
    public static final Item WOODEN_GREATSWORD = registerItem("wooden_greatsword",
            new GreatswordItem(ToolMaterials.WOOD, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.WOOD, 4, -3.2f, 0.75f))));
    public static final Item STONE_GREATSWORD = registerItem("stone_greatsword",
            new GreatswordItem(ToolMaterials.STONE, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.STONE, 4, -3.2f, 0.75f))));
    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",
            new GreatswordItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.IRON, 5, -3.1f, 0.75f))));
    public static final Item GOLDEN_GREATSWORD = registerItem("golden_greatsword",
            new GreatswordItem(ToolMaterials.GOLD, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -3.2f, 0.75f))));
    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",
            new GreatswordItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -3.1f, 0.75f))));
    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",
            new GreatswordItem(ToolMaterials.NETHERITE, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -3.1f, 0.75f))));

    public static final Item NETHERITE_HORSE_ARMOR = registerVanillaItem("netherite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.NETHERITE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, Identifier.of(Weaponry.MOD_ID, name), item);
    }

    private static Item registerVanillaItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.ofVanilla(name), item);
    }

    public static void registerModItems() {
        Weaponry.LOGGER.info("Registering Items for " + Weaponry.MOD_ID);
    }
}