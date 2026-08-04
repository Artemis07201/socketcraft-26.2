package net.stellarartemis.socketcraft.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.profiling.metrics.MetricSampler;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.stellarartemis.socketcraft.SocketCraft;

import java.util.List;
import java.util.function.Function;

public class ModItems {
    // Raw Metals
    public static final Item RAW_TIN = registerItem("raw_tin", Item::new);
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", Item::new);
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", Item::new);
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", Item::new);
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", Item::new);

    // Metal Ingots
    public static final Item TIN_INGOT = registerItem("tin_ingot", Item::new);
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", Item::new);
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", Item::new);
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", Item::new);
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", Item::new);

    // Added Gems
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item TOPAZ = registerItem("topaz", Item::new);

    // Cut Diamonds
    public static final Item POOR_CUT_DIAMOND = registerItem("poor_cut_diamond", Item::new);
    public static final Item FLAWED_CUT_DIAMOND = registerItem("flawed_cut_diamond", Item::new);
    public static final Item CUT_DIAMOND = registerItem("cut_diamond", Item::new);
    public static final Item FLAWLESS_CUT_DIAMOND = registerItem("flawless_cut_diamond", Item::new);
    public static final Item PERFECT_CUT_DIAMOND = registerItem("perfect_cut_diamond", Item::new);

    // Cut Rubies
    public static final Item POOR_CUT_RUBY = registerItem("poor_cut_ruby", Item::new);
    public static final Item FLAWED_CUT_RUBY = registerItem("flawed_cut_ruby", Item::new);
    public static final Item CUT_RUBY = registerItem("cut_ruby", Item::new);
    public static final Item FLAWLESS_CUT_RUBY = registerItem("flawless_cut_ruby", Item::new);
    public static final Item PERFECT_CUT_RUBY = registerItem("perfect_cut_ruby", Item::new);

    // Cut Sapphires
    public static final Item POOR_CUT_SAPPHIRE = registerItem("poor_cut_sapphire", Item::new);
    public static final Item FLAWED_CUT_SAPPHIRE = registerItem("flawed_cut_sapphire", Item::new);
    public static final Item CUT_SAPPHIRE = registerItem("cut_sapphire", Item::new);
    public static final Item FLAWLESS_CUT_SAPPHIRE = registerItem("flawless_cut_sapphire", Item::new);
    public static final Item PERFECT_CUT_SAPPHIRE = registerItem("perfect_cut_sapphire", Item::new);

    // Cut Topazes
    public static final Item POOR_CUT_TOPAZ = registerItem("poor_cut_topaz", Item::new);
    public static final Item FLAWED_CUT_TOPAZ = registerItem("flawed_cut_topaz", Item::new);
    public static final Item CUT_TOPAZ = registerItem("cut_topaz", Item::new);
    public static final Item FLAWLESS_CUT_TOPAZ = registerItem("flawless_cut_topaz", Item::new);
    public static final Item PERFECT_CUT_TOPAZ = registerItem("perfect_cut_topaz", Item::new);

    // Sockets
    public static final Item TIN_SOCKET = registerItem("tin_socket", Item::new);
    public static final Item ALUMINUM_SOCKET = registerItem("aluminum_socket", Item::new);
    public static final Item PLATINUM_SOCKET = registerItem("platinum_socket", Item::new);
    public static final Item TITANIUM_SOCKET = registerItem("titanium_socket", Item::new);
    public static final Item TUNGSTEN_SOCKET = registerItem("tungsten_socket", Item::new);

    public static final List<Item> ITEM_LIST = List.of(
            RAW_TIN, RAW_ALUMINUM, RAW_PLATINUM, RAW_TITANIUM, RAW_TUNGSTEN,
            TIN_INGOT, ALUMINUM_INGOT, PLATINUM_INGOT, TITANIUM_INGOT, TUNGSTEN_INGOT,
            RUBY, SAPPHIRE, TOPAZ,
            POOR_CUT_DIAMOND, FLAWED_CUT_DIAMOND, CUT_DIAMOND, FLAWLESS_CUT_DIAMOND, PERFECT_CUT_DIAMOND,
            POOR_CUT_RUBY, FLAWED_CUT_RUBY, CUT_RUBY, FLAWLESS_CUT_RUBY, PERFECT_CUT_RUBY,
            POOR_CUT_SAPPHIRE, FLAWED_CUT_SAPPHIRE, CUT_SAPPHIRE, FLAWLESS_CUT_SAPPHIRE, PERFECT_CUT_SAPPHIRE,
            POOR_CUT_TOPAZ, FLAWED_CUT_TOPAZ, CUT_TOPAZ, FLAWLESS_CUT_TOPAZ, PERFECT_CUT_TOPAZ,
            TIN_SOCKET, ALUMINUM_SOCKET, PLATINUM_SOCKET, TITANIUM_SOCKET, TUNGSTEN_SOCKET
    );

    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, SocketCraft.id(name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, SocketCraft.id(name)))));
    }

    public static void registerModItems() {
        SocketCraft.LOGGER.info("Registering mod items for " + SocketCraft.MOD_ID);
    }
}
