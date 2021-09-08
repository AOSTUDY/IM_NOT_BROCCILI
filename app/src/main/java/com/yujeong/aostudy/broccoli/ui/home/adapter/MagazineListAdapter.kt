package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeEventBinding
import com.yujeong.aostudy.broccoli.databinding.ItemHomeMagazineBinding
import com.yujeong.aostudy.broccoli.ui.home.model.EventData
import com.yujeong.aostudy.broccoli.ui.home.model.MagazineData

class MagazineListAdapter: RecyclerView.Adapter<MagazineListAdapter.MagazineViewHolder>(){

    private var magazineList = emptyList<MagazineData>()

    class MagazineViewHolder(
        private  var binding : ItemHomeMagazineBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(magazineData: MagazineData){
            binding.magazine = magazineData
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagazineViewHolder {
        val binding = ItemHomeMagazineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MagazineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MagazineViewHolder, position: Int) {
        holder.bind(magazineList[position])
    }

    override fun getItemCount(): Int = magazineList.size

    fun setMagazine(magazineList : List<MagazineData>){
        this.magazineList = magazineList
        notifyDataSetChanged()
    }

}