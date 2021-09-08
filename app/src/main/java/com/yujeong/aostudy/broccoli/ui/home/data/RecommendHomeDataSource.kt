package com.yujeong.aostudy.broccoli.ui.home.data

import com.yujeong.aostudy.broccoli.ui.home.model.*

interface RecommendHomeDataSource {
    fun getAdData() : List<AdData>
    fun getDomesticData() : List<DomesticData>
    fun getEventData() : List<EventData>
    fun getMagazineData() : List<MagazineData>
    fun getNewHotData() : List<NewHotData>
    fun getTodayData() : List<TodayHotData>
    fun getWeeklyData() : List<WeeklyData>
}