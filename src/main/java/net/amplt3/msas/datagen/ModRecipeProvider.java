package net.amplt3.msas.datagen;

import net.amplt3.msas.MoreStairsAndSlabs;
import net.amplt3.msas.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    private static void generateStairsRecipeWool(Consumer<RecipeJsonProvider> exporter, String id, Block input, Block output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .pattern("  I")
                .pattern(" II")
                .pattern("III")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_wool_stairs_from_" + id + "_wool"));
    }

    private static void generateSlabRecipeWool(Consumer<RecipeJsonProvider> exporter, String id, Block input, Block output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("III")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_wool_slab_from_" + id + "_wool"));
    }

    private static void generateStairsRecipe(Consumer<RecipeJsonProvider> exporter, String id, Block stairsItem, Item stairsIngot, Block stairsBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stairsItem, 1)
                .pattern("  I")
                .pattern(" II")
                .pattern("III")
                .input('I', stairsIngot)
                .criterion(hasItem(stairsIngot), conditionsFromItem(stairsIngot))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_stairs_from_ingots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stairsItem, 9)
                .pattern("  B")
                .pattern(" BB")
                .pattern("BBB")
                .input('B', stairsBlock)
                .criterion(hasItem(stairsBlock), conditionsFromItem(stairsBlock))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_stairs_from_blocks"));

    }

    private static void generateSlabRecipe(Consumer<RecipeJsonProvider> exporter, String id, Block slabItem, Item slabIngot, Block slabBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slabItem, 1)
                .pattern("III")
                .input('I', slabIngot)
                .criterion(hasItem(slabIngot), conditionsFromItem(slabIngot))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_slabs_from_ingots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, slabItem, 9)
                .pattern("BBB")
                .input('B', slabBlock)
                .criterion(hasItem(slabBlock), conditionsFromItem(slabBlock))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_slabs_from_blocks"));
    }

    private static void generateWallRecipe(Consumer<RecipeJsonProvider> exporter, String id, Block wallItem, Item wallIngot, Block wallBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wallItem, 1)
                .pattern("III")
                .pattern("III")
                .input('I', wallIngot)
                .criterion(hasItem(wallIngot), conditionsFromItem(wallIngot))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_wall_from_ingots"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, wallItem, 9)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', wallBlock)
                .criterion(hasItem(wallBlock), conditionsFromItem(wallBlock))
                .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":" + id + "_wall_from_blocks"));

    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        Map<String, Object[]> recipeDataMetalBlocks = new HashMap<>();
        recipeDataMetalBlocks.put("gold", new Object[]
                {Items.GOLD_INGOT, Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS, ModBlocks.GOLD_SLAB, ModBlocks.GOLD_WALL});
        recipeDataMetalBlocks.put("lapis", new Object[]
                {Items.LAPIS_LAZULI, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_STAIRS, ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_WALL});
        recipeDataMetalBlocks.put("iron", new Object[]
                {Items.IRON_INGOT, Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS, ModBlocks.IRON_SLAB, ModBlocks.IRON_WALL});
        recipeDataMetalBlocks.put("emerald", new Object[]
                {Items.EMERALD, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_STAIRS, ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_WALL});
        recipeDataMetalBlocks.put("diamond", new Object[]
                {Items.DIAMOND, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_STAIRS, ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_WALL});
        recipeDataMetalBlocks.put("netherite", new Object[]
                {Items.NETHERITE_INGOT, Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_STAIRS, ModBlocks.NETHERITE_SLAB, ModBlocks.NETHERITE_WALL});
        for (Map.Entry<String, Object[]> entry : recipeDataMetalBlocks.entrySet()) {
            String id = entry.getKey();
            Object[] items = entry.getValue();

            Item ingot = (Item) items[0];
            Block block = (Block) items[1];
            Block stairsItem = (Block) items[2];
            Block slabItem = (Block) items[3];
            Block wallItem = (Block) items[4];

            generateStairsRecipe(exporter, id, stairsItem, ingot, block);
            generateSlabRecipe(exporter, id, slabItem, ingot, block);
            generateWallRecipe(exporter, id, wallItem, ingot, block);
        }
        //LEAVES TO STICKS
        Map<String, Object[]> recipeDataLeaves = new HashMap<>();
        recipeDataLeaves.put("oak", new Object[]{Blocks.OAK_LEAVES});
        recipeDataLeaves.put("spruce", new Object[]{Blocks.SPRUCE_LEAVES});
        recipeDataLeaves.put("birch", new Object[]{Blocks.BIRCH_LEAVES});
        recipeDataLeaves.put("jungle", new Object[]{Blocks.JUNGLE_LEAVES});
        recipeDataLeaves.put("acacia", new Object[]{Blocks.ACACIA_LEAVES});
        recipeDataLeaves.put("dark_oak", new Object[]{Blocks.DARK_OAK_LEAVES});
        recipeDataLeaves.put("mangrove", new Object[]{Blocks.MANGROVE_LEAVES});
        recipeDataLeaves.put("cherry", new Object[]{Blocks.CHERRY_LEAVES});
        recipeDataLeaves.put("azalea", new Object[]{Blocks.AZALEA_LEAVES});
        recipeDataLeaves.put("flowering_azalea", new Object[]{Blocks.FLOWERING_AZALEA_LEAVES});
        recipeDataLeaves.put("dead_leaves", new Object[]{Blocks.FLOWERING_AZALEA_LEAVES});

        for (Map.Entry<String, Object[]> entry : recipeDataLeaves.entrySet()) {
            String id = entry.getKey();
            Object[] leafBlock = entry.getValue();

            ShapelessRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.STICK, 2)
                    .input((Block) leafBlock[0])
                    .criterion(hasItem((Block) leafBlock[0]), conditionsFromItem((Block) leafBlock[0]))
                    .offerTo(exporter, new Identifier(MoreStairsAndSlabs.MOD_ID + ":sticks_from_" + id));
        }
        Map<String, Object[]> recipeDataWool = new HashMap<>();
        recipeDataWool.put("white", new Object[]{Blocks.WHITE_WOOL, ModBlocks.WHITE_WOOL_STAIRS, ModBlocks.WHITE_WOOL_SLAB});
        recipeDataWool.put("light_gray", new Object[]{Blocks.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GRAY_WOOL_STAIRS, ModBlocks.LIGHT_GRAY_WOOL_SLAB});
        recipeDataWool.put("gray", new Object[]{Blocks.GRAY_WOOL, ModBlocks.GRAY_WOOL_STAIRS, ModBlocks.GRAY_WOOL_SLAB});
        recipeDataWool.put("black", new Object[]{Blocks.BLACK_WOOL, ModBlocks.BLACK_WOOL_STAIRS, ModBlocks.BLACK_WOOL_SLAB});
        recipeDataWool.put("brown", new Object[]{Blocks.BROWN_WOOL, ModBlocks.BROWN_WOOL_STAIRS, ModBlocks.BROWN_WOOL_SLAB});
        recipeDataWool.put("red", new Object[]{Blocks.RED_WOOL, ModBlocks.RED_WOOL_STAIRS, ModBlocks.RED_WOOL_SLAB});
        recipeDataWool.put("orange", new Object[]{Blocks.ORANGE_WOOL, ModBlocks.ORANGE_WOOL_STAIRS, ModBlocks.ORANGE_WOOL_SLAB});
        recipeDataWool.put("yellow", new Object[]{Blocks.YELLOW_WOOL, ModBlocks.YELLOW_WOOL_STAIRS, ModBlocks.YELLOW_WOOL_SLAB});
        recipeDataWool.put("lime", new Object[]{Blocks.LIME_WOOL, ModBlocks.LIME_WOOL_STAIRS, ModBlocks.LIME_WOOL_SLAB});
        recipeDataWool.put("green", new Object[]{Blocks.GREEN_WOOL, ModBlocks.GREEN_WOOL_STAIRS, ModBlocks.GREEN_WOOL_SLAB});
        recipeDataWool.put("cyan", new Object[]{Blocks.CYAN_WOOL, ModBlocks.CYAN_WOOL_STAIRS, ModBlocks.CYAN_WOOL_SLAB});
        recipeDataWool.put("light_blue", new Object[]{Blocks.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_WOOL_STAIRS, ModBlocks.LIGHT_BLUE_WOOL_SLAB});
        recipeDataWool.put("blue", new Object[]{Blocks.BLUE_WOOL, ModBlocks.BLUE_WOOL_STAIRS, ModBlocks.BLUE_WOOL_SLAB});
        recipeDataWool.put("purple", new Object[]{Blocks.PURPLE_WOOL, ModBlocks.PURPLE_WOOL_STAIRS, ModBlocks.PURPLE_WOOL_SLAB});
        recipeDataWool.put("magenta", new Object[]{Blocks.MAGENTA_WOOL, ModBlocks.MAGENTA_WOOL_STAIRS, ModBlocks.MAGENTA_WOOL_SLAB});
        recipeDataWool.put("pink", new Object[]{Blocks.PINK_WOOL, ModBlocks.PINK_WOOL_STAIRS, ModBlocks.PINK_WOOL_SLAB});

        for (Map.Entry<String, Object[]> entry : recipeDataWool.entrySet()) {
            String id = entry.getKey();
            Object[] woolBlock = entry.getValue();
            generateStairsRecipeWool(exporter, id, (Block) woolBlock[0], (Block) woolBlock[1]);
            generateSlabRecipeWool(exporter, id, (Block) woolBlock[0], (Block) woolBlock[2]);
        }
    }
}
