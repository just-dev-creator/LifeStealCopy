package tech.justcoding.lifesteal.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

/**
 * This class prevents a player of joining with op rights to the server.
 * It aims to stop server admins of abusing their power.
 * But it has a pretty primitive solution of the problem:
 *  The admins can just give themselves op after they joined the server
 *  This behaviour should be blocked using the `ServerCommandEvent` class, but of course this implementation is far
 *  from being perfect.
 *  @see ServerCommandEvent
 */
class JoinListener : Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        if (event.player.isOp) {
            event.player.isOp = false;
        }
    }
}