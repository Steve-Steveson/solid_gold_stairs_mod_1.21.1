package net.steveson.solidgoldstairs.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> LOW_REDSTONE_COMPONENTS = createTag("low_redstone_components");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SolidGoldStairsMod.MOD_ID, name));
        }
    }
}
