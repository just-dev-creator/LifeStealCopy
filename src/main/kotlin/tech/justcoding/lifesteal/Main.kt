package tech.justcoding.lifesteal

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin
import tech.justcoding.lifesteal.listeners.DeathListener
import tech.justcoding.lifesteal.listeners.GamemodeListener
import tech.justcoding.lifesteal.listeners.JoinListener
import tech.justcoding.lifesteal.listeners.ServerCommandEvent

class Main : JavaPlugin() {
    override fun onLoad() {

    }
    override fun onEnable() {
        sendBanner();
        registerListeners()
        registerCommands()
    }

    private fun sendBanner() {
        Bukkit.getLogger().info(getPrefix() + "Dies ist eine freie Implementation des LifeSteal-SMPs auf Basis " +
                "minimaler Spigot-API. Dieses Plugin ist unter der \"Apache 2.0\"-Lizenz lizensiert. " +
                "Änderungen und Benutzungen, die nicht mit dieser Lizenz einhergehen, sind strafrechtlich " +
                "relevant. ")
        Bukkit.getLogger().info(getPrefix() + "Dieses Plugin wurde von justCoding und anderen Personen auf " +
                "GitHub erstellt. Weitere Informationen unter https://github.com/just-dev-creator/LifeStealCopy")
    }

    private fun registerListeners() {
        val pluginManager: PluginManager = Bukkit.getPluginManager()
        pluginManager.registerEvents(DeathListener(), this);
//        To remove all protection against admin abuse, remove the following lines of code.
        pluginManager.registerEvents(GamemodeListener(), this);
        pluginManager.registerEvents(JoinListener(), this);
        pluginManager.registerEvents(ServerCommandEvent(), this);
//        End of protection
    }
    private fun registerCommands() {

    }

    companion object {
        fun getPrefix(): String {
            return ChatColor.DARK_GRAY.toString() + "┃ " + ChatColor.BLUE + "Event" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY
        }
        fun getPrefix(customPrefix: String): String? {
            return ChatColor.DARK_GRAY.toString() + "┃ " + ChatColor.BLUE + customPrefix + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY
        }

        fun getErrorPrefix(): String {
            return ChatColor.DARK_GRAY.toString() + "┃ " + ChatColor.DARK_RED + "ERROR" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY
        }

        fun getNoPermission(): String? {
            return getErrorPrefix() + "Du hast nicht die benötigten Berechtigungen für den Befehl. "
        }

        fun getNoPlayer(): String? {
            return getErrorPrefix() + "Du musst ein Spieler sein, um diese Aktion auszuführen. "
        }

        var hasProjectStarted: Boolean = false;
    }
}