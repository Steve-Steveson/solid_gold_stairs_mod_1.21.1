package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.steveson.solidgoldstairs.util.ModTags;
import org.jetbrains.annotations.Nullable;

public class PoweredStairBlock extends StairBlock {
    public PoweredStairBlock(BlockState baseState, Properties properties) {
        super(baseState, properties);
    }

    // Needs to be true for getDirectSignal to work. Is not directional.
    @Override
    protected boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (state.getValue(HALF) == Half.TOP) {
            if (direction == Direction.UP && level.getBlockState(pos.below()).is(ModTags.Blocks.LOW_REDSTONE_COMPONENTS)){
                return 0;
            }
            if (state.getValue(FACING) == direction){
                if (!level.getBlockState(pos.relative(state.getValue(FACING).getOpposite())).is(ModTags.Blocks.LOW_REDSTONE_COMPONENTS)) {
                    return 11;
                }
                return 0;
            }
            if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                if (state.getValue(FACING).getCounterClockWise() == direction){
                    if (!level.getBlockState(pos.relative(state.getValue(FACING).getClockWise())).is(ModTags.Blocks.LOW_REDSTONE_COMPONENTS)) {
                        return 11;
                    }
                    return 0;
                }
            }
            if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                if (state.getValue(FACING).getClockWise() == direction){
                    if (!level.getBlockState(pos.relative(state.getValue(FACING).getCounterClockWise())).is(ModTags.Blocks.LOW_REDSTONE_COMPONENTS)) {
                        return 11;
                    }
                    return 0;
                }
            }
        }
        return 11;
    }

    // Allow it to affect the sides of comparators, but needs to be limited to only comparators, or it will power things through solid blocks
    @Override
    protected int getDirectSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (level.getBlockState(pos.relative(direction.getOpposite())).getBlock() == Blocks.COMPARATOR){
            if (state.getValue(HALF) == Half.TOP) {
                if (state.getValue(FACING) == direction){
                    return 0;
                }
                if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    if (state.getValue(FACING).getCounterClockWise() == direction){
                        return 0;
                    }
                }
                if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    if (state.getValue(FACING).getClockWise() == direction){
                        return 0;
                    }
                }
            }
            return 11;
        }
        return 0;
    }

    // Takes priority over isSignalSource. Needs to default to false and selectively enable by direction,
    // or it will connect to dust diagonally up or down like a staircase.
    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        if (state.getValue(FACING).getOpposite() == direction){
            return true;
        }
        if (state.getValue(FACING) == direction && state.getValue(HALF) == Half.BOTTOM){
            return true;
        }
        if (state.getValue(FACING).getCounterClockWise() == direction){
            if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT && state.getValue(HALF) == Half.TOP) {
                return false;
            }
            return true;
        }
        if (state.getValue(FACING).getClockWise() == direction){
            if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT && state.getValue(HALF) == Half.TOP) {
                return false;
            }
            return true;
        }
        return false;
    }
}
