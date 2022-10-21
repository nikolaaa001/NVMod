package net.PlayerNo007.nvmod.particle;

import net.PlayerNo007.nvmod.NVMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NVMod.MOD_ID);

    public static final RegistryObject<SimpleParticleType> HIDE_SMOKE_PARTICLES =
            PARTICLE_TYPES.register("hide_smoke_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> HIDE_SMOKE_PARTICLES2 =
            PARTICLE_TYPES.register("hide_smoke_particles_dos", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> HIDE_SMOKE_PARTICLES3 =
            PARTICLE_TYPES.register("hide_smoke_particles_tres", () -> new SimpleParticleType(true));


    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
