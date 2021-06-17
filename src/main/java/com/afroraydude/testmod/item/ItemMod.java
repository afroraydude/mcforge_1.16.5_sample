package com.afroraydude.testmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemMod {



    public static Item generateBasicItem(ItemGroup group) {
        return new Item(new Item.Properties().tab(group));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

    }
}
