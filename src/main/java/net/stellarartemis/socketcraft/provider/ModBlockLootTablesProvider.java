package net.stellarartemis.socketcraft.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.stellarartemis.socketcraft.block.ModBlocks;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTablesProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTablesProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        for (Block block : ModBlocks.DROP_SELF) {
            dropSelf(block);
        }

        for (Block block : ModBlocks.DROP_WHEN_SILK_TOUCH) {
            dropWhenSilkTouch(block);
        }

        for (Map.Entry<Block, Item> entry : ModBlocks.ORE_DROPS.entrySet()) {
            Block block = entry.getKey();
            Item item = entry.getValue();

            add(block, LootTable.lootTable().withPool(applyExplosionCondition(item, LootPool.lootPool()
                    .setRolls(new ConstantValue(1))
                    .add(LootItem.lootTableItem(item)))));
        }

        for (Map.Entry<Block, Item> entry : ModBlocks.ORE_DROPS_WITH_FORTUNE.entrySet()) {
            Block block = entry.getKey();
            Item item = entry.getValue();

            add(block, LootTable.lootTable().withPool(applyExplosionCondition(item, LootPool.lootPool()
                    .setRolls(new ConstantValue(1))
                    .add(LootItem.lootTableItem(item)
                            .apply(ApplyBonusCount.addOreBonusCount(registries.lookupOrThrow(Registries.ENCHANTMENT)
                                    .getOrThrow(Enchantments.FORTUNE)))))));
        }
    }
}
