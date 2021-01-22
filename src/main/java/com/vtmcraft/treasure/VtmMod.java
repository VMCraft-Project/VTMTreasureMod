package com.vtmcraft.treasure;

import com.vtmcraft.treasure.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = VtmMod.MODID, name = VtmMod.NAME, version = VtmMod.VERSION)
public class VtmMod
{
    public static final String MODID = "vtmtreasure";
    public static final String NAME = "VTMTreasure Mod";
    public static final String VERSION = "1.0";

    @Mod.Instance(VtmMod.MODID)
    private static VtmMod instance;

    @SidedProxy
            (clientSide = "com.vtmcraft.treasure.proxy.ClientProxy",
                    serverSide = "com.vtmcraft.treasure.proxy.CommonProxy"
            )
    private static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("preInit");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }
}