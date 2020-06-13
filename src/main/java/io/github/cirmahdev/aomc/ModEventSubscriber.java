package io.github.cirmahdev.aomc;

import io.github.cirmahdev.init.ModBlocks;
import io.github.cirmahdev.init.ModItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = AdvancedOutputModMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {


    private static final Logger LOGGER = LogManager.getLogger();


//    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
//        return setup(entry, new ResourceLocation(AdvancedOutputModMain.MODID, name));
//
//    }
//
//    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
//        entry.setRegistryName(registryName);
//        return entry;
//    }
}
