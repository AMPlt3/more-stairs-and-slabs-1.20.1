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
                Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB).stairs(ModBlocks.GOLD_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB).stairs(ModBlocks.IRON_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB).stairs(ModBlocks.EMERALD_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB).stairs(ModBlocks.DIAMOND_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB).stairs(ModBlocks.NETHERITE_STAIRS);
        getCubeAllBlockTexturePoolWithRegisterVanillaSlab(blockStateModelGenerator,
                Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB).stairs(ModBlocks.LAPIS_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}