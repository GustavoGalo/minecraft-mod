package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class CommonIronShovel extends ShovelItem {

    public static final CommonIronShovel INSTANCE = new CommonIronShovel(CommonIronToolMaterial.INSTANCE, 5, 5.0F, Items.SETTINGS.apply(1));

    private CommonIronShovel(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

}
