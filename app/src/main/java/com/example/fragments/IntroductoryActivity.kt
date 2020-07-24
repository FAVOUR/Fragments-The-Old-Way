package com.example.fragments

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.fragments.ExploreFragment.Companion.newInstance

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        setupFragment()
    }


    private fun setupFragment() {
            val exploreFragment = newInstance()
            val fragmentManager: FragmentManager = supportFragmentManager
            fragmentManager.beginTransaction().apply {
                                                        add(R.id.container,exploreFragment)
                                                        addToBackStack(ExploreFragment::class.simpleName)
                                                         commit()
                                                         }
    }
}