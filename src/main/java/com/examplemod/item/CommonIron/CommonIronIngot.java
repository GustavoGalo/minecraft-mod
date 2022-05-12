package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;

public class CommonIronIngot extends Item {

    public static final CommonIronIngot INSTANCE = new CommonIronIngot(Items.SETTINGS.apply(64));

    private CommonIronIngot(Settings settings) {
        super(settings);
    }

}
