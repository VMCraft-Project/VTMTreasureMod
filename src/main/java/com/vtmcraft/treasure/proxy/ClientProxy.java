package com.vtmcraft.treasure.proxy;

import com.vtmcraft.treasure.register.ModelsRegister;
import com.vtmcraft.treasure.register.SoundsEventRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        new SoundsEventRegister();
        new ModelsRegister();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
}