package net.hyper.weaponry.registry;

import net.hyper.weaponry.Weaponry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_COPPER = registerReference("weaponry.item.armor.equip_copper");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Weaponry.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(Weaponry.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Weaponry.LOGGER.info("Registering Mod Sounds for " + Weaponry.MOD_ID);
    }
}