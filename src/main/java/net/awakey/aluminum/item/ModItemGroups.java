package net.awakey.aluminum.item;
import net.awakey.aluminum.AluminumAscend;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AluminumAscend.MOD_ID, "aluminum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aluminum"))
                    .icon(() -> new ItemStack(ModItems.ALUMINUM)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ALUMINUM);
                        entries.add(ModItems.RAW_ALUMINUM);












                    }).build());


    public static void registerItemGroups() {
        AluminumAscend.LOGGER.info("Registering Item Groups for " + AluminumAscend.MOD_ID);
                    }
}

