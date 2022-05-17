package com.examplemod.block;

import com.examplemod.block.commonIron.*;
import com.examplemod.block.reinforcedIron.*;
import java.util.function.Function;
import com.examplemod.ExampleMod;
import com.examplemod.item.Items;
import com.examplemod.util.Logger;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Function<Float, FabricBlockSettings> SETTINGS = x -> FabricBlockSettings.of(Material.METAL).strength(x).requiresTool();

    private static void registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), new BlockItem(block, Items.SETTINGS.apply(1)));
    }

    public static void registerAll() {
        registerBlock("common_iron_block", CommonIronBlock.INSTANCE);
        registerBlock("heated_reinforced_iron_block", HeatedReinforcedIronBlock.INSTANCE);
        registerBlock("raw_reinforced_iron_block", RawReinforcedIronBlock.INSTANCE);
        registerBlock("reinforced_iron_block", ReinforcedIronBlock.INSTANCE);

        Logger.loaded(Blocks.class.getSimpleName());
    }

}
