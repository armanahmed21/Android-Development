package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first.ui.theme.FirstTheme

class calc : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                calculator()
            }
        }
    }
}
@Composable
fun calculator () {
    TextField()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}) { Text("7") }
            Button(onClick = {}) { Text("8") }
            Button(onClick = {}) { Text("9") }
            Button(onClick = {}) { Text("/") }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
        ) {
        Button(onClick = {}) { Text("4") }
        Button(onClick = {}) { Text("5") }
        Button(onClick = {}) { Text("6") }
        Button(onClick = {}) { Text("*") }
    }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}) { Text("1") }
            Button(onClick = {}) { Text("2") }
            Button(onClick = {}) { Text("3") }
            Button(onClick = {}) { Text("-") }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
            ) {
            Button(onClick = {}) { Text("0") }
            Button(onClick = {}) { Text("00") }
            Button(onClick = {}) { Text(".") }
            Button(onClick = {}) { Text("+") }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly)
        {
            Button(onClick = {}) { Text("=") }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirstTheme {
        calculator()

    }
}