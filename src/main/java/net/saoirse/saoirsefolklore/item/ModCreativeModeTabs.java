package net.saoirse.saoirsefolklore.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.saoirse.saoirsefolklore.SaoirseFolklore;
import net.saoirse.saoirsefolklore.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SaoirseFolklore.MOD_ID);

    public static final Supplier<CreativeModeTab> SAOIRSE_FOLKLORE_ITEMS_TAB = CREATIVE_MODE_TAB.register("saoirse_folklore_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEEPIUM_INGOT.get()))
                    .title(Component.translatable("Folklore Items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_DEEPIUM);
                        output.accept(ModItems.DEEPIUM_INGOT);
                        output.accept(ModItems.DEEPIUM_DUST);

                        output.accept(ModItems.OLD_COIN);
                        output.accept(ModItems.AMETHYST_COIN);

                        output.accept(ModItems.EYE_OF_THE_DEEP);
                        output.accept(ModItems.AWAKENED_DEEPIUM_INGOT);
                        output.accept(ModItems.AWAKENED_EYE_OF_THE_DEEP);
                    }).build());

    public static final Supplier<CreativeModeTab> SAOIRSE_FOLKLORE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("saoirse_folklore_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DEEPIUM_BLOCK.get()))
                    .title(Component.translatable("Folklore Blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DEEPIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_DEEPIUM_ORE);
                        output.accept(ModBlocks.RAW_DEEPIUM_BLOCK);
                        output.accept(ModBlocks.DEEPIUM_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> SAOIRSE_FOLKLORE_TOOLS_TAB = CREATIVE_MODE_TAB.register("saoirse_folklore_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AWAKENED_DEEPIUM_DAGGER.get()))
                    .title(Component.translatable("Folklore Tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KEY);

                        output.accept(ModItems.COPPER_DAGGER);
                        output.accept(ModItems.IRON_DAGGER);
                        output.accept(ModItems.GOLD_DAGGER);
                        output.accept(ModItems.DIAMOND_DAGGER);
                        output.accept(ModItems.NETHERITE_DAGGER);

                        output.accept(ModItems.COPPER_SHORT_SWORD);
                        output.accept(ModItems.IRON_SHORT_SWORD);
                        output.accept(ModItems.GOLD_SHORT_SWORD);
                        output.accept(ModItems.DIAMOND_SHORT_SWORD);
                        output.accept(ModItems.NETHERITE_SHORT_SWORD);

                        output.accept(ModItems.COPPER_SCYTHE);
                        output.accept(ModItems.IRON_SCYTHE);
                        output.accept(ModItems.GOLD_SCYTHE);
                        output.accept(ModItems.DIAMOND_SCYTHE);
                        output.accept(ModItems.NETHERITE_SCYTHE);

                        output.accept(ModItems.COPPER_GREATSWORD);
                        output.accept(ModItems.IRON_GREATSWORD);
                        output.accept(ModItems.GOLD_GREATSWORD);
                        output.accept(ModItems.DIAMOND_GREATSWORD);
                        output.accept(ModItems.NETHERITE_GREATSWORD);

                        output.accept(ModItems.COPPER_GREAT_AXE);
                        output.accept(ModItems.IRON_GREAT_AXE);
                        output.accept(ModItems.GOLD_GREAT_AXE);
                        output.accept(ModItems.DIAMOND_GREAT_AXE);
                        output.accept(ModItems.NETHERITE_GREAT_AXE);

                        output.accept(ModItems.COPPER_GREAT_MACE);
                        output.accept(ModItems.IRON_GREAT_MACE);
                        output.accept(ModItems.GOLD_GREAT_MACE);
                        output.accept(ModItems.DIAMOND_GREAT_MACE);
                        output.accept(ModItems.NETHERITE_GREAT_MACE);

                        output.accept(ModItems.COPPER_HALBERD);
                        output.accept(ModItems.IRON_HALBERD);
                        output.accept(ModItems.GOLD_HALBERD);
                        output.accept(ModItems.DIAMOND_HALBERD);
                        output.accept(ModItems.NETHERITE_HALBERD);

                        output.accept(ModItems.COPPER_RAPIER);
                        output.accept(ModItems.IRON_RAPIER);
                        output.accept(ModItems.GOLD_RAPIER);
                        output.accept(ModItems.DIAMOND_RAPIER);
                        output.accept(ModItems.NETHERITE_RAPIER);

                        output.accept(ModItems.COPPER_ESTOC);
                        output.accept(ModItems.IRON_ESTOC);
                        output.accept(ModItems.GOLD_ESTOC);
                        output.accept(ModItems.DIAMOND_ESTOC);
                        output.accept(ModItems.NETHERITE_ESTOC);

                    }).build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
