package net.stellarartemis.socketcraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.stellarartemis.socketcraft.provider.EnglishLangProvider;
import net.stellarartemis.socketcraft.provider.ModelProvider;

public class SocketCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLangProvider::new);
		pack.addProvider(ModelProvider::new);
	}
}
