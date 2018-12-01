package com.example.aiden.instagram.Home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.aiden.instagram.R
import com.example.aiden.instagram.R.id.container
import com.example.aiden.instagram.R.id.tabs
import com.example.aiden.instagram.Utils.ACTIVINUM_HOME
import com.example.aiden.instagram.Utils.BOTTOM_NAVIGATION_VIEW_HELPER
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    private val TAG = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setUpBottomNavigationView()
        setUpViewPager()
    }

    /*Responsible for adding the 3 tabs : Camera, Home, Messages*/
    private fun setUpViewPager() {
        var adapter = SectionsPagerAdapter(supportFragmentManager)
        adapter.addFragment(CameraFragment()) //index 0
        adapter.addFragment(HomeFragment()) //index 1
        adapter.addFragment(MessageFragment()) //index2
        var viewPager = findViewById<androidx.viewpager.widget.ViewPager>(container)
        viewPager.adapter = adapter

        var tabLayout = findViewById<TabLayout>(tabs)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_camera)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_instagram_logo)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_arrow)
    }

    /*BottomNavigationView setUp*/
    private fun setUpBottomNavigationView() {
        Log.d(TAG, "setUpBottomNavigationView: setupNavigationView")
        var bottomNaviViewBar = findViewById<BottomNavigationView>(R.id.bottomNavViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.setUpBottomNavigationView(bottomNaviViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.enableNavigation(this@HomeActivity, bottomNaviViewBar)
        bottomNaviViewBar.menu.getItem(ACTIVINUM_HOME).setChecked(true)
    }
}
