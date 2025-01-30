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

    public static final Supplier<CreativeModeTab> SAOIRSE_FOLKLORE_TAB = CREATIVE_MODE_TAB.register("saoirse_folklore_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEEPIUM_INGOT.get()))
                    .title(Component.translatable("Saoirse's Folklore Mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_DEEPIUM);
                        output.accept(ModItems.DEEPIUM_INGOT);
                        output.accept(ModBlocks.DEEPIUM_ORE);
                        output.accept(ModBlocks.DEEPIUM_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
