package com.vtmcraft.vtmreasure.init;

import com.vtmcraft.vtmreasure.VtmMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VtmMod.MODID);

    public static final RegistryObject<SoundEvent> sabiSound = SOUNDS.register("sabi", () -> new SoundEvent(new ResourceLocation(VtmMod.MODID, "sabi")));

}
