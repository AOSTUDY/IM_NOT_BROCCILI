package com.yujeong.aostudy.broccoli.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentDomesticHomeBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment
import com.yujeong.aostudy.broccoli.ui.home.adapter.ReviewAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class DomesticHomeFragment : BaseFragment<FragmentDomesticHomeBinding>(R.layout.fragment_domestic_home) {

    private val domesticViewModel : DomesticViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState)
        domesticViewModel.setReviewList()
        setDomesticAdapter()
        setDomesticListObserve()

        return binding.root;
    }

    private fun setDomesticAdapter(){
        binding.rvRealtimeReview.adapter = ReviewAdapter()
    }

    private fun setDomesticListObserve() {
       domesticViewModel.reviewList.observe(viewLifecycleOwner){
               reviewList -> with(binding.rvRealtimeReview.adapter as ReviewAdapter){
            setReviewList(reviewList) }
        }
    }
}