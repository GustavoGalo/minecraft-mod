package com.examplemod.item.spawnEgg;

import com.examplemod.entity.Entities;
import com.examplemod.item.Items;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.SpawnEggItem;

public class RaccoonSpawnEgg extends SpawnEggItem {

    public static final RaccoonSpawnEgg INSTANCE = new RaccoonSpawnEgg(Entities.RACCOON, 0x948e8d, 0x3b3635, Items.SETTINGS.apply(64));

    public RaccoonSpawnEgg(EntityType<? extends MobEntity> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }
    
}
