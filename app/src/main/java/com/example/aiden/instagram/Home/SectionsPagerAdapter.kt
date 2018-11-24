package com.example.aiden.instagram.Home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/*
* Class that stores fragments for tabs
* */

class SectionsPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val TAG = "SectionsPagerAdapter"
    private val mFragmentList = ArrayList<Fragment>()
    override fun getItem(p0: Int): Fragment {
        return mFragmentList.get(p0)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment) {
        mFragmentList.add(fragment)
    }
}