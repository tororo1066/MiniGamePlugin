package minigameplugin.minigameplugin

import java.util.*
import kotlin.collections.HashMap

class MiniGameUserData() {

    private var mcid : String? = null
    private var joingame : Int? = 0

    constructor(mcid: String,joingame: Int) : this(){
        this.mcid = mcid
        this.joingame = joingame
    }



}