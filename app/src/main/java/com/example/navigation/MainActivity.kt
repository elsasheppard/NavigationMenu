package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    // using instance variables for these because the way the tutorial suggested
    // causes a crash (This is in step 1)
    // https://developer.android.com/codelabs/kotlin-android-training-add-navigation#7
    private lateinit var navController : NavController
    private lateinit var navHostFragment : NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // as = casting
        navHostFragment =  supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp() : Boolean {
        return navController.navigateUp()
    }
}