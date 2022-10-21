package net.PlayerNo007.nvmod.event;
import net.PlayerNo007.nvmod.NVMod;

import net.PlayerNo007.nvmod.particle.ModParticles;
import net.PlayerNo007.nvmod.particle.custom.HideSmokeParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = NVMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(

        );
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.HIDE_SMOKE_PARTICLES.get(),
                HideSmokeParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.HIDE_SMOKE_PARTICLES2.get(),
                HideSmokeParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.HIDE_SMOKE_PARTICLES3.get(),
                HideSmokeParticles.Provider::new);
    }


}