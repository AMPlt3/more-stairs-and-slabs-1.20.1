package net.amplt3.msas.datagen;

import net.amplt3.msas.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private BlockStateModelGenerator.BlockTexturePool getCubeAllBlockTexturePool(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        return blockStateModelGenerator.new BlockTexturePool(TexturedModel.CUBE_ALL.get(block).getTextures());
    }

    private BlockStateModelGenerator.BlockTexturePool getCubeAllBlockTexturePoolWithRegisterVanillaSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Block slabBlock) {
        Identifier slabModelIdentifier = Models.SLAB.upload(slabBlock, TexturedModel.CUBE_ALL.get(block).getTextures(), blockStateModelGenerator.modelCollector);
        Identifier topSlabModelIdentifier = Models.SLAB_TOP.upload(slabBlock, TexturedModel.CUBE_ALL.get(block).getTextures(), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, slabModelIdentifier, topSlabModelIdentifier, ModelIds.getBlockModelId(block)));
        blockStateModelGenerator.registerParentedItemModel(slabBlock, slabModelIdentifier);
        return getCubeAllBlockTexturePool(blockStateModelGenerator, block);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB).stairs(ModBlocks.GOLD_STAIRS).wall(ModBlocks.GOLD_WALL);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB).stairs(ModBlocks.IRON_STAIRS).wall(ModBlocks.IRON_WALL);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB).stairs(ModBlocks.EMERALD_STAIRS).wall(ModBlocks.EMERALD_WALL);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB).stairs(ModBlocks.DIAMOND_STAIRS).wall(ModBlocks.DIAMOND_WALL);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB).stairs(ModBlocks.NETHERITE_STAIRS).wall(ModBlocks.NETHERITE_WALL);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB).stairs(ModBlocks.LAPIS_STAIRS).wall(ModBlocks.LAPIS_WALL);

        //WOOL
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.WHITE_WOOL, ModBlocks.WHITE_WOOL_SLAB).stairs(ModBlocks.WHITE_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GRAY_WOOL_SLAB).stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.GRAY_WOOL, ModBlocks.GRAY_WOOL_SLAB).stairs(ModBlocks.GRAY_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.BLACK_WOOL, ModBlocks.BLACK_WOOL_SLAB).stairs(ModBlocks.BLACK_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.BROWN_WOOL, ModBlocks.BROWN_WOOL_SLAB).stairs(ModBlocks.BROWN_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.RED_WOOL, ModBlocks.RED_WOOL_SLAB).stairs(ModBlocks.RED_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.ORANGE_WOOL, ModBlocks.ORANGE_WOOL_SLAB).stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.YELLOW_WOOL, ModBlocks.YELLOW_WOOL_SLAB).stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.LIME_WOOL, ModBlocks.LIME_WOOL_SLAB).stairs(ModBlocks.LIME_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.GREEN_WOOL, ModBlocks.GREEN_WOOL_SLAB).stairs(ModBlocks.GREEN_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.CYAN_WOOL, ModBlocks.CYAN_WOOL_SLAB).stairs(ModBlocks.CYAN_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_WOOL_SLAB).stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.BLUE_WOOL, ModBlocks.BLUE_WOOL_SLAB).stairs(ModBlocks.BLUE_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.PURPLE_WOOL, ModBlocks.PURPLE_WOOL_SLAB).stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.MAGENTA_WOOL, ModBlocks.MAGENTA_WOOL_SLAB).stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.PINK_WOOL, ModBlocks.PINK_WOOL_SLAB).stairs(ModBlocks.PINK_WOOL_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}