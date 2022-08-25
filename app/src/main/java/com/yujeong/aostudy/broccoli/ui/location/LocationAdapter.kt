package com.yujeong.aostudy.broccoli.ui.location

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeAdBinding
import com.yujeong.aostudy.broccoli.databinding.ItemRealtimeReviewBinding
import com.yujeong.aostudy.broccoli.databinding.ItemSearchBinding
import com.yujeong.aostudy.broccoli.ui.home.model.AdData
import com.yujeong.aostudy.broccoli.ui.home.model.LocationModel
import com.yujeong.aostudy.broccoli.ui.home.model.ReviewModel

class LocationAdapter : RecyclerView.Adapter<LocationAdapter.LocaitonViewHolder>() {

    private var locationList = emptyList<LocationModel>()

    class LocaitonViewHolder(
        private val binding: ItemSearchBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(adData: LocationModel) {
            binding.recommendInfo = adData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocaitonViewHolder {
        val binding = ItemSearchBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return LocaitonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocaitonViewHolder, position: Int) {
        holder.bind(locationList[position])
    }

    override fun getItemCount(): Int = locationList.size

    fun setLocationList(adList: List<LocationModel>) {
        this.locationList = adList
        notifyDataSetChanged()
    }

}