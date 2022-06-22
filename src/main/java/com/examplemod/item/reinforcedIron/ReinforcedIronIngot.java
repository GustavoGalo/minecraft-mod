package com.examplemod.item.reinforcedIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class ReinforcedIronIngot extends Item {

    public static final ReinforcedIronIngot INSTANCE = new ReinforcedIronIngot(Items.SETTINGS.apply(64).rarity(Rarity.EPIC));

    private ReinforcedIronIngot(Settings settings) {
        super(settings);
    }

}
