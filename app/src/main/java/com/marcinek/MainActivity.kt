package com.marcinek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 0
        val btnClickMe = findViewById<Button>(R.id.but_ml)
        val fieldText = findViewById<TextView>(R.id.textView)

        btnClickMe.setOnClickListener {
            counter += 1
            fieldText.text= counter.toString()
            Toast.makeText(this, "Hey I'm a toast!,", Toast.LENGTH_LONG).show()
        }

    }
}