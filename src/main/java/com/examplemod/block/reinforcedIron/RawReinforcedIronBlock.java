package com.examplemod.block.reinforcedIron;

import com.examplemod.block.Blocks;
import net.minecraft.block.Block;

public class RawReinforcedIronBlock extends Block {

    public static final RawReinforcedIronBlock INSTANCE = new RawReinforcedIronBlock(Blocks.SETTINGS.apply(12f));

    public RawReinforcedIronBlock(Settings settings) {
        super(settings);
    }
    
}
