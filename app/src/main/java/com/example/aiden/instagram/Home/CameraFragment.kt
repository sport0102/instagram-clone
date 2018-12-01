package com.example.aiden.instagram.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aiden.instagram.R

class CameraFragment : androidx.fragment.app.Fragment() {
    private val TAG = "CameraFragment"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_camera, container, false)
        return view
    }
}