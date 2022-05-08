package com.example.qrdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Transitions into ScanActivity via an Intent, open device's camera
     */
    fun scanningPage(view: View) {
    }

    /**
     * Transitions into BookmarksActivity via an Intent
     */
    fun bookmarksPage(view: View) {

    }

    /**
     * Toggle between light and dark mode when the switch is clicked
     */
    fun toggleDarkMode() {

    }
}