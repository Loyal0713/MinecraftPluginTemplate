package com.loyal0713.myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();   // copies config.yml from jar if absent in data folder
        getLogger().info(getName() + " v" + getDescription().getVersion() + " enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info(getName() + " disabled.");
    }
}
