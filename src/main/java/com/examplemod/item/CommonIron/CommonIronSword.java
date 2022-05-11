package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronToolMaterial;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CommonIronSword extends SwordItem {

    public static final CommonIronSword INSTANCE = new CommonIronSword(CommonIronToolMaterial.INSTANCE, 5, 5.0F, Items.SETTINGS);

    private CommonIronSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

}
