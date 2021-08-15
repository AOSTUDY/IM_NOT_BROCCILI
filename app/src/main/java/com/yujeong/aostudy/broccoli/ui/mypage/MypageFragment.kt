package com.yujeong.aostudy.broccoli.ui.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yujeong.aostudy.broccoli.R
import com.yujeong.aostudy.broccoli.databinding.FragmentHomeBinding
import com.yujeong.aostudy.broccoli.databinding.FragmentMypageBinding
import com.yujeong.aostudy.broccoli.ui.base.BaseFragment

class MypageFragment : BaseFragment<FragmentMypageBinding>(R.layout.fragment_mypage){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}