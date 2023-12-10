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
                .add(ModBlocks.IRON_WALL)
                .add(ModBlocks.LAPIS_SLAB)
                .add(ModBlocks.LAPIS_STAIRS)
                .add(ModBlocks.LAPIS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_SLAB)
                .add(ModBlocks.GOLD_STAIRS)
                .add(ModBlocks.GOLD_WALL)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.EMERALD_WALL)
                .add(ModBlocks.DIAMOND_SLAB)
                .add(ModBlocks.DIAMOND_STAIRS)
                .add(ModBlocks.DIAMOND_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.NETHERITE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GOLD_SLAB)
                .add(ModBlocks.GOLD_STAIRS)
                .add(ModBlocks.GOLD_WALL)
                .add(ModBlocks.IRON_SLAB)
                .add(ModBlocks.IRON_STAIRS)
                .add(ModBlocks.IRON_WALL)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.EMERALD_SLAB)
                .add(ModBlocks.EMERALD_STAIRS)
                .add(ModBlocks.EMERALD_WALL)
                .add(ModBlocks.DIAMOND_SLAB)
                .add(ModBlocks.DIAMOND_STAIRS)
                .add(ModBlocks.DIAMOND_WALL)
                .add(ModBlocks.LAPIS_SLAB)
                .add(ModBlocks.LAPIS_STAIRS)
                .add(ModBlocks.LAPIS_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.GOLD_WALL)
                .add(ModBlocks.IRON_WALL)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.EMERALD_WALL)
                .add(ModBlocks.DIAMOND_WALL)
                .add(ModBlocks.LAPIS_WALL);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_SLAB)
                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_STAIRS)
                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_SLAB);
    }
}
