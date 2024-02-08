package net.awakey.aluminum.item;
import net.awakey.aluminum.AluminumAscend;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {
    public static final Item ALUMINUM = registerItem("aluminum", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new FabricItemSettings()));






    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    entries.add(RAW_ALUMINUM);
    entries.add(ALUMINUM);



    }






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AluminumAscend.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AluminumAscend.LOGGER.info("Registering Mod Items for " + AluminumAscend.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
