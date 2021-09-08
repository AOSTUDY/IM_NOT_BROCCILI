package com.yujeong.aostudy.broccoli

import android.app.Application
import com.yujeong.aostudy.broccoli.di.dataSourceModule
import com.yujeong.aostudy.broccoli.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BroccoliApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@BroccoliApplication)
            modules(dataSourceModule, viewModelModule)
        }
    }
}