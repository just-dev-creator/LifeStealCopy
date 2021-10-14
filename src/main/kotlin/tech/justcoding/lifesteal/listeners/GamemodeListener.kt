package tech.justcoding.lifesteal.listeners

import org.bukkit.GameMode
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerGameModeChangeEvent

class GamemodeListener : Listener {
    @EventHandler
    fun onChange(event: PlayerGameModeChangeEvent) {
        if (event.newGameMode === GameMode.SPECTATOR || event.newGameMode === GameMode.CREATIVE) {
            event.isCancelled = true;
        }
    }
}