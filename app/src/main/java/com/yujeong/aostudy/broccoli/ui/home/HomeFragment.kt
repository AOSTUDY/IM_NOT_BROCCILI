package com.yujeong.aostudy.broccoli.ui.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment
import com.yujeong.aostudy.broccoli.util.PagerFragmentStateAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){

    private lateinit var mContext: Context

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mContext = requireContext()

        initPager()

        return binding.root
    }

    private fun initPager(){

        val pagerAdapter = PagerFragmentStateAdapter(requireActivity())
        pagerAdapter.addFragment(RecommendHomeFragment())
        pagerAdapter.addFragment(DomesticHomeFragment())
        pagerAdapter.addFragment(EnjoyHomeFragment())
        pagerAdapter.addFragment(TrafficHomeFragment())
        pagerAdapter.addFragment(ForeignHomeFragment())

        binding.vpHomeMain.adapter = pagerAdapter

        TabLayoutMediator(binding.tlHome, binding.vpHomeMain){ tab, position ->
            when(position){
                0 -> tab.text = "추천"
                1 -> tab.text = "국내숙소"
                2 -> tab.text = "즐길거리"
                3 -> tab.text = "교통/항공"
                4 -> tab.text = "해외여행"
            }
        }.attach()
    }

}