package io.grape.happyplace.music;

import io.grape.happyplace.HappyPlace;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundHandler {
	public static final SoundEvent CART_RIDING = registerSoundEvent("cart_riding");
	public static final SoundEvent SLOW_MORNING = registerSoundEvent("slow_morning");
	public static final SoundEvent BOARDWALK = registerSoundEvent("boardwalk");
	public static final SoundEvent SUNLIT_VALLEY = registerSoundEvent("sunlit_valley");
	public static final SoundEvent BUG_CATCHING = registerSoundEvent("bug_catching");
	public static final SoundEvent TRAIL_MIX = registerSoundEvent("trail_mix");
	public static final SoundEvent PET_ROCK = registerSoundEvent("pet_rock");
	public static final SoundEvent PUZZLED = registerSoundEvent("puzzled");
	public static final SoundEvent RAT_TACTICS = registerSoundEvent("rat_tactics");
	public static final SoundEvent AFTERNOON_CARTOONS = registerSoundEvent("afternoon_cartoons");
	public static final SoundEvent SINISTER = registerSoundEvent("sinister");
	public static final SoundEvent SHOWDOWN = registerSoundEvent("showdown");
	public static final SoundEvent JOURNEY = registerSoundEvent("journey");
	public static final SoundEvent DRIFTWOOD = registerSoundEvent("driftwood");
	public static final SoundEvent NIGHTFALL = registerSoundEvent("nightfall");

	public static SoundEvent registerSoundEvent(String name) {
		Identifier id = new Identifier(HappyPlace.MOD_ID, name);
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}

	public static void registerSounds() {
		HappyPlace.LOGGER.info("Registering Sounds for " + HappyPlace.MOD_ID);
	}
}
