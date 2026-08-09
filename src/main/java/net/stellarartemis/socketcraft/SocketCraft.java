package net.stellarartemis.socketcraft;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.Identifier;

import net.minecraft.world.level.levelgen.GenerationStep;
import net.stellarartemis.socketcraft.block.ModBlocks;
import net.stellarartemis.socketcraft.creativeModeTab.ModCreativeModeTabs;
import net.stellarartemis.socketcraft.feature.ModWorldConfiguredFeatures;
import net.stellarartemis.socketcraft.feature.ModWorldPlacedFeatures;
import net.stellarartemis.socketcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketCraft implements ModInitializer {
	public static final String MOD_ID = "socketcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.TIN_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.ALUMINUM_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.PLATINUM_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInTheNether(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.TITANIUM_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInTheNether(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.RUBY_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY
		);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModWorldPlacedFeatures.TOPAZ_ORE_PLACED_KEY
		);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
