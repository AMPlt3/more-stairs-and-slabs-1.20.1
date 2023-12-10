package net.amplt3.msas.datagen;

import net.amplt3.msas.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg){
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRON_SLAB)
                .add(ModBlocks.IRON_STAIRS)
                .add(ModBlocks.LAPIS_SLAB)
                .add(ModBlocks.LAPIS_STAIRS);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_SLAB)
                .add(ModBlocks.GOLD_STAIRS)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.DIAMOND_SLAB)
                .add(ModBlocks.DIAMOND_STAIRS);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GOLD_SLAB)
                .add(ModBlocks.GOLD_STAIRS)
                .add(ModBlocks.IRON_SLAB)
                .add(ModBlocks.IRON_STAIRS)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.DIAMOND_SLAB)
                .add(ModBlocks.DIAMOND_STAIRS)
                .add(ModBlocks.LAPIS_SLAB)
                .add(ModBlocks.LAPIS_STAIRS);
    }
}
