package net.saoirse.saoirsefolklore.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.saoirse.saoirsefolklore.util.ModTags;

public class ModToolTiers {
    public static final Tier DEEPIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_DEEPIUM_TOOL,
            1400, 4f, 3f, 18, () -> Ingredient.of(ModItems.DEEPIUM_INGOT));
}
