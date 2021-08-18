package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeDomesticBinding
import com.yujeong.aostudy.broccoli.ui.home.model.DomesticData

class DomesticListAdapter : RecyclerView.Adapter<DomesticListAdapter.DomesticViewHolder>(){

    private var domesticList = emptyList<DomesticData>()

    class DomesticViewHolder(
        private val binding : ItemHomeDomesticBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(domesticData: DomesticData){
            binding.local = domesticData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DomesticViewHolder {
        val binding = ItemHomeDomesticBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DomesticViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DomesticViewHolder, position: Int) {
        holder.bind(domesticList[position])
    }

    override fun getItemCount(): Int = domesticList.size

    fun setDomestic(domesticList : List<DomesticData>){
        this.domesticList = domesticList
        notifyDataSetChanged()
    }
}