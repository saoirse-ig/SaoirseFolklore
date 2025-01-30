package net.saoirse.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.saoirse.saoirsefolklore.SaoirseFolklore;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SaoirseFolklore.MOD_ID);

    public static final DeferredItem<Item> RAW_DEEPIUM = ITEMS.register("raw_deepium",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
