package com.vtmcraft.treasure.common.item;

import com.vtmcraft.treasure.VtmMod;
import com.vtmcraft.treasure.common.CreativeTab;
import com.vtmcraft.treasure.register.SoundsEventRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.minecraft.util.*;

public class ItemSabiLaba extends Item {
    private static String name = "sabilaba";

    public ItemSabiLaba() {
        this.setRegistryName(name);
        this.setUnlocalizedName(VtmMod.MODID+"."+name);
        this.setCreativeTab(CreativeTab.VTM_CREATIVE_TAB);
        this.setMaxStackSize(1);
        this.setNoRepair();
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        //播放音效
        worldIn.playSound(null, playerIn.getPosition(), SoundsEventRegister.SaBi_Sound, SoundCategory.PLAYERS, 1.0f, 1.0f);
        //设置cd
        playerIn.getCooldownTracker().setCooldown(this, 60);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
