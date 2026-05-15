package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.steveson.solidgoldstairs.util.ModTags;

public class PoweredSlabBlock extends SlabBlock {
    public PoweredSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isSignalSource(BlockState state) {
        return state.getValue(TYPE) != SlabType.TOP;
    }

    // Allow it to affect the sides of comparators, but needs to be limited to only comparators, or it will power things through solid blocks
    @Override
    protected int getDirectSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if(state.getValue(TYPE) == SlabType.DOUBLE && level.getBlockState(pos.relative(direction.getOpposite())).getBlock() == Blocks.COMPARATOR) {
            return 15;
        }
        if(state.getValue(TYPE) == SlabType.BOTTOM&& level.getBlockState(pos.relative(direction.getOpposite())).getBlock() == Blocks.COMPARATOR) {
            return 7;
        }
        return 0;
    }

    @Override
    protected int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if(state.getValue(TYPE) == SlabType.DOUBLE) {
            return 15;
        }
        if(state.getValue(TYPE) == SlabType.BOTTOM && direction != Direction.DOWN) {
            return 7;
        }
        if(state.getValue(TYPE) == SlabType.TOP) {
            if (direction == Direction.DOWN) {
                return 7;
            }
            if(!level.getBlockState(pos.relative(direction.getOpposite())).is(ModTags.Blocks.LOW_REDSTONE_COMPONENTS)) {
                return 7;
            }
        }
        return 0;
    }
}
