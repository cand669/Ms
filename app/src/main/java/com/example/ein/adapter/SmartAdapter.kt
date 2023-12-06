package com.example.ein.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ein.adapter.holder.SmartHolder
import com.example.ein.databinding.ItemPageBinding


class SmartAdapter<T> : RecyclerView.Adapter<SmartHolder>() {
    var mList = mutableListOf<T>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartHolder {
        val binding = ItemPageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return SmartHolder(binding)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: SmartHolder, position: Int) {
        val item = mList[position]
        holder.binding.lld.text = item.toString()
    }
    fun loadMore(collection: ArrayList<T>) {
        mList.addAll(collection)
        notifyDataSetChanged()
    }

    fun refresh(collection: Collection<T>) {
        mList.clear()
        mList.addAll(collection)
        notifyDataSetChanged()
    }

}