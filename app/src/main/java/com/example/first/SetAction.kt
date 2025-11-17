package com.example.first

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class SetAction : AppCompatActivity() {

    lateinit var nameText: TextView
    lateinit var nameEditText: EditText
    lateinit var click: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_set_action)
        nameText = findViewById(R.id.tv1)
        nameEditText = findViewById(R.id.et1)
        click = findViewById(R.id.btn)

        click.setOnClickListener {
            var name = nameEditText.text.toString()
            nameText.text = "Welcome $name !! "
        }
    }
}

