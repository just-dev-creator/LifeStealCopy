package tech.justcoding.lifesteal.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerCommandEvent

/**
 * This class prevents the console of oping a player, giving a player items or changing the gamemode of a player.
 * It aims to stop server admins of abusing their power.
 * This implementation is far from being perfect as it's easy to circumvent this protection
 * @see JoinListener
 */
class ServerCommandEvent : Listener {
    @EventHandler
    fun onCommand(event: ServerCommandEvent) {
        if (event.command.contains("op")) {
            event.command = "op";
        } else if (event.command.contains("give")) {
            event.command = "give";
        } else if (event.command.contains("gamemode")) {
            event.command = "gamemode"
        }
    }
}