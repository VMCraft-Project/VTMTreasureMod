package com.vtmcraft.vtmreasure.init.itemgroup;

import com.vtmcraft.vtmreasure.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class VtmItemGroup extends ItemGroup {

    public static final VtmItemGroup vtmItemGroup = new VtmItemGroup();

    public VtmItemGroup() {
        super("VTMTreasure");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.SABILABA_ITEM.get());
    }
}
