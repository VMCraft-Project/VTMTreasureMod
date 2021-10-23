package com.vtmcraft.vtmreasure.common.item.food;

import com.vtmcraft.vtmreasure.init.itemgroup.VtmItemGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ItemStrawberryMilk extends Item {

    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 5, 1), 1)
            .alwaysEat()
            .build();


    public ItemStrawberryMilk() {
        super(new Properties().tab(VtmItemGroup.vtmItemGroup).food(food));
    }

}