package com.vtmcraft.treasure.common.item;

import com.vtmcraft.treasure.VtmMod;
import com.vtmcraft.treasure.common.CreativeTab;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemSabiLaba extends Item {
    private static String name = "sabilaba";

    public ItemSabiLaba() {
        this.setRegistryName(name);
        this.setUnlocalizedName(VtmMod.MODID+"."+name);
        this.setCreativeTab(CreativeTab.VTM_CREATIVE_TAB);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        //播放音效
        //Entity entity = (Entity) playerIn;
        ResourceLocation location = new ResourceLocation("vtmtreasure:sabi");
        SoundEvent soundEvent = new SoundEvent(location);
        //playerIn.getEntityWorld().playSound(null, playerIn.getPosition(), soundEvent, SoundCategory.PLAYERS, 1.0f, 1.0f);
        //设置cd
        playerIn.getCooldownTracker().setCooldown(this, 60);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
