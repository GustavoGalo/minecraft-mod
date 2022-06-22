package com.examplemod.block;

import com.examplemod.block.commonIron.*;
import com.examplemod.block.reinforcedIron.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.examplemod.ExampleMod;
import com.examplemod.item.Items;
import com.examplemod.util.Logger;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Function<Float, FabricBlockSettings> SETTINGS = x -> FabricBlockSettings.of(Material.METAL).strength(x).requiresTool();

    private static void registerBlock(String name, Block block) {
        registerBlock(name, block, x -> x);
    }
    private static void registerBlock(String name, Block block, Rarity rarity) {
        registerBlock(name, block, x -> x.rarity(rarity));
    }
    private static void registerBlock(String name, Block block, UnaryOperator<FabricItemSettings> props) {
        registerBlockItem(name, block, props);

        Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, UnaryOperator<FabricItemSettings> props) {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), new BlockItem(block, props.apply(Items.SETTINGS.apply(1))));
    }

    public static void registerAll() {
        registerBlock("common_iron_block", CommonIronBlock.INSTANCE);
        registerBlock("heated_reinforced_iron_block", HeatedReinforcedIronBlock.INSTANCE);
        registerBlock("raw_reinforced_iron_block", RawReinforcedIronBlock.INSTANCE);
        registerBlock("reinforced_iron_block", ReinforcedIronBlock.INSTANCE, Rarity.EPIC);

        Logger.loaded(Blocks.class.getSimpleName());
    }

}
