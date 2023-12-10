package net.amplt3.msas.datagen;

import net.amplt3.msas.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GOLD_STAIRS);
        addDrop(ModBlocks.GOLD_WALL);
        addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
        addDrop(ModBlocks.IRON_STAIRS);
        addDrop(ModBlocks.IRON_WALL);
        addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));
        addDrop(ModBlocks.EMERALD_STAIRS);
        addDrop(ModBlocks.EMERALD_WALL);
        addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));
        addDrop(ModBlocks.DIAMOND_STAIRS);
        addDrop(ModBlocks.DIAMOND_WALL);
        addDrop(ModBlocks.DIAMOND_SLAB, slabDrops(ModBlocks.DIAMOND_SLAB));
        addDrop(ModBlocks.NETHERITE_STAIRS);
        addDrop(ModBlocks.NETHERITE_WALL);
        addDrop(ModBlocks.NETHERITE_SLAB, slabDrops(ModBlocks.NETHERITE_SLAB));
        addDrop(ModBlocks.LAPIS_STAIRS);
        addDrop(ModBlocks.LAPIS_WALL);
        addDrop(ModBlocks.LAPIS_SLAB, slabDrops(ModBlocks.LAPIS_SLAB));
        //WOOL
        addDrop(ModBlocks.WHITE_WOOL_STAIRS);
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_STAIRS);
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_STAIRS);
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));
        addDrop(ModBlocks.RED_WOOL_STAIRS);
        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_STAIRS);
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_STAIRS);
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_STAIRS);
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_STAIRS);
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_STAIRS);
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_STAIRS);
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_STAIRS);
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
    }
}
