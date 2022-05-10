package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //^This section calls upon the layout of activity_main to display it on the screen.
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra("My_message", message)
        }
        startActivity(intent)
    }
    //^This section preforms an action when the button is pressed.
}