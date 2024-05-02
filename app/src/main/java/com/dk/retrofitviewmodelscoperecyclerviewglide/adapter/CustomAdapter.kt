package com.dk.retrofitviewmodelscoperecyclerviewglide.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dk.retrofitviewmodelscoperecyclerviewglide.R
import com.dk.retrofitviewmodelscoperecyclerviewglide.model.Plant

class CustomAdapter(val context: Context, val dataSet: List<Plant>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.txtArea)
        val imgView : ImageView = view.findViewById(R.id.imgArea)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {

        holder.textView.text = dataSet[position].name
        Glide.with(context)
            .load(dataSet[position].imageUrl)
            .into(holder.imgView)
        }

    override fun getItemCount(): Int {
        return dataSet.size

    }


}