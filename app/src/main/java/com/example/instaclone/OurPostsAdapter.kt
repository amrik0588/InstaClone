package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class OurPostsAdapter():RecyclerView.Adapter<OurPostsAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view= inflater.inflate(R.layout.our_posts_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    }

    override fun getItemCount(): Int =15
}