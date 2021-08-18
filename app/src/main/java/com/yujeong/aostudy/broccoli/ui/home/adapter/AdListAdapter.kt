package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeAdBinding
import com.yujeong.aostudy.broccoli.ui.home.model.AdData
import com.yujeong.aostudy.broccoli.ui.home.model.EventData

class AdListAdapter : RecyclerView.Adapter<AdListAdapter.AdViewHolder>() {

    private var adList = emptyList<AdData>()
    class AdViewHolder( private val binding : ItemHomeAdBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(adData : AdData){
            binding.ad = adData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdViewHolder {
        val binding = ItemHomeAdBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AdViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdViewHolder, position: Int) {
        holder.bind(adList[position])
    }

    override fun getItemCount(): Int = adList.size

    fun setAd(adList : List<AdData>){
        this.adList = adList
        notifyDataSetChanged()
    }
}