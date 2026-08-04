package net.stellarartemis.socketcraft.creativeModeTab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.stellarartemis.socketcraft.SocketCraft;
import net.stellarartemis.socketcraft.block.ModBlocks;
import net.stellarartemis.socketcraft.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab SOCKETCRAFT_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            SocketCraft.id("socketcraft_items_tab"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TUNGSTEN_INGOT))
                    .title(Component.translatable("creativemodetab.socketcraft.socketcraft_items_tab"))
                    .displayItems(((parameters, output) -> {
                        for (Item item : ModItems.ITEM_LIST) {
                            output.accept(item);
                        }
                    }))
                    .build());

    public static final CreativeModeTab SOCKETCRAFT_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            SocketCraft.id("socketcraft_blocks_tab"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.TUNGSTEN_BLOCK))
                    .title(Component.translatable("creativemodetab.socketcraft.socketcraft_blocks_tab"))
                    .displayItems(((parameters, output) -> {
                        for (Block block : ModBlocks.BLOCK_LIST) {
                            output.accept(block);
                        }
                    }))
                    .build());

    public static void registerModCreativeModeTabs() {
        SocketCraft.LOGGER.info("Registering creative mode tabs for " + SocketCraft.MOD_ID);
    }
}
