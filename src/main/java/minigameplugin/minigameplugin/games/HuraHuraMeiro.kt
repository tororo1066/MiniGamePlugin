package minigameplugin.minigameplugin.games

import minigameplugin.minigameplugin.MiniGameData
import minigameplugin.minigameplugin.MiniGamePlugin.Companion.plugin
import minigameplugin.minigameplugin.MiniGameUtil.getString
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.boss.BarColor
import org.bukkit.boss.BarStyle
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import sun.jvm.hotspot.HelloWorld.e
import java.util.*


class HuraHuraMeiro(private val players: MutableList<UUID>, private val time : Int) : MiniGameData(1, "ふらふら迷路", 2, 10),Listener {






    override fun run() {
        if (!startGame(players))return

        plugin.server.pluginManager.registerEvents(this,plugin)

        val goalblock = Material.valueOf(getString("goalblock")?:return)
        val randomblock = Material.valueOf(getString("randomblock")?:return)

        val bossbar = Bukkit.createBossBar("§d${getGameName()}§r：§6残り時間",BarColor.GREEN,BarStyle.SOLID)
        bossbar.progress = time.toDouble()
        Bukkit.getScheduler().runTaskTimer(plugin, Runnable {
            if (bossbar.progress <= 0.0)
            bossbar.progress -= 1.0
        },0,20)





    }
}