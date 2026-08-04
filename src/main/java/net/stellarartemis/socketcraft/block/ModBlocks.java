package net.stellarartemis.socketcraft.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.stellarartemis.socketcraft.SocketCraft;

import java.util.List;
import java.util.function.Function;

public class ModBlocks {
    public static final Block TIN_ORE = registerBlock("tin_ore",
            properties -> new Block(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            properties -> new Block(properties.strength(4.5F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore",
            properties -> new Block(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            properties -> new Block(properties.strength(4.5F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            properties -> new Block(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            properties -> new Block(properties.strength(4.5F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            properties -> new Block(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));

    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            properties -> new Block(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));

    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            properties -> new Block(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    
    public static final List<Block> BLOCK_LIST = List.of(
            TIN_ORE, DEEPSLATE_TIN_ORE, RAW_TIN_BLOCK, TIN_BLOCK,
            ALUMINUM_ORE, DEEPSLATE_ALUMINUM_ORE, RAW_ALUMINUM_BLOCK, ALUMINUM_BLOCK,
            PLATINUM_ORE, DEEPSLATE_PLATINUM_ORE, RAW_PLATINUM_BLOCK, PLATINUM_BLOCK,
            TITANIUM_ORE, RAW_TITANIUM_BLOCK, TITANIUM_BLOCK,
            TUNGSTEN_ORE, RAW_TUNGSTEN_BLOCK, TUNGSTEN_BLOCK
    );

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, SocketCraft.id(name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, SocketCraft.id(name), toRegister);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, SocketCraft.id(name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, SocketCraft.id(name)))));
    }

    public static void registerModBlocks() {
        SocketCraft.LOGGER.info("Registering mod blocks for " + SocketCraft.MOD_ID);
    }
}
