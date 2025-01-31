package net.saoirse.saoirsefolklore.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.saoirse.saoirsefolklore.block.ModBlocks;
import net.saoirse.saoirsefolklore.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider( HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.DEEPIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_DEEPIUM_BLOCK.get());

        add(ModBlocks.DEEPIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPIUM_ORE.get(),
                        ModItems.RAW_DEEPIUM.get(), 1, 2));

        add(ModBlocks.DEEPSLATE_DEEPIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_DEEPIUM_ORE.get(),
                        ModItems.RAW_DEEPIUM.get(), 1, 3));
 /*
        add(ModBlocks.DEEPIUM_ORE.get(),
        block -> createOreDrop(ModBlocks.DEEPIUM_ORE.get(), ModItems.RAW_DEEPIUM.get()));

 */
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops){
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply((ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
