package net.cedaros.biggerAUI.mixin;

import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AdvancementTab.class)
public abstract class AdvancementTabMixin {
	private static final int W_WIDTH = 292;
	private static final int W_HEIGHT = 500;
	@ModifyConstant(method = "render", constant = @Constant(intValue = 234))
	private int injected_3(int value) {
		return W_HEIGHT - 5;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 113))
	private int injected_4(int value) {
		return W_WIDTH - 9;
	}
	@ModifyConstant(method = "drawWidgetTooltip", constant = @Constant(intValue = 234))
	private int injected_1(int value) {
		return W_HEIGHT - 5;
	}
	@ModifyConstant(method = "drawWidgetTooltip", constant = @Constant(intValue = 113))
	private int injected_2(int value) {
		return W_WIDTH - 5;
	}

	@ModifyConstant(method = "render", constant = @Constant(intValue = 4680))
	private int injected_5(int value) {
		return (W_HEIGHT - 5)*20;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 2260))
	private int injected_6(int value) {
		return (W_WIDTH - 9)*20;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 117))
	private int injected_a(int value) {
		return (int) ((W_HEIGHT - 9)/2);
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 15))
	private int injected_c(int value) {
		return 49;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 8))
	private int injected_d(int value) {
		return 27;
	}
	@ModifyConstant(method = "render", constant = @Constant(intValue = 56))
	private int injected_b(int value) {
		return (int) ((W_WIDTH - 9)/2);
	}
	@ModifyConstant(method = "move", constant = @Constant(intValue = 234))
	private int injected_9(int value) {
		return (W_HEIGHT - 5);
	}
	@ModifyConstant(method = "move", constant = @Constant(intValue = 113))
	private int injected_0(int value) {
		return (W_WIDTH - 9);
	}
}
