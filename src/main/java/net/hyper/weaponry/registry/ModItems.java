package net.hyper.weaponry.registry;

import net.fabricmc.loader.api.FabricLoader;
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
    public static final Item COPPER_GREATSWORD = registerItem("copper_greatsword",
            new GreatswordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(GreatswordItem.createAttributeModifiers(ModToolMaterials.COPPER, 4, -3.2f, 0.75f))));
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

    // Copper Gear Backport
    public static final Item COPPER_HELMET = registerVanillaItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(11))));
    public static final Item COPPER_CHESTPLATE = registerVanillaItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(11))));
    public static final Item COPPER_LEGGINGS = registerVanillaItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(11))));
    public static final Item COPPER_BOOTS = registerVanillaItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(11))));

    public static final Item COPPER_SWORD = registerVanillaItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4f))));
    public static final Item COPPER_PICKAXE = registerVanillaItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1, -2.8f))));
    public static final Item COPPER_SHOVEL = registerVanillaItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.5f, -3.0f))));
    public static final Item COPPER_AXE = registerVanillaItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 7, -3.2f))));
    public static final Item COPPER_HOE = registerVanillaItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, -1, -2f))));

    public static final Item COPPER_HORSE_ARMOR = registerVanillaItem("copper_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.COPPER, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item NETHERITE_HORSE_ARMOR = registerVanillaItem("netherite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.NETHERITE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    public static final Item COPPER_NUGGET = registerVanillaItem("copper_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, Identifier.of(Weaponry.MOD_ID, name), item);
    }

    private static Item registerVanillaItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.ofVanilla(name), item);
    }

    public static void registerModItems() {
        Weaponry.LOGGER.info("Registering Mod Items for " + Weaponry.MOD_ID);
    }
}