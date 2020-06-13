package io.github.cirmahdev.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemCon extends BlockItem {
    public BlockItemCon(Block block){
        super(block, new Item.Properties().group(ModItemGroup.MOD_ITEM_GROUP));
    }
}
