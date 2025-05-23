package net.mrgame.theawakening;

import net.fabricmc.api.ModInitializer;

import net.mrgame.theawakening.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheAwakening implements ModInitializer {
	public static final String MOD_ID = "theawakening";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}