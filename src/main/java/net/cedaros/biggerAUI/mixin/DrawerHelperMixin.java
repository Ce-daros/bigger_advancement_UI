package net.cedaros.biggerAUI.mixin;

import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.client.gui.DrawableHelper.drawTexture;

@Mixin(DrawableHelper.class)
public abstract class DrawerHelperMixin {


	@Inject(method = "drawTexture(Lnet/minecraft/client/util/math/MatrixStack;IIIIII)V",at = @At("HEAD"), cancellable = true)

	public void inject(MatrixStack matrices, int x, int y, int u, int v, int width, int height, CallbackInfo ci) {
		if(height==292){

			drawTexture(matrices, x, y, ((DrawableHelper) (Object) this).getZOffset(), (float) u, (float) v, width, height, 292, 500);
		}
		else{
			drawTexture(matrices, x, y, ((DrawableHelper) (Object) this).getZOffset(), (float)u, (float)v, width, height, 256, 256);
		}
		ci.cancel();
	}

}
