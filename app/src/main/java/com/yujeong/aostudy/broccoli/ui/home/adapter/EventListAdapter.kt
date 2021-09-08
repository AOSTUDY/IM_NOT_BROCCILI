package com.yujeong.aostudy.broccoli.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yujeong.aostudy.broccoli.databinding.ItemHomeEventBinding
import com.yujeong.aostudy.broccoli.ui.home.model.EventData

class EventListAdapter : RecyclerView.Adapter<EventListAdapter.EventViewHolder>() {

    private var eventList = emptyList<EventData>()
    class EventViewHolder (
        private val binding : ItemHomeEventBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(eventData : EventData){
            binding.event = eventData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val binding = ItemHomeEventBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return EventViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventList[position])
    }

    override fun getItemCount(): Int = eventList.size

    fun setEvent(eventList : List<EventData>){
        this.eventList = eventList
        notifyDataSetChanged()
    }
}