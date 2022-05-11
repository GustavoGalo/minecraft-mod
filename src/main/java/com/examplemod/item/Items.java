package com.examplemod.item;

import com.examplemod.ExampleMod;
import com.examplemod.item.commonIron.*;
import com.examplemod.item.spawnEgg.RaccoonSpawnEgg;
import com.examplemod.util.Logger;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final FabricItemSettings SETTINGS = new FabricItemSettings().group(ExampleMod.MOD_GROUP);
    
    private static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerAll() {
		registerItem("common_iron_axe", CommonIronAxe.INSTANCE);
		registerItem("common_iron_boots", CommonIronBoots.INSTANCE);
		registerItem("common_iron_hoe", CommonIronHoe.INSTANCE);
		registerItem("common_iron_ingot", CommonIronIngot.INSTANCE);
		registerItem("common_iron_pickaxe", CommonIronPickaxe.INSTANCE);
		registerItem("common_iron_shovel", CommonIronShovel.INSTANCE);
		registerItem("common_iron_sword", CommonIronSword.INSTANCE);
		registerItem("raccoon_spawn_egg", RaccoonSpawnEgg.INSTANCE);
        
		Logger.loaded(Items.class.getName());
    }

}
