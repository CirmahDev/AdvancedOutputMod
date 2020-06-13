package io.github.cirmahdev.init;

import io.github.cirmahdev.aomc.AdvancedOutputModMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;

    // Sets creative tab for mod
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(AdvancedOutputModMain.MODID, () -> new ItemStack(ModItems.CHECKER.get()));

    public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier){
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon(){
        return iconSupplier.get();
    }

}
