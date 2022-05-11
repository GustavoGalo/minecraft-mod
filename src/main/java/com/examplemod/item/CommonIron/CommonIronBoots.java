package com.examplemod.item.commonIron;

import com.examplemod.item.Items;
import com.examplemod.material.CommonIronArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class CommonIronBoots extends ArmorItem {

    public static final CommonIronBoots INSTANCE = new CommonIronBoots(CommonIronArmorMaterial.INSTANCE, EquipmentSlot.FEET, Items.SETTINGS);

    private CommonIronBoots(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Item.Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }

}
