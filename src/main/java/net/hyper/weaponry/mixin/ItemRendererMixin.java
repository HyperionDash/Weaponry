package net.hyper.weaponry.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.hyper.weaponry.Weaponry;
import net.hyper.weaponry.registry.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Shadow
    @Final
    private ItemModels models;

    @Shadow
    public abstract ItemModels getModels();

    @Shadow
    @Final
    private MinecraftClient client;

    @ModifyVariable(
            method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V",
            at = @At(value = "HEAD"),
            argsOnly = true
    )
    public BakedModel renderItem(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack, @Local(argsOnly = true) ModelTransformationMode renderMode) {
        if (stack.getItem() == ModItems.WOODEN_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "wooden_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.STONE_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "stone_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.COPPER_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "copper_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.IRON_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "iron_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.GOLDEN_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "golden_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.DIAMOND_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "diamond_greatsword_gui")));
        }
        if (stack.getItem() == ModItems.NETHERITE_GREATSWORD && (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED)) {
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "netherite_greatsword_gui")));
        }

        return bakedModel;
    }

    @ModifyVariable(
            method = "getModel",
            at = @At(value = "STORE"),
            ordinal = 1
    )
    public BakedModel getHeldItemModelMixin(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack) {
        if (stack.getItem() == ModItems.WOODEN_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "wooden_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "wooden_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.STONE_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "stone_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "stone_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.COPPER_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "copper_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "copper_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.IRON_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "iron_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "iron_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.GOLDEN_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "golden_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "golden_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.DIAMOND_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "diamond_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "diamond_greatsword_left")));
            }
        }
        if (stack.getItem() == ModItems.NETHERITE_GREATSWORD) {
            if (client.player.getMainArm() == Arm.RIGHT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "netherite_greatsword")));
            }
            else if (client.player.getMainArm() == Arm.LEFT) {
                return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Weaponry.MOD_ID, "netherite_greatsword_left")));
            }
        }

        return bakedModel;
    }
}