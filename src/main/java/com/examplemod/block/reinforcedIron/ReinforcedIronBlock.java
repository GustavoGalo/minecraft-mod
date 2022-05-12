package com.examplemod.block.reinforcedIron;

import com.examplemod.block.Blocks;
import net.minecraft.block.Block;

public class ReinforcedIronBlock extends Block {

    public static final ReinforcedIronBlock INSTANCE = new ReinforcedIronBlock(Blocks.SETTINGS.apply(18f));

    public ReinforcedIronBlock(Settings settings) {
        super(settings);
    }
    
}
