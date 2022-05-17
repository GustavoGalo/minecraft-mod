package com.examplemod.event;

import com.examplemod.event.custom.ThunderRain;
import com.examplemod.util.Logger;

public class Events {
    
    public static void registerAll() {
        ThunderRain.initialize();

        Logger.loaded(Events.class.getSimpleName());
    }

}
