package io.github.cirmahdev.aomc;


import io.github.cirmahdev.init.ModBlocks;
import io.github.cirmahdev.init.ModItems;
import io.github.cirmahdev.world.gen.OreGen;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AdvancedOutputModMain.MODID)
@Mod.EventBusSubscriber(modid = AdvancedOutputModMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdvancedOutputModMain {
    public static final String MODID = "aomc";

    private static final Logger LOGGER = LogManager.getLogger();

    public AdvancedOutputModMain(){
        LOGGER.debug("Hello From AOM");

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event){
        OreGen.generateOre();
    }

}
