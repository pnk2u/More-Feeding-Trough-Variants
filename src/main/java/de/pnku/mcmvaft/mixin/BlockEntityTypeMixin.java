package de.pnku.mcmvaft.mixin;

import de.pnku.mcmvaft.block.MoreFeedingTroughBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import slexom.animal_feeding_trough.platform.common.AnimalFeedingTroughMod;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {
    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void isValid(BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
        if (AnimalFeedingTroughMod.FEEDING_TROUGH_BLOCK_ENTITY.get().equals(this) && blockState.getBlock() instanceof MoreFeedingTroughBlock) {
            cir.setReturnValue(true);
        }
    }
}