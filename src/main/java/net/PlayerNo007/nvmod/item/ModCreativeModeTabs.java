package net.PlayerNo007.nvmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab DARK_TAB = new CreativeModeTab("dark_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARK_ORB.get());
        }
    };

    public static final CreativeModeTab LIGHT_TAB = new CreativeModeTab("light_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LIGHT_ORB.get());
        }
    };

    public static final CreativeModeTab STUFF = new CreativeModeTab("stuff") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SMOKE_BAG.get());
        }
    };
}
