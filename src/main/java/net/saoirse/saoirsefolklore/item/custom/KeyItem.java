package net.saoirse.saoirsefolklore.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.saoirse.saoirsefolklore.sound.ModSounds;

import java.util.Map;

public class KeyItem extends Item {
    private static final Map<Block, Block> Key_Map =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.GRASS_BLOCK, Blocks.END_STONE,
                    Blocks.IRON_BLOCK, Blocks.DIAMOND_BLOCK
            );

    public KeyItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        level.playSound(null, context.getClickedPos(), ModSounds.KEY_USE.get(), SoundSource.BLOCKS);


        return InteractionResult.SUCCESS;
    }
}