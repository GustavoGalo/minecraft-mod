package com.examplemod.item.CommonIron;

import com.examplemod.item.Items;
import net.minecraft.item.Item;

public class CommonIronIngot extends Item {

    public static final CommonIronIngot INSTANCE = new CommonIronIngot(Items.SETTINGS);

    private CommonIronIngot(Settings settings) {
        super(settings);
    }

}
