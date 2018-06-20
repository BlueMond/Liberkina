package me.bluemond.liberkina;

import me.bluemond.liberkina.Listeners.PlayerListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Liberkina extends JavaPlugin {

    PluginManager pluginManager;
    Listener playerListener;


    @Override
    public void onEnable(){
        pluginManager = getServer().getPluginManager();
        playerListener = new PlayerListener();

        pluginManager.registerEvents(playerListener, this);
    }

    @Override
    public void onDisable(){

    }
}
