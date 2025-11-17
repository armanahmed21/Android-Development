package com.example.first

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PlacementEligibity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var name1: EditText
    lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_placement_eligibity)
        name = findViewById(R.id.et11)
        name1 = findViewById(R.id.et12)
        button = findViewById(R.id.button3)
        button.setOnClickListener {
            var name = name.text.toString()
            var name1 = name1.text.toString()

            if (name1 >= "5.5") {
                Toast.makeText(this, "You can sit in placement", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
