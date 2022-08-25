package com.yujeong.aostudy.broccoli.ui.location

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentLocationBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment
import com.yujeong.aostudy.broccoli.ui.home.DomesticHomeFragment
import com.yujeong.aostudy.broccoli.ui.home.DomesticViewModel
import com.yujeong.aostudy.broccoli.ui.home.EnjoyHomeFragment
import com.yujeong.aostudy.broccoli.ui.home.RecommendHomeFragment
import com.yujeong.aostudy.broccoli.ui.home.adapter.ReviewAdapter
import com.yujeong.aostudy.broccoli.util.PagerFragmentStateAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocationFragment : BaseFragment<FragmentLocationBinding>(R.layout.fragment_location){

    private lateinit var mContext: Context
    private val locationViewModel : LocationViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mContext = requireContext()

        locationViewModel.setLocationList()
        setLocationAdapter()
        setLocationListObserve()

        return binding.root
    }


    private fun setLocationAdapter(){
        binding.rvSearch.adapter = LocationAdapter()
    }

    private fun setLocationListObserve() {
        locationViewModel.locaitonList.observe(viewLifecycleOwner){
                locationList -> with(binding.rvSearch.adapter as LocationAdapter){
                    Log.d("**********location", locationList[0].name);
                    setLocationList(locationList)
                }
        }
    }

}