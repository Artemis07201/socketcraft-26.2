package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.stellarartemis.socketcraft.item.ModItems;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.POOR_CUT_DIAMOND, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWED_CUT_DIAMOND, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CUT_DIAMOND, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWLESS_CUT_DIAMOND, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PERFECT_CUT_DIAMOND, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.POOR_CUT_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWED_CUT_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CUT_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWLESS_CUT_RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PERFECT_CUT_RUBY, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.POOR_CUT_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWED_CUT_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CUT_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWLESS_CUT_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PERFECT_CUT_SAPPHIRE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.POOR_CUT_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWED_CUT_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CUT_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FLAWLESS_CUT_TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PERFECT_CUT_TOPAZ, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "ModelProvider";
    }
}
