package net.pyrix25633.vanilla_plus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pyrix25633.vanilla_plus.VanillaPlus;

public class ModItemGroup {
    public static final ItemGroup DECORATED_BLOCKS = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID, "decorated_blocks"),
             () -> new ItemStack(ModItems.DECORATOR_TOOL));

    public static final ItemGroup MUSIC_DISCS = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID, "music_discs"),
            () -> new ItemStack(ModItems.MUSIC_DISC_EVERYTHING_S_A_SYMPTOM));
}
