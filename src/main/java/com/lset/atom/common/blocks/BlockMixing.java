//package com.lset.atom.common.blocks;
//
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.Direction;
//import net.minecraft.world.World;
//
//public class BlockMixing {
//    // Метод для проверки соседних блоков и выполнения смешивания
//    public static void tryMixBlocks(World world, BlockPos pos){
//        // Получаем блок в текущей позиции
//        BlockState blockState = world.getBlockState(pos);
//
//        // Проверка соседних блоков
//        for (Direction direction : Direction.values()){
//            BlockPos neighborPos = pos.offset(direction);
//            BlockState neighborBlockState = world.getBlockState(neighborPos);
//
//            // Пример: если рядом находится песок и глина, создаем новый блок
//            if (blockState.isOf(Blocks.SAND) && neighborBlockState.isOf(Blocks.CLAY)) {
//                //         Первый блок^                            Второй блок^
//                world.setBlockState(pos,Blocks.GREEN_CONCRETE.getDefaultState());
//                //         блок при смешивании^
//            }
//        }
//    }
//}
