package net.cedaros.biggerAUI.mixin;

import net.minecraft.client.gui.screen.advancement.AdvancementsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
@Mixin(AdvancementsScreen.class)
public abstract class AdvancementScreenMixin {



	private static final int W_WIDTH = 292;
	private static final int W_HEIGHT = 500;
	@ModifyConstant(method = "drawWidgets", constant = @Constant(intValue = 252))
	private int injected_1(int value) {
		return W_HEIGHT;
	}
	@ModifyConstant(method = "drawWidgets", constant = @Constant(intValue = 140))
	private int injected_2(int value) {
		return W_WIDTH;
	}

	@ModifyConstant(method = "render", constant = @Constant(intValue = 252))
	private int injected_3(int value) {
		return W_HEIGHT;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 140))
	private int injected_4(int value) {
		return W_WIDTH;
	}

	@ModifyConstant(method = "drawAdvancementTree", constant = @Constant(intValue = 234))
	private int injected_7(int value) {
		return W_HEIGHT - 5;
	}
	@ModifyConstant(method = "drawAdvancementTree", constant = @Constant(intValue = 113))
	private int injected_8(int value) {
		return W_WIDTH - 9;
	}

	@ModifyConstant(method = "drawAdvancementTree", constant = @Constant(intValue = 9))
	private int injected_a(int value) {
		return 1;
	}
	@ModifyConstant(method = "drawAdvancementTree", constant = @Constant(intValue = 18))
	private int injected_b(int value) {
		return 5;
	}

	@ModifyConstant(method = "mouseClicked", constant = @Constant(intValue = 252))
	private int injected_5(int value) {
		return W_HEIGHT;
	}
	@ModifyConstant(method = "mouseClicked", constant = @Constant(intValue = 140))
	private int injected_6(int value) {
		return W_WIDTH;
	}

}

