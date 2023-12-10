package net.amplt3.msas.block;

import net.amplt3.msas.MoreStairsAndSlabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //METAL BLOCKS
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_WALL = registerBlock("gold_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerBlock("iron_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_WALL = registerBlock("iron_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_WALL = registerBlock("diamond_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));

    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs",
            new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_WALL = registerBlock("lapis_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK)));

    //WOOL
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));

    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));

    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL)));

    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));

    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));

    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));

    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));

    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));

    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));

    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));

    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoreStairsAndSlabs.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MoreStairsAndSlabs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MoreStairsAndSlabs.LOGGER.info("Registering Mod Blocks for: " + MoreStairsAndSlabs.MOD_ID);
    }
}
