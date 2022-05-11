package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronToolMaterial;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CommonIronPickaxe extends PickaxeItem {

    public static final CommonIronPickaxe INSTANCE = new CommonIronPickaxe(CommonIronToolMaterial.INSTANCE, 5, 5.0F, Items.SETTINGS);

    private CommonIronPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

}
