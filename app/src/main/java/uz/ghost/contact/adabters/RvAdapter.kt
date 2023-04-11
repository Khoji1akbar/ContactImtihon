package uz.ghost.contact.adabters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.ghost.contact.MainActivity
import uz.ghost.contact.databinding.RvItemBinding
import uz.ghost.contact.models.MyContact

class RvAdapter(var list:List<MyContact>, val rvEvent: MainActivity): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val rvItem: RvItemBinding): RecyclerView.ViewHolder(rvItem.root){
        fun onBind(myContact: MyContact){
            rvItem.name.text=myContact.name
            rvItem.number.text=myContact.number
            rvItem.menuImg.setOnClickListener {
                rvEvent.menuClick(myContact, rvItem.menuImg)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}