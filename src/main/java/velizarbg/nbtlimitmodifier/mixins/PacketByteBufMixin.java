package velizarbg.nbtlimitmodifier.mixins;

import net.minecraft.network.PacketByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import velizarbg.nbtlimitmodifier.NbtLimitModifier;

@Mixin(PacketByteBuf.class)
public class PacketByteBufMixin {
	@ModifyConstant(method = "readNbt()Lnet/minecraft/nbt/NbtCompound;", constant = @Constant(longValue = 2097152L))
	private long modifyLimit(long constant) {
		return NbtLimitModifier.CONFIG.nbtTagMaxBytes;
	}
}
