package com.yujeong.aostudy.broccoli.di

import com.yujeong.aostudy.broccoli.ui.home.DomesticViewModel
import com.yujeong.aostudy.broccoli.ui.home.RecommendHomeViewModel
import com.yujeong.aostudy.broccoli.ui.home.model.LocationModel
import com.yujeong.aostudy.broccoli.ui.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { RecommendHomeViewModel(get())}
    viewModel { DomesticViewModel(get()) }
    viewModel { LocationViewModel(get()) }

}