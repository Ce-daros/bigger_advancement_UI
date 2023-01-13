package net.cedaros.biggerAUI.mixin;

import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(AdvancementTab.class)
public abstract class NoMaskMixin {


	@ModifyArgs(method = "drawWidgetTooltip",at = @At(value = "INVOKE",target = "Lnet/minecraft/client/gui/screen/advancement/AdvancementTab;fill(Lnet/minecraft/client/util/math/MatrixStack;IIIII)V"))
	private void injected(Args args) {
		args.set(3, 1);
		args.set(4, 1);
	}

}
