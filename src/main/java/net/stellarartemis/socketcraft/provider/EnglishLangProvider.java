package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
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
    }
}
