package com.yujeong.aostudy.broccoli.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentRecommendHomeBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment
import com.yujeong.aostudy.broccoli.ui.home.adapter.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RecommendHomeFragment : BaseFragment<FragmentRecommendHomeBinding>(R.layout.fragment_recommend_home) {

    private val recommendHomeViewModel : RecommendHomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        recommendHomeViewModel.setNewHotList()
        setNewHotAdapter()
        setNewHotListObserve()

        recommendHomeViewModel.setEventList()
//        setEventAdapter()
//        setEventListObserve()

        recommendHomeViewModel.setAdList()
        setAdAdapter()
        setAdListObserve()

        recommendHomeViewModel.setTodayHotList()
        setTodayHotAdapter()
        setTodayHotListObserve()

        recommendHomeViewModel.setDomesticList()
        setDomesticAdapter()
        setDomesticListObserve()

        recommendHomeViewModel.setWeeklyList()
        setWeeklyAdapter()
        setWeeklyListObserve()

        recommendHomeViewModel.setMagazineList()
        setMagazineAdapter()
        setMagazineListObserve()

        return binding.root
    }

    private fun setNewHotAdapter(){
       binding.rvRecommendNh.adapter = NewHotListAdapter()
    }

    private fun setNewHotListObserve() {
       recommendHomeViewModel.newHotList.observe(viewLifecycleOwner){
           newHotList -> with(binding.rvRecommendNh.adapter as NewHotListAdapter){
               setNewHot(newHotList) }
       }
    }

//    private fun setEventAdapter(){
//        binding.rvRecommendEvent.adapter = EventListAdapter()
//    }

//    private fun setEventListObserve() {
//        recommendHomeViewModel.eventList.observe(viewLifecycleOwner){
//                newHotList -> with(binding.rvRecommendEvent.adapter as EventListAdapter){
//                setEvent(newHotList) }
//        }
//    }

    private fun setAdAdapter(){
        binding.vpRecommendAd1.apply {
            adapter = AdListAdapter()
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.tvAd1Page.text = "0${position + 1}/09"
                }
            })
        }
    }
    private  fun setAdListObserve() {
        recommendHomeViewModel.adList.observe(viewLifecycleOwner){
            adList -> with(binding.vpRecommendAd1.adapter as AdListAdapter){
                setAd(adList) }
        }
    }

    private fun setTodayHotAdapter(){
        binding.rvRecommendToday.adapter = TodayHotListAdapter()
    }

    private fun setTodayHotListObserve(){
        recommendHomeViewModel.todayHotList.observe(viewLifecycleOwner){
            todayList -> with(binding.rvRecommendToday.adapter as TodayHotListAdapter){
                setTodayHot(todayList)
        }
        }
    }

    private fun setDomesticAdapter(){
        binding.rvRecommendLocal.adapter = DomesticListAdapter()
    }
    private fun setDomesticListObserve(){
        recommendHomeViewModel.domesticList.observe(viewLifecycleOwner){
            domesticList -> with(binding.rvRecommendLocal.adapter as DomesticListAdapter){
                setDomestic(domesticList)
        }
        }
    }

    private fun setWeeklyAdapter(){
        binding.rvRecommendWeekly.adapter = WeeklyListAdapter()
    }

    private fun setWeeklyListObserve(){
        recommendHomeViewModel.weeklyList.observe(viewLifecycleOwner){
            weeklyList -> with(binding.rvRecommendWeekly.adapter as WeeklyListAdapter){
                setWeekly(weeklyList)
        }
        }
    }

    private fun setMagazineAdapter(){
        binding.rvHomeMagazine.adapter = MagazineListAdapter()
    }
    private fun setMagazineListObserve(){
        recommendHomeViewModel.magazineList.observe(viewLifecycleOwner){
            magazineList -> with(binding.rvHomeMagazine.adapter as MagazineListAdapter){
                setMagazine(magazineList)
        }
        }
    }
}