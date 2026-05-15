package net.steveson.solidgoldstairs;

import net.minecraft.world.item.CreativeModeTabs;
import net.steveson.solidgoldstairs.block.ModBlocks;
import net.steveson.solidgoldstairs.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(SolidGoldStairsMod.MOD_ID)
public class SolidGoldStairsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "solid_gold_stairs";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public SolidGoldStairsMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.COAL_STAIRS);
            event.accept(ModBlocks.COAL_SLAB);
            event.accept(ModBlocks.IRON_STAIRS);
            event.accept(ModBlocks.IRON_SLAB);
            event.accept(ModBlocks.GOLD_STAIRS);
            event.accept(ModBlocks.GOLD_SLAB);
            event.accept(ModBlocks.REDSTONE_STAIRS);
            event.accept(ModBlocks.REDSTONE_SLAB);
            event.accept(ModBlocks.EMERALD_STAIRS);
            event.accept(ModBlocks.EMERALD_SLAB);
            event.accept(ModBlocks.LAPIS_STAIRS);
            event.accept(ModBlocks.LAPIS_SLAB);
            event.accept(ModBlocks.DIAMOND_STAIRS);
            event.accept(ModBlocks.DIAMOND_SLAB);
            event.accept(ModBlocks.NETHERITE_STAIRS);
            event.accept(ModBlocks.NETHERITE_SLAB);
            event.accept(ModBlocks.CHISELED_QUARTZ_STAIRS);
            event.accept(ModBlocks.CHISELED_QUARTZ_SLAB);
            event.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.AMETHYST_STAIRS);
            event.accept(ModBlocks.AMETHYST_SLAB);

            event.accept(ModBlocks.COPPER_STAIRS);
            event.accept(ModBlocks.COPPER_SLAB);
            event.accept(ModBlocks.EXPOSED_COPPER_STAIRS);
            event.accept(ModBlocks.EXPOSED_COPPER_SLAB);
            event.accept(ModBlocks.WEATHERED_COPPER_STAIRS);
            event.accept(ModBlocks.WEATHERED_COPPER_SLAB);
            event.accept(ModBlocks.OXIDIZED_COPPER_STAIRS);
            event.accept(ModBlocks.OXIDIZED_COPPER_SLAB);

            event.accept(ModBlocks.WAXED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_EXPOSED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_EXPOSED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_WEATHERED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_WEATHERED_COPPER_SLAB);
            event.accept(ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
            event.accept(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB);
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.REDSTONE_STAIRS);
            event.accept(ModBlocks.REDSTONE_SLAB);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
