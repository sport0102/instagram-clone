package com.example.aiden.instagram

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.aiden.instagram.Utils.ACTIVINUM_LIKES
import com.example.aiden.instagram.Utils.BOTTOM_NAVIGATION_VIEW_HELPER
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class LikesActivity : AppCompatActivity() {
    private val TAG = "LikesActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate: started")
        setUpBottomNavigationView()
    }

    /*BottomNavigationView setUp*/
    private fun setUpBottomNavigationView() {
        Log.d(TAG, "setUpBottomNavigationView: setupNavigationView")
        var bottomNaviViewBar = findViewById<BottomNavigationViewEx>(R.id.bottomNavViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.setUpBottomNavigationView(bottomNaviViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.enableNavigation(this@LikesActivity, bottomNaviViewBar)
        bottomNaviViewBar.menu.getItem(ACTIVINUM_LIKES).setChecked(true)
    }
}