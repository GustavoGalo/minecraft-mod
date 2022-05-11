package com.examplemod.item.spawnEgg;

import com.examplemod.entity.Entities;
import com.examplemod.item.Items;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.SpawnEggItem;

public class RaccoonSpawnEgg extends SpawnEggItem {

    // SETTINGS WITH maxCount
    // Items.SETTINGS.maxCount(1)
    // ERROR
    // Caused by: java.lang.RuntimeException: Unable to have damage AND stack.
    // at net.minecraft.item.Item$Settings.maxCount(Item.java:130)
    // ALTERNATIVE
    // new FabricItemSettings().group(ExampleMod.MOD_GROUP).maxCount(1)
    public static final RaccoonSpawnEgg INSTANCE = new RaccoonSpawnEgg(Entities.RACCOON, 0x948e8d, 0x3b3635, Items.SETTINGS);

    public RaccoonSpawnEgg(EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }
    
}
