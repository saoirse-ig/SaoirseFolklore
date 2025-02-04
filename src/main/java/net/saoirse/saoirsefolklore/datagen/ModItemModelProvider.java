package net.saoirse.saoirsefolklore.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.saoirse.saoirsefolklore.SaoirseFolklore;
import net.saoirse.saoirsefolklore.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SaoirseFolklore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DEEPIUM_DUST.get());
        basicItem(ModItems.EYE_OF_THE_DEEP.get());
        basicItem(ModItems.RAW_DEEPIUM.get());
        basicItem(ModItems.DEEPIUM_INGOT.get());
        basicItem(ModItems.AWAKENED_DEEPIUM_INGOT.get());
        basicItem(ModItems.AWAKENED_EYE_OF_THE_DEEP.get());
        basicItem(ModItems.OLD_COIN.get());
        basicItem(ModItems.AMETHYST_COIN.get());

        handheldItem(ModItems.COPPER_DAGGER.get());
        handheldItem(ModItems.IRON_DAGGER.get());
        handheldItem(ModItems.GOLD_DAGGER.get());
        handheldItem(ModItems.DIAMOND_DAGGER.get());
        handheldItem(ModItems.NETHERITE_DAGGER.get());

        handheldItem(ModItems.COPPER_SHORT_SWORD.get());
        handheldItem(ModItems.IRON_SHORT_SWORD.get());
        handheldItem(ModItems.GOLD_SHORT_SWORD.get());
        handheldItem(ModItems.DIAMOND_SHORT_SWORD.get());
        handheldItem(ModItems.NETHERITE_SHORT_SWORD.get());

        handheldItem(ModItems.COPPER_SCYTHE.get());
        handheldItem(ModItems.IRON_SCYTHE.get());
        handheldItem(ModItems.GOLD_SCYTHE.get());
        handheldItem(ModItems.DIAMOND_SCYTHE.get());
        handheldItem(ModItems.NETHERITE_SCYTHE.get());

        handheldItem(ModItems.COPPER_GREATSWORD.get());
        handheldItem(ModItems.IRON_GREATSWORD.get());
        handheldItem(ModItems.GOLD_GREATSWORD.get());
        handheldItem(ModItems.DIAMOND_GREATSWORD.get());
        handheldItem(ModItems.NETHERITE_GREATSWORD.get());

        handheldItem(ModItems.COPPER_GREAT_AXE.get());
        handheldItem(ModItems.IRON_GREAT_AXE.get());
        handheldItem(ModItems.GOLD_GREAT_AXE.get());
        handheldItem(ModItems.DIAMOND_GREAT_AXE.get());
        handheldItem(ModItems.NETHERITE_GREAT_AXE.get());

        handheldItem(ModItems.COPPER_GREAT_MACE.get());
        handheldItem(ModItems.IRON_GREAT_MACE.get());
        handheldItem(ModItems.GOLD_GREAT_MACE.get());
        handheldItem(ModItems.DIAMOND_GREAT_MACE.get());
        handheldItem(ModItems.NETHERITE_GREAT_MACE.get());

        halberdItem(ModItems.COPPER_HALBERD);
        halberdItem(ModItems.IRON_HALBERD);
        halberdItem(ModItems.GOLD_HALBERD);
        halberdItem(ModItems.DIAMOND_HALBERD);
        halberdItem(ModItems.NETHERITE_HALBERD);

        handheldItem(ModItems.COPPER_ESTOC.get());
        handheldItem(ModItems.IRON_ESTOC.get());
        handheldItem(ModItems.GOLD_ESTOC.get());
        handheldItem(ModItems.DIAMOND_ESTOC.get());
        handheldItem(ModItems.NETHERITE_ESTOC.get());

        handheldItem(ModItems.COPPER_RAPIER.get());
        handheldItem(ModItems.IRON_RAPIER.get());
        handheldItem(ModItems.GOLD_RAPIER.get());
        handheldItem(ModItems.DIAMOND_RAPIER.get());
        handheldItem(ModItems.NETHERITE_RAPIER.get());


        basicItem(ModItems.KEY.get());

        handheldItem(ModItems.AWAKENED_DEEPIUM_DAGGER);
    }

    private ItemModelBuilder halberdItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(SaoirseFolklore.MOD_ID, "item/" + item.getId().getPath()))
                .transforms()

                // Third-person right hand (holding the item as a weapon)
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)
                .rotation(-55, -90, 0)
                .translation(0f, 0.50f, 0)
                .scale(2.125F, 2.0F, 1.0F)
                .end()
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND)
                .rotation(-55, -90, 0)
                .translation(0f, 0.50f, 0)
                .scale(2.125F, 2.0F, 1.0F)
                .end()
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND)
                .rotation(-0, -0, 0)
                .translation(0f, 0.50f, 0)
                .scale(0.85f, 0.85F, 0.4F)
                .end()
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND)
                .rotation(-0, 90, -30)
                .translation(0f, 0.50f, 0)
                .scale(0.85f, 0.85F, 0.4F)
                .end()
                .end();
    }



    private ItemModelBuilder handheldItem(DeferredItem<?> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SaoirseFolklore.MOD_ID,"item/" + item.getId().getPath()));
    }
}
