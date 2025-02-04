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


    //JOKE / MISC ITEMS
    public static final DeferredItem<Item> KEY = ITEMS.register("key",
            () -> new KeyItem(new Item.Properties()));

    //SPECIAL / TOOLTIP ITEMS
    public static final DeferredItem<Item> OLD_COIN = ITEMS.register("old_coin",
            () -> new Item(new Item.Properties().stacksTo(16)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag){
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                        tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.old_coin"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> AMETHYST_COIN = ITEMS.register("amethyst_coin",
            () -> new Item(new Item.Properties().stacksTo(16)){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag){
                    tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.blank_line"));
                    tooltipComponents.add(Component.translatable("tooltip.saoirsefolklore.amethyst_coin"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

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

    // DAGGERS
    public static final DeferredItem<SwordItem> AWAKENED_DEEPIUM_DAGGER = ITEMS.register("awakened_deepium_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -2, 0))));

    public static final DeferredItem<SwordItem> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -2, 0))));

    public static final DeferredItem<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -1.5f, 0))));

    public static final DeferredItem<SwordItem> GOLD_DAGGER = ITEMS.register("gold_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -2.5f, 0))));

    public static final DeferredItem<SwordItem> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, -1f, 0))));

    public static final DeferredItem<SwordItem> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 0.0f, 0))));


    // SCYTHES
    public static final DeferredItem<SwordItem> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 1.5f, -6))));

    public static final DeferredItem<SwordItem> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 2, -6))));

    public static final DeferredItem<SwordItem> GOLD_SCYTHE = ITEMS.register("gold_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 1.5f, -6))));

    public static final DeferredItem<SwordItem> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -6))));

    public static final DeferredItem<SwordItem> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -6))));

    //GREATSWORDS

    public static final DeferredItem<SwordItem> COPPER_GREATSWORD = ITEMS.register("copper_greatsword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_GREATSWORD = ITEMS.register("gold_greatsword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //SHORT SWORDS

    public static final DeferredItem<SwordItem> COPPER_SHORT_SWORD = ITEMS.register("copper_short_sword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_SHORT_SWORD = ITEMS.register("iron_short_sword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_SHORT_SWORD = ITEMS.register("gold_short_sword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_SHORT_SWORD = ITEMS.register("diamond_short_sword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_SHORT_SWORD = ITEMS.register("netherite_short_sword",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //GREAT AXES

    public static final DeferredItem<SwordItem> COPPER_GREAT_AXE = ITEMS.register("copper_great_axe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_GREAT_AXE = ITEMS.register("iron_great_axe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_GREAT_AXE = ITEMS.register("gold_great_axe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_GREAT_AXE = ITEMS.register("diamond_great_axe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_GREAT_AXE = ITEMS.register("netherite_great_axe",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //GREAT MACES

    public static final DeferredItem<SwordItem> COPPER_GREAT_MACE = ITEMS.register("copper_great_mace",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_GREAT_MACE = ITEMS.register("iron_great_mace",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_GREAT_MACE = ITEMS.register("gold_great_mace",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_GREAT_MACE = ITEMS.register("diamond_great_mace",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_GREAT_MACE = ITEMS.register("netherite_great_mace",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //HALBERDS

    public static final DeferredItem<SwordItem> COPPER_HALBERD = ITEMS.register("copper_halberd",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_HALBERD = ITEMS.register("iron_halberd",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_HALBERD = ITEMS.register("gold_halberd",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_HALBERD = ITEMS.register("diamond_halberd",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_HALBERD = ITEMS.register("netherite_halberd",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //ESTOCS

    public static final DeferredItem<SwordItem> COPPER_ESTOC = ITEMS.register("copper_estoc",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_ESTOC = ITEMS.register("iron_estoc",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_ESTOC = ITEMS.register("gold_estoc",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_ESTOC = ITEMS.register("diamond_estoc",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_ESTOC = ITEMS.register("netherite_estoc",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));


    //RAPIER

    public static final DeferredItem<SwordItem> COPPER_RAPIER = ITEMS.register("copper_rapier",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> IRON_RAPIER = ITEMS.register("iron_rapier",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> GOLD_RAPIER = ITEMS.register("gold_rapier",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> DIAMOND_RAPIER = ITEMS.register("diamond_rapier",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));

    public static final DeferredItem<SwordItem> NETHERITE_RAPIER = ITEMS.register("netherite_rapier",
            () -> new SwordItem(ModToolTiers.DEEPIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEEPIUM, 3.5f, -2))));



    //HELPER METHODS




    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
