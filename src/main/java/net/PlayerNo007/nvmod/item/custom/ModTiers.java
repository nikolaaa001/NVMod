package net.PlayerNo007.nvmod.item.custom;

import net.PlayerNo007.nvmod.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier LIGHT = new ForgeTier(1,1500,0.004f,20f,0,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.LIGHT_INGOT.get()));

    public static final ForgeTier DARK = new ForgeTier(1,1500,0.004f,20f,0,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.DARK_INGOT.get()));
}
