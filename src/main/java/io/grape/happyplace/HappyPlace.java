package io.grape.happyplace;

import io.grape.happyplace.item.ItemHandler;
import io.grape.happyplace.music.SoundHandler;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HappyPlace implements ModInitializer {
	public static final String MOD_ID = "happyplace";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
		ItemHandler.registerModItems();
		SoundHandler.registerSounds();
    }
}
