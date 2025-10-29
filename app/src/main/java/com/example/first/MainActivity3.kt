package com.example.first

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.AlertDialog
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Log.d("My app status","OnCreate is called")
        }

    override fun onStart() {
        super.onStart()
        Log.d("My app status","OnCreate is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("My app status","OnResume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("My app status","OnPause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("My app status","OnStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My app status","OnDestroy is called")
    }

}
