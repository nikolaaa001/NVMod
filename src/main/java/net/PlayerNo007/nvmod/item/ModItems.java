package net.PlayerNo007.nvmod.item;

import net.PlayerNo007.nvmod.NVMod;
import net.PlayerNo007.nvmod.food.ModFood;
import net.PlayerNo007.nvmod.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NVMod.MOD_ID);

    //dark stuff
    public static final RegistryObject<Item> DARK_ORB = ITEMS.register("dark_orb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.DARK_TAB)));

    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.DARK_TAB)));

    public static final RegistryObject<Item> DARK_NUGGET = ITEMS.register("dark_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.DARK_TAB)));

    public static final RegistryObject<Item> RAW_DARKNESS = ITEMS.register("raw_darkness",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.DARK_TAB)));

    public static final RegistryObject<Item> DEATH_STICK = ITEMS.register("death_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.DARK_TAB)));

    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword",
            () -> new DarkSword(ModTiers.DARK,1,0.004f,new Item.Properties().durability(250).tab(ModCreativeModeTabs.DARK_TAB)));




    //ligth stuff
    public static final RegistryObject<Item> LIGHT_ORB = ITEMS.register("light_orb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.LIGHT_TAB)));

    public static final RegistryObject<Item> LIGHT_INGOT = ITEMS.register("light_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.LIGHT_TAB)));


    public static final RegistryObject<Item> LIGHT_NUGGET = ITEMS.register("light_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.LIGHT_TAB)));

    public static final RegistryObject<Item> RAW_LIGHT = ITEMS.register("raw_light",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.LIGHT_TAB)));

    public static final RegistryObject<Item> LIGHT_STICK = ITEMS.register("light_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.LIGHT_TAB)));

    public static final RegistryObject<Item> LIGHT_SWORD = ITEMS.register("light_sword",
            () -> new LightSword(ModTiers.LIGHT,1,0.004f,new Item.Properties().durability(250).tab(ModCreativeModeTabs.LIGHT_TAB)));



    //public static final Item TRIDENT = registerItem("trident", new TridentItem((new Item.Properties()).durability(250).tab(CreativeModeTab.TAB_COMBAT)));
    //mod tiers did nothing, it is still 4, even tho I change it nothing happens
    //this should help

    //neutral stuff
    public static final RegistryObject<Item> SMOKE_BAG = ITEMS.register("smoke_bag",
            () -> new SmokeBag(new Item.Properties().tab(ModCreativeModeTabs.STUFF).stacksTo(8)));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.STUFF).food(ModFood.ORANGE)));

    public static final RegistryObject<Item> ORANGE_JUICE = ITEMS.register("orange_juice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.STUFF).food(ModFood.ORANGE_JUICE)));

    public static final RegistryObject<Item> RED_CARROT = ITEMS.register("red_carrot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.STUFF).food(ModFood.RED_CARROT)));

    public static final RegistryObject<Item> RED_CARROT_JUICE = ITEMS.register("red_carrot_juice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.STUFF).food(ModFood.RED_CARROT_JUICE)));

    //change attack damage and speed modifier
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new SwordItem(Tiers.IRON,1,1.5f,new Item.Properties().tab(ModCreativeModeTabs.STUFF)));

    public static final RegistryObject<Item> VIKING_AXE = ITEMS.register("viking_axe",
            () -> new VikingAxe(Tiers.IRON,13,-3.5f,new Item.Properties().tab(ModCreativeModeTabs.STUFF)));

    public static final RegistryObject<Item> BULBASAUR = ITEMS.register("bulbasaur",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.STUFF)));

    public static final RegistryObject<Item> LONG_DIAMOND_SWORD = ITEMS.register("long_diamond_sword",
            () -> new SwordItem(Tiers.DIAMOND,18,-3.8F,new Item.Properties().tab(ModCreativeModeTabs.STUFF)));

    public static final RegistryObject<Item> HUNTING_KNIFE = ITEMS.register("hunting_knife",
            () -> new SwordItem(Tiers.IRON,4,1.5f,new Item.Properties().tab(ModCreativeModeTabs.STUFF)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
