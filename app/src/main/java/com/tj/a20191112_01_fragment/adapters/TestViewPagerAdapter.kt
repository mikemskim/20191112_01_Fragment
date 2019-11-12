package com.tj.a20191112_01_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tj.a20191112_01_fragment.fragments.FirstFragment
import com.tj.a20191112_01_fragment.fragments.SecondFragment

class TestViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

//    각 위치에 어떤 fragment를 보여줄 건지
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        } else {
            return SecondFragment()
        }

    }

//    몇개의 페이지를 운영할 건지
    override fun getCount(): Int {
        return 2
    }

}