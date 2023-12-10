package net.amplt3.msas;

import net.amplt3.msas.block.ModBlocks;
import net.amplt3.msas.item.ModItemGroups;
import net.amplt3.msas.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreStairsAndSlabs implements ModInitializer {
	public static final String MOD_ID = "more_stairs_and_slabs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}