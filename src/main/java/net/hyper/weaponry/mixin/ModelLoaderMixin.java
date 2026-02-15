package net.hyper.weaponry.mixin;

import net.hyper.weaponry.Weaponry;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1))
    private void onInit(CallbackInfo ci) {
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "wooden_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "stone_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "copper_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "iron_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "golden_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "diamond_greatsword_gui")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "netherite_greatsword_gui")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "wooden_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "stone_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "copper_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "iron_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "golden_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "diamond_greatsword_left")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "netherite_greatsword_left")));
    }
}