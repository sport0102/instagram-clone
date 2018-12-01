package com.example.aiden.instagram.Home

/*
* Class that stores fragments for tabs
* */

class SectionsPagerAdapter(fm: androidx.fragment.app.FragmentManager?) : androidx.fragment.app.FragmentPagerAdapter(fm) {
    private val TAG = "SectionsPagerAdapter"
    private val mFragmentList = ArrayList<androidx.fragment.app.Fragment>()
    override fun getItem(p0: Int): androidx.fragment.app.Fragment {
        return mFragmentList.get(p0)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: androidx.fragment.app.Fragment) {
        mFragmentList.add(fragment)
    }
}