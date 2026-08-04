package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.stellarartemis.socketcraft.block.ModBlocks;
import net.stellarartemis.socketcraft.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.RAW_TIN.getDescriptionId(), "Raw Tin");
        translationBuilder.add(ModItems.RAW_ALUMINUM.getDescriptionId(), "Raw Aluminum");
        translationBuilder.add(ModItems.RAW_PLATINUM.getDescriptionId(), "Raw Platinum");
        translationBuilder.add(ModItems.RAW_TITANIUM.getDescriptionId(), "Raw Titanium");
        translationBuilder.add(ModItems.RAW_TUNGSTEN.getDescriptionId(), "Raw Tungsten");

        translationBuilder.add(ModItems.TIN_INGOT.getDescriptionId(), "Tin Ingot");
        translationBuilder.add(ModItems.ALUMINUM_INGOT.getDescriptionId(), "Aluminum Ingot");
        translationBuilder.add(ModItems.PLATINUM_INGOT.getDescriptionId(), "Platinum Ingot");
        translationBuilder.add(ModItems.TITANIUM_INGOT.getDescriptionId(), "Titanium Ingot");
        translationBuilder.add(ModItems.TUNGSTEN_INGOT.getDescriptionId(), "Tungsten Ingot");

        translationBuilder.add(ModItems.RUBY.getDescriptionId(), "Ruby");
        translationBuilder.add(ModItems.SAPPHIRE.getDescriptionId(), "Sapphire");
        translationBuilder.add(ModItems.TOPAZ.getDescriptionId(), "Topaz");

        translationBuilder.add(ModItems.POOR_CUT_DIAMOND.getDescriptionId(), "Poor Cut Diamond");
        translationBuilder.add(ModItems.FLAWED_CUT_DIAMOND.getDescriptionId(), "Flawed Cut Diamond");
        translationBuilder.add(ModItems.CUT_DIAMOND.getDescriptionId(), "Cut Diamond");
        translationBuilder.add(ModItems.FLAWLESS_CUT_DIAMOND.getDescriptionId(), "Flawless Cut Diamond");
        translationBuilder.add(ModItems.PERFECT_CUT_DIAMOND.getDescriptionId(), "Perfect Cut Diamond");

        translationBuilder.add(ModItems.POOR_CUT_RUBY.getDescriptionId(), "Poor Cut Ruby");
        translationBuilder.add(ModItems.FLAWED_CUT_RUBY.getDescriptionId(), "Flawed Cut Ruby");
        translationBuilder.add(ModItems.CUT_RUBY.getDescriptionId(), "Cut Ruby");
        translationBuilder.add(ModItems.FLAWLESS_CUT_RUBY.getDescriptionId(), "Flawless Cut Ruby");
        translationBuilder.add(ModItems.PERFECT_CUT_RUBY.getDescriptionId(), "Perfect Cut Ruby");

        translationBuilder.add(ModItems.POOR_CUT_SAPPHIRE.getDescriptionId(), "Poor Cut Sapphire");
        translationBuilder.add(ModItems.FLAWED_CUT_SAPPHIRE.getDescriptionId(), "Flawed Cut Sapphire");
        translationBuilder.add(ModItems.CUT_SAPPHIRE.getDescriptionId(), "Cut Sapphire");
        translationBuilder.add(ModItems.FLAWLESS_CUT_SAPPHIRE.getDescriptionId(), "Flawless Cut Sapphire");
        translationBuilder.add(ModItems.PERFECT_CUT_SAPPHIRE.getDescriptionId(), "Perfect Cut Sapphire");

        translationBuilder.add(ModItems.POOR_CUT_TOPAZ.getDescriptionId(), "Poor Cut Topaz");
        translationBuilder.add(ModItems.FLAWED_CUT_TOPAZ.getDescriptionId(), "Flawed Cut Topaz");
        translationBuilder.add(ModItems.CUT_TOPAZ.getDescriptionId(), "Cut Topaz");
        translationBuilder.add(ModItems.FLAWLESS_CUT_TOPAZ.getDescriptionId(), "Flawless Cut Topaz");
        translationBuilder.add(ModItems.PERFECT_CUT_TOPAZ.getDescriptionId(), "Perfect Cut Topaz");

        translationBuilder.add(ModItems.TIN_SOCKET.getDescriptionId(), "Tin Socket");
        translationBuilder.add(ModItems.ALUMINUM_SOCKET.getDescriptionId(), "Aluminum Socket");
        translationBuilder.add(ModItems.PLATINUM_SOCKET.getDescriptionId(), "Platinum Socket");
        translationBuilder.add(ModItems.TITANIUM_SOCKET.getDescriptionId(), "Titanium Socket");
        translationBuilder.add(ModItems.TUNGSTEN_SOCKET.getDescriptionId(), "Tungsten Socket");

        translationBuilder.add(ModBlocks.TIN_ORE.getDescriptionId(), "Tin Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_TIN_ORE.getDescriptionId(), "Deepslate Tin Ore");
        translationBuilder.add(ModBlocks.RAW_TIN_BLOCK.getDescriptionId(), "Raw Tin Block");
        translationBuilder.add(ModBlocks.TIN_BLOCK.getDescriptionId(), "Tin Block");

        translationBuilder.add(ModBlocks.ALUMINUM_ORE.getDescriptionId(), "Aluminum Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE.getDescriptionId(), "Deepslate Aluminum Ore");
        translationBuilder.add(ModBlocks.RAW_ALUMINUM_BLOCK.getDescriptionId(), "Raw Aluminum Block");
        translationBuilder.add(ModBlocks.ALUMINUM_BLOCK.getDescriptionId(), "Aluminum Block");

        translationBuilder.add(ModBlocks.PLATINUM_ORE.getDescriptionId(), "Platinum Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.getDescriptionId(), "Deepslate Platinum Ore");
        translationBuilder.add(ModBlocks.RAW_PLATINUM_BLOCK.getDescriptionId(), "Raw Platinum Block");
        translationBuilder.add(ModBlocks.PLATINUM_BLOCK.getDescriptionId(), "Platinum Block");

        translationBuilder.add(ModBlocks.TITANIUM_ORE.getDescriptionId(), "Titanium Ore");
        translationBuilder.add(ModBlocks.RAW_TITANIUM_BLOCK.getDescriptionId(), "Raw Titanium Block");
        translationBuilder.add(ModBlocks.TITANIUM_BLOCK.getDescriptionId(), "Titanium Block");

        translationBuilder.add(ModBlocks.TUNGSTEN_ORE.getDescriptionId(), "Tungsten Ore");
        translationBuilder.add(ModBlocks.RAW_TUNGSTEN_BLOCK.getDescriptionId(), "Raw Tungsten Block");
        translationBuilder.add(ModBlocks.TUNGSTEN_BLOCK.getDescriptionId(), "Tungsten Block");
    }
}
