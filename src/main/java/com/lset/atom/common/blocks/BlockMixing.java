package com.lset.atom.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BlockMixing {
    public static void tryMixBlocks(World world, BlockPos pos){
        BlockState blockState = world.getBlockState(pos);

        for (Direction direction : Direction.values()){
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborBlockState = world.getBlockState(neighborPos);

            if (blockState.isOf(Blocks.SAND) && neighborBlockState.isOf(Blocks.CLAY)) {
                world.setBlockState(pos,Blocks.GREEN_CONCRETE.getDefaultState());
            }
        }
    }
}
