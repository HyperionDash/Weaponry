package net.hyper.weaponry.registry;

import net.hyper.weaponry.Weaponry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class WeaponryItemTags {
    public static final TagKey<Item> DUAL_HANDED_WEAPONS = createTag("dual_handed_weapons");
    public static final TagKey<Item> GREATSWORDS = createTag("greatswords");
    public static final TagKey<Item> SHIELDS = createTag("shields");

    private static TagKey<Item> createTag(String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Weaponry.MOD_ID, name));
    }
}