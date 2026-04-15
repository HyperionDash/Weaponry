package net.hyper.weaponry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class WeaponryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(Weaponry.MOD_ID).ifPresent(modContainer ->
                ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(Weaponry.MOD_ID,"improved_spears"), modContainer,
                        Component.translatable("text.weaponry.improved_spears"), PackActivationType.DEFAULT_ENABLED));
    }
}