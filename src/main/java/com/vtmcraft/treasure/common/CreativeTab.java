package com.vtmcraft.treasure.common;

import com.vtmcraft.treasure.register.ItemsRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab {
    public static final CreativeTabs VTM_CREATIVE_TAB = new CreativeTabs("vtmtreasuretitle") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegister.SABILABA);
        }
    };
}
