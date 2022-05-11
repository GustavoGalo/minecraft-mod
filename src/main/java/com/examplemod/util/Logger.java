package com.examplemod.util;

import org.apache.logging.log4j.LogManager;
import com.examplemod.ExampleMod;

public class Logger {

	private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(ExampleMod.MOD_ID);

    public static void show(String text) {
        LOGGER.info("[" + ExampleMod.MOD_ID + "]: " + text);
    }

    public static void loaded(String className) {
        LOGGER.info("[" + ExampleMod.MOD_ID + "]: All <" + className + "> was loaded");
    }
    
}
