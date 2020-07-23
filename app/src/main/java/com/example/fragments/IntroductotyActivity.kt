package com.example.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.fragments.ExploreFragment.Companion.newInstance

class IntroductotyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)
    }


    fun setupFragment() {
            val exploreFragment = ExploreFragment.newInstance()
            val fragmentManager: FragmentManager = supportFragmentManager.beginTransaction()
                .add(e)
                                                     .

    }
}