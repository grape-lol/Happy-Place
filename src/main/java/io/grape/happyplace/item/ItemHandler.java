package io.grape.happyplace.item;

import io.grape.happyplace.HappyPlace;
import io.grape.happyplace.music.SoundHandler;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ItemHandler {
	public static final Item CART_RIDING_MUSIC_DISC = registerItem("cart_riding_music_disc",
		new MusicDiscItem(3, SoundHandler.CART_RIDING, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 135));

	public static final Item SLOW_MORNING_MUSIC_DISC = registerItem("slow_morning_music_disc",
		new MusicDiscItem(6, SoundHandler.SLOW_MORNING, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 151));

	public static final Item BOARDWALK_MUSIC_DISC = registerItem("boardwalk_music_disc",
		new MusicDiscItem(1, SoundHandler.BOARDWALK, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 94));

	public static final Item SUNLIT_VALLEY_MUSIC_DISC = registerItem("sunlit_valley_music_disc",
		new MusicDiscItem(2, SoundHandler.SUNLIT_VALLEY, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 152));

	public static final Item BUG_CATCHING_MUSIC_DISC = registerItem("bug_catching_music_disc",
		new MusicDiscItem(2, SoundHandler.BUG_CATCHING, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 87));

	public static final Item TRAIL_MIX_MUSIC_DISC = registerItem("trail_mix_music_disc",
		new MusicDiscItem(12, SoundHandler.TRAIL_MIX, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 143));

	public static final Item PET_ROCK_MUSIC_DISC = registerItem("pet_rock_music_disc",
		new MusicDiscItem(10, SoundHandler.PET_ROCK, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 95));

	public static final Item PUZZLED_MUSIC_DISC = registerItem("puzzled_music_disc",
		new MusicDiscItem(9, SoundHandler.PUZZLED, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 52));

	public static final Item RAT_TACTICS_MUSIC_DISC = registerItem("rat_tactics_music_disc",
		new MusicDiscItem(5, SoundHandler.RAT_TACTICS, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 200));

	public static final Item AFTERNOON_CARTOONS_MUSIC_DISC = registerItem("afternoon_cartoons_music_disc",
		new MusicDiscItem(7, SoundHandler.AFTERNOON_CARTOONS, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 183));

	public static final Item SINISTER_MUSIC_DISC = registerItem("sinister_music_disc",
		new MusicDiscItem(11, SoundHandler.SINISTER, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 183));

	public static final Item SHOWDOWN_MUSIC_DISC = registerItem("showdown_music_disc",
		new MusicDiscItem(8, SoundHandler.SHOWDOWN, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 185));

	public static final Item JOURNEY_MUSIC_DISC = registerItem("journey_music_disc",
		new MusicDiscItem(13, SoundHandler.JOURNEY, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 143));

	public static final Item DRIFTWOOD_MUSIC_DISC = registerItem("driftwood_music_disc",
		new MusicDiscItem(8, SoundHandler.DRIFTWOOD, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 142));

	public static final Item NIGHTFALL_MUSIC_DISC = registerItem("nightfall_music_disc",
		new MusicDiscItem(3, SoundHandler.NIGHTFALL, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 312));

	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		entries.addItem(CART_RIDING_MUSIC_DISC);
		entries.addItem(SLOW_MORNING_MUSIC_DISC);
		entries.addItem(SUNLIT_VALLEY_MUSIC_DISC);
		entries.addItem(BOARDWALK_MUSIC_DISC);
		entries.addItem(BUG_CATCHING_MUSIC_DISC);
		entries.addItem(TRAIL_MIX_MUSIC_DISC);
		entries.addItem(PET_ROCK_MUSIC_DISC);
		entries.addItem(PUZZLED_MUSIC_DISC);
		entries.addItem(RAT_TACTICS_MUSIC_DISC);
		entries.addItem(AFTERNOON_CARTOONS_MUSIC_DISC);
		entries.addItem(SINISTER_MUSIC_DISC);
		entries.addItem(SHOWDOWN_MUSIC_DISC);
		entries.addItem(JOURNEY_MUSIC_DISC);
		entries.addItem(DRIFTWOOD_MUSIC_DISC);
		entries.addItem(NIGHTFALL_MUSIC_DISC);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(HappyPlace.MOD_ID, name), item);
	}

	public static void registerModItems() {
		HappyPlace.LOGGER.info("Registering Sounds for " + HappyPlace.MOD_ID);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(ItemHandler::addItemsToIngredientItemGroup);
	}
}
