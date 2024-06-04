package io.grape.happyplace.datagenerator;

import io.grape.happyplace.item.ItemHandler;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

public class ModelProvider extends FabricModelProvider {
	public ModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ItemHandler.TRAIL_MIX_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.SUNLIT_VALLEY_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.AFTERNOON_CARTOONS_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.BOARDWALK_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.BUG_CATCHING_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.DRIFTWOOD_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.CART_RIDING_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.JOURNEY_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.NIGHTFALL_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.PET_ROCK_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.PUZZLED_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.RAT_TACTICS_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.SHOWDOWN_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.SINISTER_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		itemModelGenerator.register(ItemHandler.SLOW_MORNING_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
	}
}
