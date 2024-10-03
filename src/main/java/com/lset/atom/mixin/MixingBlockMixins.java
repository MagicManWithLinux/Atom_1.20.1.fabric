package com.lset.atom.mixin;

import com.lset.atom.common.blocks.BlockMixing;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class MixingBlockMixins {
    @Inject(method = "setBlockState",at = @At("RETURN"))
    private void onBlockSet(BlockPos pos, BlockState state, int flags, CallbackInfoReturnable<Boolean>cir){
        BlockMixing.tryMixBlocks((World) (Object)this,pos);
    }

}
