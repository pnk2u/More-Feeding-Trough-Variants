package de.pnku.mcmvaft;

import de.pnku.mcmvaft.init.McmvaftBlockInit;
import de.pnku.mcmvaft.init.McmvaftItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFeedingTroughVariants implements ModInitializer {
    public static final String MODID = "lolmcmv-aft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("animal_feeding_trough")) {
            LOGGER.info("Found Animal Feeding Trough, registering variants.");
        }
        McmvaftBlockInit.registerBlocks();
        McmvaftItemInit.registerItems();
        ServerLifecycleEvents.SERVER_STARTING.register(server -> McmvaftBlockInit.addSupportedBlocksToBlockEntityType());
    }

    public static ResourceLocation withModId(String path) {
        return ResourceLocation.tryBuild(MODID, path);
    }

}