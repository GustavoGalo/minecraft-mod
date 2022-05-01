package items;

import items.group.CommonIronItemGroup;
import materials.CommonIronToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronSword extends SwordItem {

    private CommonIronSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

    public static CommonIronSword INSTANCE = new CommonIronSword(
        CommonIronToolMaterial.INSTANCE,
        5,
        5.0F,
        new Item.Settings().group(CommonIronItemGroup.INSTANCE)
    );

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_sword"), INSTANCE);
    }
}
