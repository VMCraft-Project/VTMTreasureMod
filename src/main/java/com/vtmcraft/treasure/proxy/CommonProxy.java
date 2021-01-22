package com.vtmcraft.treasure.proxy;

import com.vtmcraft.treasure.register.ItemsRegister;
import com.vtmcraft.treasure.register.SoundsEventRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new SoundsEventRegister();
        new ItemsRegister();
    }

    public void init(FMLInitializationEvent event) {

    }

}