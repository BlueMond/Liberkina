package me.bluemond.liberkina.Listeners;

import me.bluemond.liberkina.Runes.Rune;
import me.bluemond.liberkina.Runes.RuneRegistry;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;


public class PlayerListener implements Listener {

    ArrayList<Rune> runes;

    public PlayerListener(){
        runes = RuneRegistry.getRegistry();
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        ArrayList<Rune> eRunes = new ArrayList<Rune>();

        for(Rune rune : runes){
            if(rune.getCore().equals(block.getType())){

                eRunes.add(rune);

            }
        }


    }
}
