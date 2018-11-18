package com.example.aiden.instagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aiden.instagram.R.id.bottomNavViewBar
import com.example.aiden.instagram.Utils.BottomNavigationViewHelper
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class HomeActivity : AppCompatActivity() {
    private val TAG = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setUpBottomNavigationView()
    }

    /*BottomNavigationView setUp*/
    private fun setUpBottomNavigationView() {
        Log.d(TAG, "setUpBottomNavigationView: setupNavigationView")
        var bottomNaviViewBar = findViewById<BottomNavigationViewEx>(R.id.bottomNavViewBar)
        BottomNavigationViewHelper().setUpBottomNavigationView(bottomNaviViewBar)
    }
}
