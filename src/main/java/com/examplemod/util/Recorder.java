package com.examplemod.util;

import com.examplemod.entity.Entities;
import com.examplemod.entity.raccoon.RaccoonEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class Recorder {
    
    public static void attributes() {
        FabricDefaultAttributeRegistry.register(Entities.RACCOON, RaccoonEntity.setAttributes());
    }
}
