package de.pnku.mcmvaft.mixin;

import de.pnku.mcmvaft.block.MoreFeedingTroughBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @Unique
    private BlockEntityType<?> thisfeedingTroughBlockEntityType = (BlockEntityType<?>)(Object)this;

    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void isValid(BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
        if (BlockEntityType.getKey(thisfeedingTroughBlockEntityType).compareTo(Identifier.tryBuild("animal_feeding_trough", "feeding_trough")) == 0 && blockState.getBlock() instanceof MoreFeedingTroughBlock) {
            cir.setReturnValue(true);
        }
    }
}