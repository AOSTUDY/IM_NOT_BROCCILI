package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeAdBinding
import com.yujeong.aostudy.broccoli.databinding.ItemRealtimeReviewBinding
import com.yujeong.aostudy.broccoli.ui.home.model.AdData
import com.yujeong.aostudy.broccoli.ui.home.model.ReviewModel

class ReviewAdapter : RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    private var adList = emptyList<ReviewModel>()

    class ReviewViewHolder(
        private val binding: ItemRealtimeReviewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(adData: ReviewModel) {
            binding.recommendInfo = adData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val binding = ItemRealtimeReviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ReviewViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.bind(adList[position])
    }

    override fun getItemCount(): Int = adList.size

    fun setReviewList(adList: List<ReviewModel>) {
        this.adList = adList
        notifyDataSetChanged()
    }

}