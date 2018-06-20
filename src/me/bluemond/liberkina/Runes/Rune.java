package me.bluemond.liberkina.Runes;

import org.bukkit.Location;
import org.bukkit.Material;


public class Rune {
    Material[][] grid;
    Material core;

    public Rune(Material[][] grid){
        this.grid = grid;
        findCore();
    }

    public void activate(Location loc){

    }

    private void findCore(){
        int mid = grid.length/2 - 1;
        core = grid[mid][mid];
    }

    public Material getCore(){
        return core;
    }
}
