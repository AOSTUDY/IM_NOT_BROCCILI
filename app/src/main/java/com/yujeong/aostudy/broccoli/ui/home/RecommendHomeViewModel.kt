package com.yujeong.aostudy.broccoli.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.ui.home.data.RecommendHomeDataSource
import com.yujeong.aostudy.broccoli.ui.home.model.*

class RecommendHomeViewModel(private val recommendHomeDataSource: RecommendHomeDataSource) : ViewModel() {

    private val _newHotList = MutableLiveData<List<NewHotData>>()
    val newHotList : LiveData<List<NewHotData>>
        get() = _newHotList

    private val _eventList = MutableLiveData<List<EventData>>()
    val eventList : LiveData<List<EventData>>
        get() = _eventList

    private val _adList = MutableLiveData<List<AdData>>()
    val adList : LiveData<List<AdData>>
        get() = _adList

    private val _todayHotList = MutableLiveData<List<TodayHotData>>()
    val todayHotList : LiveData<List<TodayHotData>>
        get() = _todayHotList

    private val _domesticList = MutableLiveData<List<DomesticData>>()
    val domesticList : LiveData<List<DomesticData>>
        get() = _domesticList

    private val _weeklyList = MutableLiveData<List<WeeklyData>>()
    val weeklyList : LiveData<List<WeeklyData>>
        get() = _weeklyList

    private val _magazineList = MutableLiveData<List<MagazineData>>()
    val magazineList : LiveData<List<MagazineData>>
        get() = _magazineList

     fun setEventList() {
         _eventList.postValue( recommendHomeDataSource.getEventData())
     }

    fun setNewHotList(){
       _newHotList.postValue(recommendHomeDataSource.getNewHotData())
    }

    fun setAdList(){
        _adList.postValue(recommendHomeDataSource.getAdData())
    }

    fun setTodayHotList(){
        _todayHotList.postValue( recommendHomeDataSource.getTodayData())
    }

    fun setDomesticList(){
        _domesticList.postValue(recommendHomeDataSource.getDomesticData())
    }

    fun setWeeklyList(){
        _weeklyList.postValue(recommendHomeDataSource.getWeeklyData())
    }

    fun setMagazineList(){
        _magazineList.postValue(recommendHomeDataSource.getMagazineData())
    }
}