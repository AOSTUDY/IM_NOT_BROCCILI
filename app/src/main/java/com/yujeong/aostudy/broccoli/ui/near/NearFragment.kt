package com.yujeong.aostudy.broccoli.ui.near

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHeartBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentNearBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment

class NearFragment : BaseFragment<FragmentNearBinding>(R.layout.fragment_near){

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