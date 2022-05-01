package items.group;

import items.CommonIronIngot;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CommonIronItemGroup  {
    public static final ItemGroup INSTANCE = FabricItemGroupBuilder.build(
        new Identifier("tutorial", "general"),
        () -> new ItemStack(CommonIronIngot.INSTANCE)
    );
}
