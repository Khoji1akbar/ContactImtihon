package uz.ghost.contact.db

import uz.ghost.contact.models.MyContact

interface MyInterface {
    fun addContact(myContact: MyContact)
    fun getAllContact():ArrayList<MyContact>
    fun deleteContact(myContact: MyContact)
    fun editContact(myContact: MyContact)

}