package me.bluemond.liberkina.utils;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.HashMap;

public class CrystalCatalog {
    HashMap<Material, String> ores;

    public CrystalCatalog(){
        ores = new HashMap<Material, String>();
        ores.put(Material.DIAMOND_ORE, "Visuddha");
        ores.put(Material.EMERALD_ORE, "");
    }
}
