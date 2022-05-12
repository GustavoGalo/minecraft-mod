package com.examplemod.item.refinedIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;

public class RefinedIronIngot extends Item {

    public static final RefinedIronIngot INSTANCE = new RefinedIronIngot(Items.SETTINGS.apply(64));

    private RefinedIronIngot(Settings settings) {
        super(settings);
    }

}
