package net.pyrix25633.vanilla_plus.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;

public class ModSounds {
    public static SoundEvent EVERYTHING_S_A_SYMPTOM = registerSoundEvent("everything_s_a_symptom");

    public static SoundEvent DAWN = registerSoundEvent("dawn");

    public static SoundEvent HERON = registerSoundEvent("heron");

    public static SoundEvent SWEET_LOOK = registerSoundEvent("sweet_look");

    public static SoundEvent LOST_TREASURE = registerSoundEvent("lost_treasure");

    public static SoundEvent ALIEN_SKY = registerSoundEvent("alien_sky");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VanillaPlus.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for " + VanillaPlus.MOD_ID);
    }
}
