package com.vtmcraft.treasure.register;

import com.vtmcraft.treasure.common.item.ItemSabiLaba;
import com.vtmcraft.treasure.common.item.ItemStrawberryMilk;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemsRegister {
    public static final Item SABILABA = new ItemSabiLaba();
    public static final Item StrawberryMilk = new ItemStrawberryMilk();

    public ItemsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                SABILABA,
                StrawberryMilk
        );
    }
}
