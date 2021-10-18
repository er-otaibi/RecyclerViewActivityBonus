package com.example.recyclerviewactivitybonus

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class UsersAdapter ( private val myUsers: List<Users>):  RecyclerView.Adapter<UsersAdapter.ItemViewHolder>(){
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val list1 =myUsers[position]

        holder.itemView.apply {
            textView.text = list1.firstName
            textView2.text = list1.lastName
            textView3.text= list1.location
            textView4.text = list1.age


        }
    }

    override fun getItemCount() = myUsers.size
}