package io.github.cirmahdev.init;

import io.github.cirmahdev.aomc.AdvancedOutputModMain;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, AdvancedOutputModMain.MODID);

    //*****************************//
    //            Blocks           //
    //*****************************//

    //Fractured Ore Block
    public static final RegistryObject<Block> FRACTURED_ORE = BLOCKS.register("fractured_ore", ()-> new Block(Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(3.0F, 3.0F)
            .sound(SoundType.METAL)
    ));



}
