package com.examplemod;

import com.examplemod.entity.Entities;
import net.fabricmc.api.ClientModInitializer;

public class ExampleClientMod implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		Entities.registerAll();
	}

}
