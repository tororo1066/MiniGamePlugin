package minigameplugin.minigameplugin

import minigameplugin.minigameplugin.MiniGamePlugin.Companion.plugin
import minigameplugin.minigameplugin.MiniGamePlugin.Companion.prefix
import org.bukkit.entity.Player
import org.jetbrains.annotations.Nullable

object MiniGameUtil {

    fun Player.sendmsg(text : String){
        this.sendMessage(prefix + text)
    }

    fun Player.notHasPerm(permission : String): Boolean {
        return if (this.hasPermission(permission)){
            false
        }else{
            this.sendmsg("§4あなたは§e${permission}§4の権限がありません！")
            true
        }
    }

    fun getString(path : String): @Nullable String? {
        return plugin.config.getString(path)
    }
}