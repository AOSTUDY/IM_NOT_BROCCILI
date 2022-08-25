package com.yujeong.aostudy.broccoli.ui.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yujeong.aostudy.broccoli.ui.home.data.ReviewDataSource
import com.yujeong.aostudy.broccoli.ui.home.model.LocationModel



class LocationViewModel (private val reviewDataSource: ReviewDataSource) : ViewModel() {

    private val _locationList = MutableLiveData<List<LocationModel>>()
    val locaitonList: LiveData<List<LocationModel>>
        get() = _locationList

    fun setLocationList() {
        _locationList.postValue(reviewDataSource.getLocaitonData())
    }
}