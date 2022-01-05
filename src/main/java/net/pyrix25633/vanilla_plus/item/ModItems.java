package net.pyrix25633.vanilla_plus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;
import net.pyrix25633.vanilla_plus.item.custom.DecoratorToolItem;
import net.pyrix25633.vanilla_plus.item.custom.ModMusicDiscItem;
import net.pyrix25633.vanilla_plus.sounds.ModSounds;

public class ModItems {

    public static final Item DECORATOR_TOOL = registerItem("decorator_tool",
            new DecoratorToolItem(new FabricItemSettings()
                    .group(ModItemGroup.DECORATED_BLOCKS).maxDamage(256)));

    public static final Item BLANK_MUSIC_DISC_PIECE = registerItem("blank_music_disc_piece",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));

    public static final Item BLANK_MUSIC_DISC = registerItem("blank_music_disc",
            new Item(new FabricItemSettings().maxCount(64).group(ModItemGroup.MUSIC_DISCS)));

    public static final Item MUSIC_DISC_EVERYTHING_S_A_SYMPTOM = registerItem("music_disc_everything_s_a_symptom",
            new ModMusicDiscItem(4, ModSounds.EVERYTHING_S_A_SYMPTOM, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    public static final Item MUSIC_DISC_DAWN = registerItem("music_disc_dawn",
            new ModMusicDiscItem(4, ModSounds.DAWN, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    public static final Item MUSIC_DISC_HERON = registerItem("music_disc_heron",
            new ModMusicDiscItem(4, ModSounds.HERON, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    public static final Item MUSIC_DISC_SWEET_LOOK = registerItem("music_disc_sweet_look",
            new ModMusicDiscItem(4, ModSounds.SWEET_LOOK, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    public static final Item MUSIC_DISC_LOST_TREASURE = registerItem("music_disc_lost_treasure",
            new ModMusicDiscItem(4, ModSounds.LOST_TREASURE, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    public static final Item MUSIC_DISC_ALIEN_SKY = registerItem("music_disc_alien_sky",
            new ModMusicDiscItem(4, ModSounds.ALIEN_SKY, new FabricItemSettings()
                    .group(ModItemGroup.MUSIC_DISCS).maxCount(1)));

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaPlus.MOD_ID);
    }
}
