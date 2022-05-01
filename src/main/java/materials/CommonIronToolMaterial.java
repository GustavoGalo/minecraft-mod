package materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CommonIronToolMaterial implements ToolMaterial {

    public int getDurability() { return 500; }

    public float getMiningSpeedMultiplier() { return 5.0F; }

    public float getAttackDamage() { return 5.0F; }

    public int getMiningLevel() { return 2; }

    public int getEnchantability() { return 15; }

    public Ingredient getRepairIngredient() { return Ingredient.ofItems(Items.IRON_INGOT); }

    public static final CommonIronToolMaterial INSTANCE = new CommonIronToolMaterial();
}
