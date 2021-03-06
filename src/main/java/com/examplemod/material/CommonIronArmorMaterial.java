package com.examplemod.material;

import com.examplemod.item.commonIron.CommonIronIngot;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CommonIronArmorMaterial implements ArmorMaterial {
    
    private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };
    private static final int[] PROTECTION_VALUES = new int[] { 2, 4, 6, 2 };

    public static CommonIronArmorMaterial INSTANCE = new CommonIronArmorMaterial();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 1;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CommonIronIngot.INSTANCE);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "nseiquenomecolocar";
    }

    @Override
    public float getToughness() {
        return 5.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
