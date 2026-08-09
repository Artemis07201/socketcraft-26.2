package net.stellarartemis.socketcraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.stellarartemis.socketcraft.feature.ModWorldConfiguredFeatures;
import net.stellarartemis.socketcraft.feature.ModWorldPlacedFeatures;
import net.stellarartemis.socketcraft.provider.*;

public class SocketCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLangProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(ModWorldgenProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTablesProvider::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModWorldConfiguredFeatures::configure);
		registryBuilder.add(Registries.PLACED_FEATURE, ModWorldPlacedFeatures::configure);
	}
}
