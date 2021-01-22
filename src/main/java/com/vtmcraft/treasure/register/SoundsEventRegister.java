package com.vtmcraft.treasure.register;

import com.vtmcraft.treasure.VtmMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class SoundsEventRegister {
    public static SoundEvent SaBi_Sound = return_event("sabi");

    public SoundsEventRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static SoundEvent return_event(String name) {
        return new SoundEvent(new ResourceLocation(VtmMod.MODID, name)).setRegistryName(name);
    }

    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<SoundEvent> event){
        final SoundEvent[] soundEvents = {
            SaBi_Sound
        };
        event.getRegistry().registerAll(soundEvents);
    }
}
