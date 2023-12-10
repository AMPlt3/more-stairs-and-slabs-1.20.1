package net.amplt3.msas.item;

import net.amplt3.msas.MoreStairsAndSlabs;
import net.amplt3.msas.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MSAS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreStairsAndSlabs.MOD_ID, "msas"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.msas"))
                    .icon(() -> new ItemStack(ModBlocks.GOLD_STAIRS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.IRON_STAIRS);
                        entries.add(ModBlocks.IRON_SLAB);
                        entries.add(ModBlocks.IRON_WALL);
                        entries.add(ModBlocks.GOLD_STAIRS);
                        entries.add(ModBlocks.GOLD_SLAB);
                        entries.add(ModBlocks.GOLD_WALL);
                        entries.add(ModBlocks.EMERALD_STAIRS);
                        entries.add(ModBlocks.EMERALD_SLAB);
                        entries.add(ModBlocks.EMERALD_WALL);
                        entries.add(ModBlocks.LAPIS_STAIRS);
                        entries.add(ModBlocks.LAPIS_SLAB);
                        entries.add(ModBlocks.LAPIS_WALL);
                        entries.add(ModBlocks.DIAMOND_STAIRS);
                        entries.add(ModBlocks.DIAMOND_SLAB);
                        entries.add(ModBlocks.DIAMOND_WALL);
                        entries.add(ModBlocks.NETHERITE_STAIRS);
                        entries.add(ModBlocks.NETHERITE_SLAB);
                        entries.add(ModBlocks.NETHERITE_WALL);
                        //WOOL
                        entries.add(ModBlocks.WHITE_WOOL_STAIRS);
                        entries.add(ModBlocks.WHITE_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.BLACK_WOOL_STAIRS);
                        entries.add(ModBlocks.BLACK_WOOL_SLAB);
                        entries.add(ModBlocks.BROWN_WOOL_STAIRS);
                        entries.add(ModBlocks.BROWN_WOOL_SLAB);
                        entries.add(ModBlocks.RED_WOOL_STAIRS);
                        entries.add(ModBlocks.RED_WOOL_SLAB);
                        entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
                        entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                        entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
                        entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                        entries.add(ModBlocks.LIME_WOOL_STAIRS);
                        entries.add(ModBlocks.LIME_WOOL_SLAB);
                        entries.add(ModBlocks.GREEN_WOOL_STAIRS);
                        entries.add(ModBlocks.GREEN_WOOL_SLAB);
                        entries.add(ModBlocks.CYAN_WOOL_STAIRS);
                        entries.add(ModBlocks.CYAN_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
                        entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                        entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
                        entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(ModBlocks.PINK_WOOL_STAIRS);
                        entries.add(ModBlocks.PINK_WOOL_SLAB);
                    }).build());
    public static void  registerItemGroups() {
        MoreStairsAndSlabs.LOGGER.info("Registering Item Groups for: " + MoreStairsAndSlabs.MOD_ID);
    }
}
