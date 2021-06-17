package com.afroraydude.testmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockMod {

    static Block SIMPLE_ORE = BlockMod.generateBasicBlock(Material.STONE, "simpleore");
    static Item SIMPLE_ORE_ITEM = BlockMod.generateBlockItem(SIMPLE_ORE, ItemGroup.TAB_BUILDING_BLOCKS);

    public static Block generateBasicBlock(Material material, String name) {
        return new Block(AbstractBlock.Properties.of(material)).setRegistryName(name);
    }

    public static Item generateBlockItem(Block block, ItemGroup group) {
        return new BlockItem(block, new Item.Properties().tab(group)).setRegistryName(block.getRegistryName());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(SIMPLE_ORE);
    }
    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(SIMPLE_ORE_ITEM);
    }
}
