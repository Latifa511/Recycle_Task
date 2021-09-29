package com.example.recycletask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class myAdapter(private val context: Context, private val messages:ArrayList<String>):
    RecyclerView.Adapter<myAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: myAdapter.ItemViewHolder, position: Int) {
        val names = messages[position]

        holder.itemView.apply {
            text1.text = names
        }
    }

    override fun getItemCount(): Int = messages.size
}

