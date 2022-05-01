package items;

import items.group.CommonIronItemGroup;
import materials.CommonIronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronPickaxe extends PickaxeItem {

    public static CommonIronPickaxe INSTANCE = new CommonIronPickaxe(
        CommonIronToolMaterial.INSTANCE,
        5,
        5.0F,
        new Item.Settings().group(CommonIronItemGroup.INSTANCE)
    );

    private CommonIronPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_pickaxe"), INSTANCE);
    }
}
