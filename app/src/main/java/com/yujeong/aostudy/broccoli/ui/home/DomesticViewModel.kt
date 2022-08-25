package com.yujeong.aostudy.broccoli.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yujeong.aostudy.broccoli.ui.home.data.ReviewDataSource
import com.yujeong.aostudy.broccoli.ui.home.model.*


class DomesticViewModel (private val reviewDataSource: ReviewDataSource) : ViewModel() {

    private val _reviewList = MutableLiveData<List<ReviewModel>>()
    val reviewList : LiveData<List<ReviewModel>>
        get() = _reviewList

    fun setReviewList() {
        _reviewList.postValue( reviewDataSource.getReviewData())
    }
}