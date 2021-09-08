package com.yujeong.aostudy.broccoli.di

import com.yujeong.aostudy.broccoli.ui.home.RecommendHomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { RecommendHomeViewModel(get())}
}