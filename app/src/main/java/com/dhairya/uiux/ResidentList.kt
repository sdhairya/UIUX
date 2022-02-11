package com.dhairya.uiux

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class ResidentList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resident_list)

        var resident_list = findViewById<ListView>(R.id.resident_list)
        var showdialogdemo = findViewById<Button>(R.id.showdialogdemo)

        showdialogdemo.setOnClickListener {

            val dialog = Dialog(this)
            dialog.setContentView(R.layout.resident_details_dialog)
            dialog.show()
        }
    }
}