package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.stellarartemis.socketcraft.block.ModBlocks;
import net.stellarartemis.socketcraft.item.ModItems;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        for (Block block : ModBlocks.BLOCK_LIST) {
            blockModelGenerators.createTrivialCube(block);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        for (Item item : ModItems.ITEM_LIST) {
            itemModelGenerators.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
    }

    @Override
    public String getName() {
        return "ModelProvider";
    }
}
