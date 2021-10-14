package tech.justcoding.lifesteal

import org.bukkit.Bukkit
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin

public class Main : JavaPlugin() {
    override fun onLoad() {

    }
    override fun onEnable() {
        registerListeners();
        registerCommands();
    }

    override fun onDisable() {
        super.onDisable()
    }

    private fun registerListeners() {
        val pluginManager: PluginManager = Bukkit.getPluginManager();
    }
    private fun registerCommands() {

    }
}