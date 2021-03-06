package com.example.aiden.instagram.Share

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.aiden.instagram.R
import com.example.aiden.instagram.Utils.ACTIVINUM_SHARE
import com.example.aiden.instagram.Utils.BOTTOM_NAVIGATION_VIEW_HELPER
import com.google.android.material.bottomnavigation.BottomNavigationView

class ShareActivity : AppCompatActivity() {
    private val TAG = "ShareActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate: started")
        setUpBottomNavigationView()
    }

    /*BottomNavigationView setUp*/
    private fun setUpBottomNavigationView() {
        Log.d(TAG, "setUpBottomNavigationView: setupNavigationView")
        var bottomNaviViewBar = findViewById<BottomNavigationView>(R.id.bottomNavViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.setUpBottomNavigationView(bottomNaviViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.enableNavigation(this@ShareActivity, bottomNaviViewBar)
        bottomNaviViewBar.menu.getItem(ACTIVINUM_SHARE).setChecked(true)
    }
}