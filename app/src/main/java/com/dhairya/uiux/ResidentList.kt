package com.dhairya.uiux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ResidentList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resident_list)

        val resident_list = findViewById<ListView>(R.id.resident_list)
    }
}