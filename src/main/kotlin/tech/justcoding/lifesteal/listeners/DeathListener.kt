package tech.justcoding.lifesteal.listeners

import org.bukkit.BanList
import org.bukkit.Bukkit
import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.entity.PlayerDeathEvent
import tech.justcoding.lifesteal.Main

class DeathListener: Listener {
    @EventHandler
    fun onDeath(event: PlayerDeathEvent) {
        if (event.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue?.equals(2.0) == true) {
            val name: String = event.entity.name;
            event.entity.kickPlayer(Main.getPrefix() + "Du hast verloren.");
            Bukkit.getBanList(BanList.Type.NAME).addBan(name, Main.getPrefix() + "Du hast verloren.", null, null);
        } else {
            event.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue =
                event.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue?.minus(2)!!;
            event.entity.sendMessage(Main.getPrefix() + "Du bist gestorben und hast daher ein Herz verloren. ")
        }

        if (event.entity.lastDamageCause!!.cause === EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
            if (event.entity.lastDamageCause!!.entity is Player) {
                event.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue =
                    event.entity.getAttribute(Attribute.GENERIC_MAX_HEALTH)?.baseValue?.plus(2)!!;
                event.entity.sendMessage(Main.getPrefix() + "Du hast eine Person umgebracht und daher ein Herz " +
                        "dazugewonnen. ")
            }
        }
    }
}