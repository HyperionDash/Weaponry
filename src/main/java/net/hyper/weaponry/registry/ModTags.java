package net.hyper.weaponry.registry;

import net.hyper.weaponry.Weaponry;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> GREATSWORDS = createTag("greatswords");
        public static final TagKey<Item> OFFHAND_WHITELIST = createTag("offhand_whitelist");
        public static final TagKey<Item> DUAL_HANDED_WEAPONS = createTag("dual_handed_weapons");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Weaponry.MOD_ID, name));
        }
    }
}