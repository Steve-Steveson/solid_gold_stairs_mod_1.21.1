package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.WeatheringCopper;

public class UncutWeatheringCopperSlabBlock extends SlabBlock implements WeatheringCopper, SteveHasWeatheringCopper {
    public UncutWeatheringCopperSlabBlock(Properties properties) {
        super(properties);
    }

    @Override
    public WeatherState getAge() {
        return null;
    }
}
