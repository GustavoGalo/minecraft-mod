package items;

import items.group.CommonIronItemGroup;
import materials.CommonIronToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronAxe extends AxeItem {

    public static CommonIronAxe INSTANCE = new CommonIronAxe(
        CommonIronToolMaterial.INSTANCE,
        5.0F,
        5.0F,
        new Item.Settings().group(CommonIronItemGroup.INSTANCE)
    );

    private CommonIronAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(material,attackDamage, attackDamage, settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_axe"), INSTANCE);
    }

 }
