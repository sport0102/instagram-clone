package com.example.aiden.instagram.Profile

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.aiden.instagram.R
import com.example.aiden.instagram.Utils.ACTIVINUM_PROFILE
import com.example.aiden.instagram.Utils.BOTTOM_NAVIGATION_VIEW_HELPER
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    private val TAG = "ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate: started")
        setUpBottomNavigationView()
        setupToolbar()
    }

    private fun setupToolbar() {
        var toolBar = findViewById<Toolbar>(R.id.profileToolBar)
        setSupportActionBar(toolBar)
        toolBar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(p0: MenuItem?): Boolean {
                Log.d(TAG, "onMenuItemClick: clicked menu item : ${p0}")
                when (p0!!.itemId) {
                    R.id.profileMenu -> {
                        Log.d(TAG, "onMenuItemClick: Navigating to Profile Preference")
                    }
                }
                return false
            }

        })
    }

    /*BottomNavigationView setUp*/
    private fun setUpBottomNavigationView() {
        Log.d(TAG, "setUpBottomNavigationView: setupNavigationView")
        var bottomNaviViewBar = findViewById<BottomNavigationView>(R.id.bottomNavViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.setUpBottomNavigationView(bottomNaviViewBar)
        BOTTOM_NAVIGATION_VIEW_HELPER.enableNavigation(this@ProfileActivity, bottomNaviViewBar)
        bottomNaviViewBar.menu.getItem(ACTIVINUM_PROFILE).setChecked(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }
}