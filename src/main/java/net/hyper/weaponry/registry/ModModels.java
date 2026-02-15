package net.hyper.weaponry.registry;

import java.util.Optional;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

public class ModModels {
    public static final Model GREATSWORD = item("template_greatsword_right", TextureKey.LAYER0);

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of("weaponry:item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
