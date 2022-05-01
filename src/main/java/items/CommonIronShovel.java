package items;

import items.group.CommonIronItemGroup;
import materials.CommonIronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronShovel extends ShovelItem {

    public static CommonIronShovel INSTANCE = new CommonIronShovel(
        CommonIronToolMaterial.INSTANCE,
        5,
        5.0F,
        new Item.Settings().group(CommonIronItemGroup.INSTANCE)
    );

    private CommonIronShovel(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_shovel"), INSTANCE);
    }
}
