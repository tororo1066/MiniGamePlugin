package minigameplugin.minigameplugin

import minigameplugin.minigameplugin.MiniGamePlugin.Companion.userDataList
import minigameplugin.minigameplugin.games.HuraHuraMeiro
import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*
import kotlin.collections.ArrayList


abstract class MiniGameData(private val id : Int, private val GameName : String, private val min : Int, private val max : Int) : Thread() {

    val userData = userDataList
    open var isRunning = false

    open fun startGame(players: MutableList<UUID>): Boolean {
        for (p in players){
            val player = Bukkit.getPlayer(p) ?: continue
            userData[p] = MiniGameUserData(player.name,id)
        }
        if (userData.size < min){
            Bukkit.broadcast(Component.text("参加する人が足りませんでした"))
            return false
        }
        if (userData.size > max){
            Bukkit.broadcast(Component.text("参加する人が多すぎました"))
            return false
        }

        isRunning = true
        return true
    }

    open fun endGame(){

    }



    open fun getid() : Int{
        return id
    }

    open fun getGameName() : String{
        return GameName
    }





}
