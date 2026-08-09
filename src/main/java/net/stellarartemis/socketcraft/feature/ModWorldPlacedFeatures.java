package net.stellarartemis.socketcraft.feature;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.heightproviders.TrapezoidHeight;
import net.minecraft.world.level.levelgen.placement.*;
import net.stellarartemis.socketcraft.SocketCraft;

import java.util.List;

public class ModWorldPlacedFeatures {
    public static void configure(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        List<PlacementModifier> tinOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(12, 16)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.absolute(-32),
                                        VerticalAnchor.absolute(64),
                                        20
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> aluminumOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(5, 8)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.absolute(-16),
                                        VerticalAnchor.absolute(64),
                                        16
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> platinumOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(2, 4)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.absolute(-48),
                                        VerticalAnchor.absolute(32),
                                        12
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> titaniumOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(2, 3)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.BOTTOM,
                                        VerticalAnchor.TOP,
                                        24
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> tungstenOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(1, 2)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.BOTTOM,
                                        VerticalAnchor.absolute(96),
                                        8
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> rubyOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(3, 5)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.BOTTOM,
                                        VerticalAnchor.absolute(16),
                                        12
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> sapphireOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(3, 5)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.absolute(-32),
                                        VerticalAnchor.absolute(48),
                                        12
                                )
                        ),
                        BiomeFilter.biome()
                );

        List<PlacementModifier> topazOreModifiers =
                List.of(
                        CountPlacement.of(UniformInt.of(3, 5)),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.of(
                                TrapezoidHeight.of(
                                        VerticalAnchor.absolute(-8),
                                        VerticalAnchor.absolute(88),
                                        16
                                )
                        ),
                        BiomeFilter.biome()
                );

        context.register(
                TIN_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.TIN_ORE_KEY
                        ),
                        tinOreModifiers
                )
        );

        context.register(
                ALUMINUM_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.ALUMINUM_ORE_KEY
                        ),
                        aluminumOreModifiers
                )
        );

        context.register(
                PLATINUM_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.PLATINUM_ORE_KEY
                        ),
                        platinumOreModifiers
                )
        );

        context.register(
                TITANIUM_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.TITANIUM_ORE_KEY
                        ),
                        titaniumOreModifiers
                )
        );

        context.register(
                TUNGSTEN_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.TUNGSTEN_ORE_KEY
                        ),
                        tungstenOreModifiers
                )
        );

        context.register(
                RUBY_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.RUBY_ORE_KEY
                        ),
                        rubyOreModifiers
                )
        );

        context.register(
                SAPPHIRE_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.SAPPHIRE_ORE_KEY
                        ),
                        sapphireOreModifiers
                )
        );

        context.register(
                TOPAZ_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(
                                ModWorldConfiguredFeatures.TOPAZ_ORE_KEY
                        ),
                        topazOreModifiers
                )
        );
    }

    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("tin_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("aluminum_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("platinum_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("titanium_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("tungsten_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("ruby_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("sapphire_ore_placed")
            );

    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    SocketCraft.id("topaz_ore_placed")
            );
}
