package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;

public class CommonIronNugget extends Item {

    public static final CommonIronNugget INSTANCE = new CommonIronNugget(Items.SETTINGS.apply(64));

    private CommonIronNugget(Settings settings) {
        super(settings);
    }

}
