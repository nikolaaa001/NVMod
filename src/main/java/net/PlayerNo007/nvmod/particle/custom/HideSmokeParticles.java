package net.PlayerNo007.nvmod.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HideSmokeParticles extends TextureSheetParticle {
    protected HideSmokeParticles(ClientLevel level, double xCoord, double yCoord, double zCoord,
                                 SpriteSet spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.friction = 0F;
        this.xd = xd;
        this.yd = yd;
        this.zd = zd;
        //this should change the size
        this.quadSize *= 12;
        this.lifetime = 120;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 55;
        this.gCol = 55;
        this.bCol = 55;
    }

    @Override
    public void tick() {
        super.tick();
        //fadeOut();
    }


    //method to fade out, I do not know if I will need it..
    /*private void fadeOut() {
        this.alpha = (-(1/(float)lifetime) * age + 1);
    }*/

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level,
                                       double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new HideSmokeParticles(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
