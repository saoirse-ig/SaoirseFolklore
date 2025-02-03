package net.saoirse.saoirsefolklore.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.saoirse.saoirsefolklore.SaoirseFolklore;
import net.saoirse.saoirsefolklore.item.custom.KeyItem;

import java.util.List;


public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SaoirseFolklore.MOD_ID);

    //BASIC ITEMS
    public static final DeferredItem<Item> RAW_DEEPIUM = ITEMS.register("raw_deepium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPIUM_INGOT = ITEMS.register("deepium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AWAKENED_DEEPIUM_INGOT = ITEMS.register("awakened_deepium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPIUM_DUST = ITEMS.register("deepium_dust",
            () -> new Item(new Item.Properties()));


    //JOKE ITEMS
    public static final DeferredItem<Item> KEY = ITEMS.register("key",
            () -> new KeyItem(new Item.Properties()));

    //SPECIAL / TOOLTIP ITEMS
    public static final DeferredItem<Item> EYE_OF_THE_DEEP = ITEMS.register("eye_of_the_deep",
            () -> new Item(new Item.Properties().stacksTo(16)){
        @Override
        public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag){
            if(Screen.hasShiftDown()) {
                tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.eye_of_the_deep.shift_down"));
            } else {
                tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.eye_of_the_deep"));
                tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.hold_shift_for_lore"));
            }
                super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
            }
    });

    public static final DeferredItem<Item> AWAKENED_EYE_OF_THE_DEEP = ITEMS.register("awakened_eye_of_the_deep",
            () -> new Item(new Item.Properties().stacksTo(16)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag){
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.awakened_eye_of_the_deep.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.awakened_eye_of_the_deep"));
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.hold_shift_for_lore"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    // WEAPONS
    public static final DeferredItem<SwordItem> AWAKENED_DEEPIUM_DAGGER = ITEMS.register("awakened_deepium_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -2, 1.5f))));

    public static final DeferredItem<SwordItem> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -1, 1.5f))));

    public static final DeferredItem<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -1.5f, 1.5f))));

    public static final DeferredItem<SwordItem> GOLD_DAGGER = ITEMS.register("gold_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -1, 1.5f))));

    public static final DeferredItem<SwordItem> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -2, 1.5f))));

    public static final DeferredItem<SwordItem> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 1.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 2, -2))));

    public static final DeferredItem<SwordItem> GOLD_SCYTHE = ITEMS.register("gold_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 1.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    //HELPER METHODS




    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
