package items;

import items.group.CommonIronItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CommonIronIngot extends Item {

    public static CommonIronIngot INSTANCE = new CommonIronIngot(new Settings().group(CommonIronItemGroup.INSTANCE));

    private CommonIronIngot(Settings settings) {
        super(settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "common_iron_ingot"), INSTANCE);
    }
}
