package com.shriram.intentpractice

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("UnsafeIntentLaunch")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputArea = findViewById<EditText>(R.id.inputName)

        val submit = findViewById<Button>(R.id.submitBtn)
        submit.setOnClickListener {

            val name = inputArea.text.toString()
            intent = Intent(this, Second::class.java)
            intent.putExtra("Name",name)
            startActivity(intent)
        }




    }
}