package net.PlayerNo007.nvmod.item.custom;

import net.PlayerNo007.nvmod.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class SmokeBag extends Item {
    public SmokeBag(Properties pProperties) {
        super(pProperties);
    }


    public InteractionResultHolder<ItemStack> use(Level p_41190_, Player p_41191_, InteractionHand p_41192_){
        ItemStack itemstack = p_41191_.getItemInHand(p_41192_);
        p_41191_.awardStat(Stats.ITEM_USED.get(this));
        if (!p_41191_.getAbilities().instabuild) {
            itemstack.shrink(1);
        }
        BlockPos onPos = p_41191_.getOnPos();
        Player player = p_41191_;
        Level level = p_41190_;
        for(int i=onPos.getX()-4;i<onPos.getX()+4;i++)
            for(int j=onPos.getZ()-4;j<onPos.getZ()+4;j++)
            {
                level.addParticle(ModParticles.HIDE_SMOKE_PARTICLES3.get(), 0.5d + i, onPos.getY() + 1.9d, 0.5d+j,
                        0d, 0d, 0d);
            }
        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60));




        return InteractionResultHolder.sidedSuccess(itemstack, p_41190_.isClientSide());



    }


    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        BlockPos positionClicked = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        Level level = pContext.getLevel();
        for(int i=positionClicked.getX()-4;i<positionClicked.getX()+4;i++)
        for(int j=positionClicked.getZ()-4;j<positionClicked.getZ()+4;j++)
        {
            level.addParticle(ModParticles.HIDE_SMOKE_PARTICLES3.get(), 0.5d + i, positionClicked.getY() + 1.9d, 0.5d+j,
                    0d, 0d, 0d);
        }

        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60));

        return super.useOn(pContext);
    }
}
