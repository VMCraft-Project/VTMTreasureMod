package com.vtmcraft.vtmreasure.common.item;

import com.vtmcraft.vtmreasure.init.SoundInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemSabiLaba extends Item {

    public ItemSabiLaba(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        worldIn.playSound(null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), SoundInit.sabiSound.get(), SoundCategory.PLAYERS, 1.0f, 1.0f);
        playerIn.getCooldowns().addCooldown(this, 60);

        return super.use(worldIn, playerIn, handIn);
    }
}
