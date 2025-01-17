package xyz.ashyboxy.boxes.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleClientMixin {
	@Inject(at = @At("HEAD"), method = "run")
	private void run(CallbackInfo info) {
		// and here we run in the client's run method
	}
}
