package com.vtmcraft.treasure.common.item;

import com.vtmcraft.treasure.VtmMod;
import com.vtmcraft.treasure.common.CreativeTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class ItemStrawberryMilk extends ItemFood {
    private static final String name = "strawberry_milk";

    public ItemStrawberryMilk() {
        super(1, 0.6f, false);
        this.setRegistryName(name);
        this.setUnlocalizedName(VtmMod.MODID + "." + name);
        this.setCreativeTab(CreativeTab.VTM_CREATIVE_TAB);
        this.setNoRepair();
        this.setAlwaysEdible();
    }

    @ParametersAreNonnullByDefault
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2048, 5));
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
