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

class ConstraintLeyout : AppCompatActivity() {

    lateinit var b: Button
    lateinit var e: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constraint_leyout)

        b=findViewById(R.id.button)
        e=findViewById(R.id.editText)
        b.setOnClickListener {
            var name=e.text.toString()
            Toast.makeText(this, "Logged In Sucessfully $name", Toast.LENGTH_LONG).show()
        }

    }
}