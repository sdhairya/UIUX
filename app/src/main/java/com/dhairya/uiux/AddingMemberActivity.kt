package com.dhairya.uiux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.textfield.TextInputEditText

class AddingMemberActivity : AppCompatActivity() {

    var arr=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adding_member)

        var listview = findViewById<ListView>(R.id.list_members)
        var add_member = findViewById<AppCompatButton>(R.id.btn_add_member)
        var member_email=findViewById<TextInputEditText>(R.id.email_edittext)
        var member_flatno=findViewById<TextInputEditText>(R.id.flatno_edittext)
        add_member.setOnClickListener {
            if(member_flatno.text.toString() == "")
            {
                Toast.makeText(this, "Please enter Email Address", Toast.LENGTH_LONG).show()
            }
            else
            {
                var details=member_email.text.toString() +"\t\t\t"+ member_flatno.text.toString()
                arr.add(details)
            }
            var adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
            listview.adapter = adapter
        }

    }
}