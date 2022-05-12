package com.examplemod.events;

import com.examplemod.item.reinforcedIron.ReinforcedIronIngot;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.TypedActionResult;

public class ThunderRain {

    public static void initialize() {
        UseItemCallback.EVENT.register((player, world, unused) -> {

            ItemStack mainHandItem = player.getMainHandStack();

            if (mainHandItem.getItem() instanceof ReinforcedIronIngot) {
                LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
                
                lightning.setPosition(player.getPos());
                world.spawnEntity(lightning);
            }
            
            return TypedActionResult.success(mainHandItem, true);
        });
    }
    
}
