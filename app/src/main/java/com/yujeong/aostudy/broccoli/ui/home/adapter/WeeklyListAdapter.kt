package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeWeeklyBinding
import com.yujeong.aostudy.broccoli.ui.home.model.WeeklyData

class WeeklyListAdapter : RecyclerView.Adapter<WeeklyListAdapter.WeekViewHolder>() {

    private var weeklyList = emptyList<WeeklyData>()

    class WeekViewHolder (
        private val binding : ItemHomeWeeklyBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(weeklyData: WeeklyData){
            binding.weekly = weeklyData
            binding.tvWeeklyRank.text = (adapterPosition + 1).toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekViewHolder {
        val binding = ItemHomeWeeklyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return WeekViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WeekViewHolder, position: Int) {
        holder.bind(weeklyList[position])
    }

    override fun getItemCount(): Int = weeklyList.size

    fun setWeekly(weeklyList : List<WeeklyData>){
        this.weeklyList = weeklyList
        notifyDataSetChanged()
    }
}