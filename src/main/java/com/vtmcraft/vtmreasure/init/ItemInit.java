package com.vtmcraft.vtmreasure.init;

import com.vtmcraft.vtmreasure.VtmMod;
import com.vtmcraft.vtmreasure.common.item.ItemSabiLaba;
import com.vtmcraft.vtmreasure.common.item.food.ItemStrawberryMilk;
import com.vtmcraft.vtmreasure.init.itemgroup.VtmItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VtmMod.MODID);

    public static final RegistryObject<ItemSabiLaba> SABILABA_ITEM =
            ITEMS.register("sabilaba_item",
            () -> new ItemSabiLaba(new Item.Properties().tab(VtmItemGroup.vtmItemGroup)));

    //public static final RegistryObject<ItemStrawberryMilk> STRAWBERRYMILK_ITEM =
            //ITEMS.register("Strawberry_Milk_item", ItemStrawberryMilk::new);
}
