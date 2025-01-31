package net.saoirse.saoirsefolklore.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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

    }
}
