package datas.models

import android.content.Intent
import androidx.core.net.toUri

data class place(
    val id: Int,
    val name: String,
    val description: String,
    val latitude: Double,
    val longitude: Double,



)
fun place.toIntent(action:String): Intent
{
    return Intent(action).apply{
        data="geo:$latitude,$longitude".toUri()
    }
}