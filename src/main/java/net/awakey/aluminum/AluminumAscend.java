package net.awakey.aluminum;

import net.awakey.aluminum.item.ModItemGroups;
import net.awakey.aluminum.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AluminumAscend implements ModInitializer {
public static final String MOD_ID = "aluminum";
    public static final Logger LOGGER = LoggerFactory.getLogger("aluminum");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}