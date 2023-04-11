package uz.ghost.contact.adabters

import android.widget.ImageView
import uz.ghost.contact.models.MyContact

interface RvEvent {
    fun menuClick(myContact: MyContact, view:ImageView)
    fun callNow(myContact: MyContact)
}