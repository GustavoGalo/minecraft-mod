package com.examplemod.block.commonIron;

import com.examplemod.block.Blocks;
import net.minecraft.block.Block;

public class CommonIronBlock extends Block {

    public static final CommonIronBlock INSTANCE = new CommonIronBlock(Blocks.SETTINGS.apply(6f));

    public CommonIronBlock(Settings settings) {
        super(settings);
    }
    
}
