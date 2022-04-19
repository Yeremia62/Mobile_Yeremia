package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AnimalAdapter (val listbird: ArrayList<bird>): RecyclerView.Adapter<AnimalAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_animal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listbird.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listbird[position]
        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = animal.name
        holder.tvDetail.text = animal.detail
    }

}
