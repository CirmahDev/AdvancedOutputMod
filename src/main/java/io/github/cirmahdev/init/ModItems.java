package io.github.cirmahdev.init;

import io.github.cirmahdev.aomc.AdvancedOutputModMain;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AdvancedOutputModMain.MODID);

    //*****************************//
    //             Items           //
    //*****************************//

    public static final RegistryObject<Item> CHECKER = ITEMS.register("checker",()-> new Item(new Item.Properties().group(ModItemGroup.MOD_ITEM_GROUP)));


    //*****************************//
    //        Block Items          //
    //*****************************//


    public static final RegistryObject<Item> FRACTURED_ORE_ITEM = ITEMS.register("fractured_ore", ()-> new BlockItemCon(ModBlocks.FRACTURED_ORE.get()));

}
