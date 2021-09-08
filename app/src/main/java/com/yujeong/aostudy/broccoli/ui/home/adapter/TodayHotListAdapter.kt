package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeTodayhotBinding
import com.yujeong.aostudy.broccoli.ui.home.model.TodayHotData

class TodayHotListAdapter : RecyclerView.Adapter<TodayHotListAdapter.TodayHotViewHolder>() {

    private var todayHotList = emptyList<TodayHotData>()
    class TodayHotViewHolder(
        private val binding : ItemHomeTodayhotBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(todayHotData: TodayHotData){
            binding.today = todayHotData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayHotViewHolder {
        val binding = ItemHomeTodayhotBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TodayHotViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayHotViewHolder, position: Int) {
        holder.bind(todayHotList[position])
    }

    override fun getItemCount(): Int = todayHotList.size

    fun setTodayHot(todayHotList : List<TodayHotData>){
        this.todayHotList = todayHotList
        notifyDataSetChanged()
    }
}