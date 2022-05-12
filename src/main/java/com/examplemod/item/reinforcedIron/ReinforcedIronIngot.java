package com.examplemod.item.reinforcedIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;

public class ReinforcedIronIngot extends Item {

    public static final ReinforcedIronIngot INSTANCE = new ReinforcedIronIngot(Items.SETTINGS.apply(64));

    private ReinforcedIronIngot(Settings settings) {
        super(settings);
    }

}
