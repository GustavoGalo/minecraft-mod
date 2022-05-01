package net.fabricmc.example;

import items.*;
import net.fabricmc.api.ModInitializer;


public class ExampleMod implements ModInitializer {

	@Override
	public void onInitialize() {
		CommonIronIngot.INSTANCE.register();

		CommonIronHoe.INSTANCE.register();
		CommonIronAxe.INSTANCE.register();
		CommonIronSword.INSTANCE.register();
		CommonIronShovel.INSTANCE.register();
		CommonIronPickaxe.INSTANCE.register();

		CommonIronBoots.INSTANCE.register();

//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_boots"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_chestplate"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_door"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_helmet"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_horse_armor"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_leggings"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_nugget"), COMMON_ITEM);
//		Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_raw_iron"), COMMON_ITEM);
	}
}
