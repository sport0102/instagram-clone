package com.example.aiden.instagram.Utils

import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.aiden.instagram.Home.HomeActivity
import com.example.aiden.instagram.Likes.LikesActivity
import com.example.aiden.instagram.Profile.ProfileActivity
import com.example.aiden.instagram.R
import com.example.aiden.instagram.Search.SearchActivity
import com.example.aiden.instagram.Share.ShareActivity
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

val BOTTOM_NAVIGATION_VIEW_HELPER = BottomNavigationViewHelper()
val ACTIVINUM_HOME = 0
val ACTIVINUM_LIKES = 3
val ACTIVINUM_PROFILE = 4
val ACTIVINUM_SEARCH = 1
val ACTIVINUM_SHARE = 2

class BottomNavigationViewHelper {
    private val TAG = "BottomNavigationViewHel"
    fun setUpBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
        Log.d(TAG, "setUpBottomNavigationView: settion up bottom navigation view")
        bottomNavigationViewEx.enableAnimation(false)
        bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.enableItemShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
    }

    fun enableNavigation(context: Context, view: BottomNavigationViewEx) {
        Log.d(TAG, "enableNavigation: in")
        view.setOnNavigationItemSelectedListener {
            Log.d(TAG, "enableNavigation: onClick ${it.itemId}")
            when (it.itemId) {
                R.id.ic_house -> {
                    var intent = Intent(context, HomeActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.ic_search -> {
                    var intent = Intent(context, SearchActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.ic_circle -> {
                    var intent = Intent(context, ShareActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.ic_alert -> {
                    var intent = Intent(context, LikesActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.ic_android -> {
                    var intent = Intent(context, ProfileActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                else -> {
                    Log.d(TAG, "enableNavigation: else")
                    true
                }

            }
        }
    }
}