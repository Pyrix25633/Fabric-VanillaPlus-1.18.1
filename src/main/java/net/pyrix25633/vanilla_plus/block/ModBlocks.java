package net.pyrix25633.vanilla_plus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;
import net.pyrix25633.vanilla_plus.block.custom.*;
import net.pyrix25633.vanilla_plus.item.ModItemGroup;

public class ModBlocks {

    static final float woodHardness = 2f, woodResistance = 2f,
            deepOceanHardness = 1.5f, deepOceanResistance = 2.2f;

    // Oak
    public static final Block DECORATED_OAK_PLANKS = registerDecoratedBlock("decorated_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_LOG = registerDecoratedBlock("decorated_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_WOOD = registerDecoratedBlock("decorated_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerDecoratedBlock("decorated_stripped_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerDecoratedBlock("decorated_stripped_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_TABLE = registerDecoratedBlock("oak_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_OAK_LOG = registerDecoratedBlock("hollow_oak_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_OAK_LOG = registerDecoratedBlock("stripped_hollow_oak_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Spruce
    public static final Block DECORATED_SPRUCE_PLANKS = registerDecoratedBlock("decorated_spruce_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_SPRUCE_LOG = registerDecoratedBlock("decorated_spruce_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_SPRUCE_WOOD = registerDecoratedBlock("decorated_spruce_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_SPRUCE_LOG = registerDecoratedBlock("decorated_stripped_spruce_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_SPRUCE_WOOD = registerDecoratedBlock("decorated_stripped_spruce_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_TABLE = registerDecoratedBlock("spruce_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_SPRUCE_LOG = registerDecoratedBlock("hollow_spruce_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SPRUCE_LOG = registerDecoratedBlock("stripped_hollow_spruce_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Birch
    public static final Block DECORATED_BIRCH_PLANKS = registerDecoratedBlock("decorated_birch_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_BIRCH_LOG = registerDecoratedBlock("decorated_birch_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_BIRCH_WOOD = registerDecoratedBlock("decorated_birch_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_BIRCH_LOG = registerDecoratedBlock("decorated_stripped_birch_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_BIRCH_WOOD = registerDecoratedBlock("decorated_stripped_birch_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_TABLE = registerDecoratedBlock("birch_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_BIRCH_LOG = registerDecoratedBlock("hollow_birch_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_BIRCH_LOG = registerDecoratedBlock("stripped_hollow_birch_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Acacia
    public static final Block DECORATED_ACACIA_PLANKS = registerDecoratedBlock("decorated_acacia_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_ACACIA_LOG = registerDecoratedBlock("decorated_acacia_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_ACACIA_WOOD = registerDecoratedBlock("decorated_acacia_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_ACACIA_LOG = registerDecoratedBlock("decorated_stripped_acacia_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_ACACIA_WOOD = registerDecoratedBlock("decorated_stripped_acacia_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_TABLE = registerDecoratedBlock("acacia_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_ACACIA_LOG = registerDecoratedBlock("hollow_acacia_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_ACACIA_LOG = registerDecoratedBlock("stripped_hollow_acacia_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Jungle
    public static final Block DECORATED_JUNGLE_PLANKS = registerDecoratedBlock("decorated_jungle_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_JUNGLE_LOG = registerDecoratedBlock("decorated_jungle_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_JUNGLE_WOOD = registerDecoratedBlock("decorated_jungle_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_JUNGLE_LOG = registerDecoratedBlock("decorated_stripped_jungle_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_JUNGLE_WOOD = registerDecoratedBlock("decorated_stripped_jungle_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_TABLE = registerDecoratedBlock("jungle_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_JUNGLE_LOG = registerDecoratedBlock("hollow_jungle_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_JUNGLE_LOG = registerDecoratedBlock("stripped_hollow_jungle_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Dark Oak
    public static final Block DECORATED_DARK_OAK_PLANKS = registerDecoratedBlock("decorated_dark_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_DARK_OAK_LOG = registerDecoratedBlock("decorated_dark_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_DARK_OAK_WOOD = registerDecoratedBlock("decorated_dark_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_LOG = registerDecoratedBlock("decorated_stripped_dark_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_WOOD = registerDecoratedBlock("decorated_stripped_dark_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_TABLE = registerDecoratedBlock("dark_oak_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_DARK_OAK_LOG = registerDecoratedBlock("hollow_dark_oak_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_DARK_OAK_LOG = registerDecoratedBlock("stripped_hollow_dark_oak_log",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Crimson
    public static final Block DECORATED_CRIMSON_PLANKS = registerDecoratedBlock("decorated_crimson_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_CRIMSON_STEM = registerDecoratedBlock("decorated_crimson_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_CRIMSON_HYPHAE = registerDecoratedBlock("decorated_crimson_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_CRIMSON_STEM = registerDecoratedBlock("decorated_stripped_crimson_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_CRIMSON_HYPHAE = registerDecoratedBlock("decorated_stripped_crimson_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_TABLE = registerDecoratedBlock("crimson_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_CRIMSON_STEM = registerDecoratedBlock("hollow_crimson_stem",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_CRIMSON_STEM = registerDecoratedBlock("stripped_hollow_crimson_stem",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Warped
    public static final Block DECORATED_WARPED_PLANKS = registerDecoratedBlock("decorated_warped_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_WARPED_STEM = registerDecoratedBlock("decorated_warped_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_WARPED_HYPHAE = registerDecoratedBlock("decorated_warped_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_WARPED_STEM = registerDecoratedBlock("decorated_stripped_warped_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_WARPED_HYPHAE = registerDecoratedBlock("decorated_stripped_warped_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_TABLE = registerDecoratedBlock("warped_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block HOLLOW_WARPED_STEM = registerDecoratedBlock("hollow_warped_stem",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_WARPED_STEM = registerDecoratedBlock("stripped_hollow_warped_stem",
            new HollowLog(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //Deep Ocean
    public static final Block DEEP_OCEAN_BRICKS = registerDecoratedBlock("deep_ocean_bricks",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));
    public static final Block DEEP_OCEAN_BRICK_SLAB = registerDecoratedBlock("deep_ocean_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));
    public static final Block DEEP_OCEAN_BRICK_VERTICAL_SLAB = registerDecoratedBlock("deep_ocean_brick_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));
    public static final Block DEEP_OCEAN_BRICK_STAIRS = registerDecoratedBlock("deep_ocean_brick_stairs",
            new ModStairsBlocks(ModBlocks.DEEP_OCEAN_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));
    public static final Block DEEP_OCEAN_BRICK_WALL = registerDecoratedBlock("deep_ocean_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));
    public static final Block CHISELED_DEEP_OCEAN_BRICKS = registerDecoratedBlock("chiseled_deep_ocean_bricks",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(deepOceanHardness, deepOceanResistance)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    //Vertical Slabs
    public static final Block OAK_VERTICAL_SLAB = registerDecoratedBlock("oak_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_VERTICAL_SLAB = registerDecoratedBlock("spruce_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_VERTICAL_SLAB = registerDecoratedBlock("birch_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_VERTICAL_SLAB = registerDecoratedBlock("jungle_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_VERTICAL_SLAB = registerDecoratedBlock("acacia_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerDecoratedBlock("dark_oak_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_VERTICAL_SLAB = registerDecoratedBlock("crimson_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_VERTICAL_SLAB = registerDecoratedBlock("warped_vertical_slab",
            new VerticalSlabBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .sounds(BlockSoundGroup.WOOD)));

    private static Block registerDecoratedBlock(String name, Block block) {
        registerDecoratedBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static Item registerDecoratedBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.DECORATIVE_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + VanillaPlus.MOD_ID);
    }
}
