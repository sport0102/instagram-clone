package com.example.aiden.instagram.Utils

import android.support.design.widget.BottomNavigationView
import android.util.Log
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomNavigationViewHelper {
    private val TAG = "BottomNavigationViewHel"
    fun setUpBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
        Log.d(TAG, "setUpBottomNavigationView: settion up bottom navigation view")
        bottomNavigationViewEx.enableAnimation(false)
        bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.enableItemShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
    }
}