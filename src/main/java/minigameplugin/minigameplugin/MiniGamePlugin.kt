package minigameplugin.minigameplugin

import minigameplugin.minigameplugin.games.HuraHuraMeiro
import org.bukkit.plugin.java.JavaPlugin
import java.util.*
import kotlin.collections.HashMap

class MiniGamePlugin : JavaPlugin() {

    override fun onEnable() {
        plugin = this
        getCommand("minigame")?.setExecutor(MiniGameUserCommands)
        getCommand("minigameop")?.setExecutor(MiniGameOpCommands)



    }

    override fun onDisable() {

    }

    companion object{
        const val prefix = "§f[§e§lMini§a§lGame§d§lPlugin§f]§r"
        val userDataList = HashMap<UUID,MiniGameUserData>()
        lateinit var plugin : MiniGamePlugin
    }


}