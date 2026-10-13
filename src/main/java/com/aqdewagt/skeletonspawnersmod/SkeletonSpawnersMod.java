package com.aqdewagt.skeletonspawnersmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkeletonSpawnersMod implements ModInitializer {
    public static final String MOD_ID = "skeletonspawnersmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing SkeletonSpawnersMod");
        // Registration and initialization code will go here
    }

    public void onDisable() {
        LOGGER.info("Disabling SkeletonSpawnersMod");
    }

    public void onStop() {
        LOGGER.info("Stopping SkeletonSpawnersMod");
    }
}