package com.yujeong.aostudy.broccoli.ui.heart

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHeartBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentLocationBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment

class HeartFragment : BaseFragment<FragmentHeartBinding>(R.layout.fragment_heart){

    private lateinit var mContext: Context

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        mContext = requireContext()

        return binding.root
    }


}