package com.example.navigationuidemo.notification

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationuidemo.R

class NotificationAdapter(
    private val context: Context,
    private val list: List<String>,
) : RecyclerView.Adapter<NotificationAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adapter_notification, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvUserName.setText(list.get(position))
    }

    override fun getItemCount() = list.size

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvUserName = itemView.findViewById(R.id.tvUserName) as TextView
    }

}