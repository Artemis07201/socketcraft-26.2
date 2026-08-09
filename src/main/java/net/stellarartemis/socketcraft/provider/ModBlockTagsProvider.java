package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.stellarartemis.socketcraft.block.ModBlocks;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        for (Block block : ModBlocks.MINEABLE_WITH_PICKAXE) {
            builder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(Objects.requireNonNull(block.properties().blockId()));
        }

        for (Block block : ModBlocks.INCORRECT_FOR_WOODEN_TOOL) {
            builder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                    .add(Objects.requireNonNull(block.properties().blockId()));
        }

        for (Block block : ModBlocks.INCORRECT_FOR_STONE_TOOL) {
            builder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                    .add(Objects.requireNonNull(block.properties().blockId()));
        }

        for (Block block : ModBlocks.INCORRECT_FOR_COPPER_TOOL) {
            builder(BlockTags.INCORRECT_FOR_COPPER_TOOL)
                    .add(Objects.requireNonNull(block.properties().blockId()));
        }

        for (Block block : ModBlocks.INCORRECT_FOR_IRON_TOOL) {
            builder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                    .add(Objects.requireNonNull(block.properties().blockId()));
        }
    }
}
