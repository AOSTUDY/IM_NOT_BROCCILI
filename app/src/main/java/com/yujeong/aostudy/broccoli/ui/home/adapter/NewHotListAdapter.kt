package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeNewhotBinding
import com.yujeong.aostudy.broccoli.ui.home.model.NewHotData

class NewHotListAdapter : RecyclerView.Adapter<NewHotListAdapter.NewHotViewHolder>() {

    private var newHotList = emptyList<NewHotData>()
    class NewHotViewHolder (
        private val binding : ItemHomeNewhotBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(newHotData: NewHotData){
            binding.newhot = newHotData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewHotViewHolder {
        val binding = ItemHomeNewhotBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NewHotViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewHotViewHolder, position: Int) {
        holder.bind(newHotList[position])
    }

    override fun getItemCount(): Int = newHotList.size

    fun setNewHot(newhotList : List<NewHotData>){
        this.newHotList = newhotList
        notifyDataSetChanged()
    }
}