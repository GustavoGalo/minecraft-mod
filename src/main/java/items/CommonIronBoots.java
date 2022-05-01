package items;

import items.group.CommonIronItemGroup;
import materials.CommonIronArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronBoots extends ArmorItem {

    public static CommonIronBoots INSTANCE = new CommonIronBoots(
        CommonIronArmorMaterial.INSTANCE,
        EquipmentSlot.FEET,
        new Item.Settings().group(CommonIronItemGroup.INSTANCE)
    );

    private CommonIronBoots(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Item.Settings settings) {
        super(armorMaterial, equipmentSlot, settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_boots"), INSTANCE);
    }
}
