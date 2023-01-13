package net.cedaros.biggerAUI;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntryPoint implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("BUI");

	@Override
	public void onInitialize() {

		LOGGER.info("Bigger Advancement UI mod loaded.");
	}
}
