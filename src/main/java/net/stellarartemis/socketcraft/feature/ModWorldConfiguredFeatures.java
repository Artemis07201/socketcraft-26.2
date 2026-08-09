package net.stellarartemis.socketcraft.feature;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.stellarartemis.socketcraft.SocketCraft;
import net.stellarartemis.socketcraft.block.ModBlocks;

import java.util.List;

public class ModWorldConfiguredFeatures {
    public static void configure(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceableRule = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceableRule = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceableRule = new TagMatchTest(BlockTags.BASE_STONE_NETHER);

        List<OreConfiguration.TargetBlockState> tinOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.TIN_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_TIN_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> aluminumOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.ALUMINUM_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_ALUMINUM_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> platinumOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.PLATINUM_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_PLATINUM_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> titaniumOre =
                List.of(
                        OreConfiguration.target(
                                netherrackReplaceableRule,
                                ModBlocks.TITANIUM_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> tungstenOre =
                List.of(
                        OreConfiguration.target(
                                netherrackReplaceableRule,
                                ModBlocks.TUNGSTEN_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> rubyOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.RUBY_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> sapphireOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.SAPPHIRE_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_SAPPHIRE_ORE.defaultBlockState()
                        )
                );

        List<OreConfiguration.TargetBlockState> topazOres =
                List.of(
                        OreConfiguration.target(
                                stoneReplaceableRule,
                                ModBlocks.TOPAZ_ORE.defaultBlockState()
                        ),
                        OreConfiguration.target(
                                deepslateReplaceableRule,
                                ModBlocks.DEEPSLATE_TOPAZ_ORE.defaultBlockState()
                        )
                );

        context.register(
                TIN_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(tinOres, 10)
                )
        );

        context.register(
                ALUMINUM_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(aluminumOres, 8)
                )
        );

        context.register(
                PLATINUM_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(platinumOres, 7)
                )
        );

        context.register(
                TITANIUM_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(titaniumOre, 6)
                )
        );

        context.register(
                TUNGSTEN_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(tungstenOre, 5)
                )
        );

        context.register(
                RUBY_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOres, 7)
                )
        );

        context.register(
                SAPPHIRE_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(sapphireOres, 7)
                )
        );

        context.register(
                TOPAZ_ORE_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(topazOres, 7)
                )
        );
    }

    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("tin_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("aluminum_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("platinum_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("titanium_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("tungsten_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("ruby_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("sapphire_ore_vein")
            );

    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    SocketCraft.id("topaz_ore_vein")
            );
}
