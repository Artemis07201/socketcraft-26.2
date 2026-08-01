package net.stellarartemis.socketcraft;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.stellarartemis.socketcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketCraft implements ModInitializer {
	public static final String MOD_ID = "socketcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
