package com.yujeong.aostudy.broccoli.di

import com.yujeong.aostudy.broccoli.ui.home.data.LocalRecommendHomeDataSource
import com.yujeong.aostudy.broccoli.ui.home.data.LocalReviewDataSource
import com.yujeong.aostudy.broccoli.ui.home.data.RecommendHomeDataSource
import com.yujeong.aostudy.broccoli.ui.home.data.ReviewDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    single<RecommendHomeDataSource> { LocalRecommendHomeDataSource() }
    single<ReviewDataSource> { LocalReviewDataSource() }
}