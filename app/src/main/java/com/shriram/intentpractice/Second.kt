package com.shriram.intentpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val display = findViewById<TextView>(R.id.showMsg)

        val uName = intent.getStringExtra("Name")
        display.text = "Hello "+ uName

    }
}

