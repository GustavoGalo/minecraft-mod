package com.examplemod;

import com.examplemod.block.Blocks;
import com.examplemod.item.Items;
import com.examplemod.item.commonIron.CommonIronIngot;
import com.examplemod.util.Recorder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;

public class ExampleMod implements ModInitializer {

	public static final String MOD_ID = "examplemod";
    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "group"), () -> new ItemStack(CommonIronIngot.INSTANCE));

	@Override
	public void onInitialize() {

		Items.registerAll();
		Blocks.registerAll();
		Recorder.attributes();
		GeckoLib.initialize();
	}
}
