package io.grape.happyplace.datagenerator;

import io.grape.happyplace.item.ItemHandler;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagHandler extends FabricTagProvider.ItemTagProvider {
	public ItemTagHandler(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider arg) {
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.TRAIL_MIX_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.TRAIL_MIX_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.SUNLIT_VALLEY_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.SUNLIT_VALLEY_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.AFTERNOON_CARTOONS_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.AFTERNOON_CARTOONS_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.BOARDWALK_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.BOARDWALK_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.BUG_CATCHING_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.BUG_CATCHING_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.DRIFTWOOD_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.DRIFTWOOD_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.CART_RIDING_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.CART_RIDING_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.JOURNEY_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.JOURNEY_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.NIGHTFALL_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.NIGHTFALL_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.PET_ROCK_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.PET_ROCK_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.PUZZLED_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.PUZZLED_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.RAT_TACTICS_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.RAT_TACTICS_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.SHOWDOWN_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.SHOWDOWN_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.SINISTER_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.SINISTER_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
			.add(ItemHandler.SLOW_MORNING_MUSIC_DISC);
		getOrCreateTagBuilder(ItemTags.CREEPER_DROPPED_MUSIC_DISCS)
			.add(ItemHandler.SLOW_MORNING_MUSIC_DISC);
	}
}
