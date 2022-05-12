package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class CommonIronHoe extends HoeItem {

    public static final CommonIronHoe INSTANCE = new CommonIronHoe(CommonIronToolMaterial.INSTANCE, 5, 5.0F, Items.SETTINGS.apply(1));

    private CommonIronHoe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

}
