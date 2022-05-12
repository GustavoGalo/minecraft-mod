package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class CommonIronAxe extends AxeItem {

    public static final CommonIronAxe INSTANCE = new CommonIronAxe(CommonIronToolMaterial.INSTANCE, 5.0F, 5.0F, Items.SETTINGS.apply(1));

    private CommonIronAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackDamage, settings);
    }

 }
