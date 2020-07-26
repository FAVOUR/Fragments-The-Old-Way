package com.example.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.fragments.ExploreFragment.Companion.newInstance

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)
        Log.e("Here","IntroFragment")
        setupFragment()
    }


    private fun setupFragment() {
        Log.e("Here INTRO FRAGMENT","setupFragment")

        val exploreFragment = ExploreFragment.newInstance()
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().apply {
                                                        add(R.id.container,exploreFragment)
//                                                            .addToBackStack(null)
                                                         commit()
                                                         }
    }
    override fun onResume() {
        super.onResume()
        Log.e("Here OnResume","IntroFragment")

    }
}