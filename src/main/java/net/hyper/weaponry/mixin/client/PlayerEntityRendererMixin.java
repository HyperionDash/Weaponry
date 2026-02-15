package net.hyper.weaponry.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.hyper.weaponry.util.ModTags;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntityRenderer.class)
@Environment(EnvType.CLIENT)
public class PlayerEntityRendererMixin {
    @Inject(method = "getArmPose", at = @At("TAIL"), cancellable = true)
    private static void customArmPose(AbstractClientPlayerEntity player, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> cir) {
        if (player.getStackInHand(Hand.MAIN_HAND).isIn(ModTags.Items.DUAL_HANDED_WEAPONS))
            cir.setReturnValue(BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
    }
}