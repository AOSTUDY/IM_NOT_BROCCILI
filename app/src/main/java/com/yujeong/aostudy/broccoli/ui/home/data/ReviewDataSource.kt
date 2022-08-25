package com.yujeong.aostudy.broccoli.ui.home.data

import com.yujeong.aostudy.broccoli.ui.home.model.LocationModel
import com.yujeong.aostudy.broccoli.ui.home.model.ReviewModel

interface ReviewDataSource {
    fun getReviewData() : List<ReviewModel>

    fun getLocaitonData() : List<LocationModel>
}