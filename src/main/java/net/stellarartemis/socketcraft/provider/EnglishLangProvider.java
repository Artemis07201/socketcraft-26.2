package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.stellarartemis.socketcraft.block.ModBlocks;
import net.stellarartemis.socketcraft.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add("creativemodetab.socketcraft.socketcraft_items_tab", "SocketCraft Items");
        translationBuilder.add("creativemodetab.socketcraft.socketcraft_blocks_tab", "SocketCraft Blocks");

        for (Item item : ModItems.ITEM_LIST) {
            String path = item.getDescriptionId();
            path = path.substring(path.lastIndexOf('.') + 1);

            StringBuilder name = new StringBuilder();

            String[] parts = path.split("_");
            for (int i = 0; i < parts.length; i++) {
                name.append(Character.toUpperCase(parts[i].charAt(0)))
                        .append(parts[i].substring(1));

                if (i < parts.length - 1) {
                    name.append(' ');
                }
            }

            translationBuilder.add(item, name.toString());
        }

        for (Block block : ModBlocks.BLOCK_LIST) {
            String path = block.getDescriptionId();
            path = path.substring(path.lastIndexOf('.') + 1);

            StringBuilder name = new StringBuilder();

            String[] parts = path.split("_");
            for (int i = 0; i < parts.length; i++) {
                name.append(Character.toUpperCase(parts[i].charAt(0)))
                        .append(parts[i].substring(1));

                if (i < parts.length - 1) {
                    name.append(' ');
                }
            }

            translationBuilder.add(block, name.toString());
        }
    }
}
