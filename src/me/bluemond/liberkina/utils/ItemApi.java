package me.bluemond.liberkina.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemApi {
    //create and recognize created items


    public ItemStack createItemFrom(Material type, String name, int amount){
        ItemStack item = new ItemStack(type, amount);
        ItemMeta im = item.getItemMeta();

        im.setLocalizedName(name + ".liberkina");
        im.setDisplayName(name);

        return item;
    }

    public ItemStack createItemFrom(Material type, String name){
        return createItemFrom(type, name, 1);
    }


    public boolean isA(ItemStack item, String itemName){
        String localName = item.getItemMeta().getLocalizedName();

        if(localName.endsWith(".liberkina")){
            if(localName.startsWith(itemName)){
                return true;
            }
        }

        return false;
    }
}
