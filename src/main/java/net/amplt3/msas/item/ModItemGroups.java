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
                        entries.add(ModBlocks.GOLD_STAIRS);
                        entries.add(ModBlocks.GOLD_SLAB);
                        entries.add(ModBlocks.EMERALD_STAIRS);
                        entries.add(ModBlocks.EMERALD_SLAB);
                        entries.add(ModBlocks.LAPIS_STAIRS);
                        entries.add(ModBlocks.LAPIS_SLAB);
                        entries.add(ModBlocks.DIAMOND_STAIRS);
                        entries.add(ModBlocks.DIAMOND_SLAB);
                        entries.add(ModBlocks.NETHERITE_STAIRS);
                        entries.add(ModBlocks.NETHERITE_SLAB);
                    }).build());
    public static void  registerItemGroups() {
        MoreStairsAndSlabs.LOGGER.info("Registering Item Groups for: " + MoreStairsAndSlabs.MOD_ID);
    }
}
