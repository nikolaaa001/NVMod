package net.PlayerNo007.nvmod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties ORANGE_JUICE = new FoodProperties.Builder().nutrition(6).alwaysEat().saturationMod(1.2F)
            .effect(()->new MobEffectInstance(MobEffects.HEAL,200),0.5f)
            .effect(()->new MobEffectInstance(MobEffects.JUMP,200),1f).alwaysEat().build();
    public static final FoodProperties RED_CARROT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();

    public static final FoodProperties RED_CARROT_JUICE = new FoodProperties.Builder().nutrition(6).saturationMod(1.2F)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST,200),0.30f)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200),1f).alwaysEat().build();

}
