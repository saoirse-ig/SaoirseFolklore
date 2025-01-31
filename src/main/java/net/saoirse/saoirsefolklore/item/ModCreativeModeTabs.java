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
                        output.accept(ModItems.AWAKENED_DEEPIUM_DAGGER);
                    }).build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
