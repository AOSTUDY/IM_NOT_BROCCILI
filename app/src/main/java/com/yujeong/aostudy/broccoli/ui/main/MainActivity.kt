package com.yujeong.aostudy.broccoli.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.ui.base.BaseActivity
import com.yujeong.aostudy.broccoli.databinding.ActivityMainBinding
import com.yujeong.aostudy.broccoli.ui.heart.HeartFragment
import com.yujeong.aostudy.broccoli.ui.home.HomeFragment
import com.yujeong.aostudy.broccoli.ui.location.LocationFragment
import com.yujeong.aostudy.broccoli.ui.mypage.MypageFragment
import com.yujeong.aostudy.broccoli.ui.near.NearFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val fragmentHome by lazy { HomeFragment() }
    private val fragmentLocation by lazy { LocationFragment() }
    private val fragmentNear by lazy { NearFragment() }
    private val fragmentHeart by lazy { HeartFragment() }
    private val fragmentMypage by lazy { MypageFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        changeFragment(fragmentHome)
        initBottomNavigation()
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_Main, fragment)
            .commit()
    }

    private fun initBottomNavigation(){
        binding.bottomNaviMain.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    changeFragment(fragmentHome)
                    true
                }
                R.id.nav_location -> {
                    changeFragment(fragmentLocation)
                    true
                }
                R.id.nav_near -> {
                    changeFragment(fragmentNear)
                    true
                }
                R.id.nav_heart -> {
                    changeFragment(fragmentHeart)
                    true
                }
                R.id.nav_mypage -> {
                    changeFragment(fragmentMypage)
                    true
                }
                else -> {
                    changeFragment(fragmentHome)
                    true
                }

            }
        }

    }



}
