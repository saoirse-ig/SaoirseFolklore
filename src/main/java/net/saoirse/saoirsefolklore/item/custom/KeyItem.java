package net.saoirse.saoirsefolklore.item.custom;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
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
    private static final Map<Block, Block> KEY_MAP =
            Map.of(
                    Blocks.GRASS_BLOCK, Blocks.DIRT
            );

    public KeyItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context){
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(KEY_MAP.containsKey(clickedBlock)){
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), KEY_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), ModSounds.KEY_USE.get(), SoundSource.BLOCKS);
            }
        }
        return InteractionResult.SUCCESS;
    }
}