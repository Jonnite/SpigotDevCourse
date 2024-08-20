package me.jonnite.wardensmp;

import me.jonnite.wardensmp.listener.MilkCowListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class WardenSMP extends JavaPlugin {

    private static WardenSMP instance;
    @Override
    public void onEnable() {
        instance = this;

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new MilkCowListener(), this);

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static WardenSMP getInstance() {
        return instance;
    }

}
