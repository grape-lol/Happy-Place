package io.grape.happyplace;

import io.grape.happyplace.datagenerator.ItemTagHandler;
import io.grape.happyplace.datagenerator.ModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ItemTagHandler::new);
		pack.addProvider(ModelProvider::new);
	}
}
