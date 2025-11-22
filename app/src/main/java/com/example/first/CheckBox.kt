package com.example.first

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first.ui.theme.FirstTheme

class CheckBox : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                    call()
                }
            }
        }
    }

@Composable
fun call(){
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxSize()) {
        Text(text = "Select Stream", color = Color.Red)

        var opt1 by remember { mutableStateOf(false) }
        var opt2 by remember { mutableStateOf(false) }

        var context=LocalContext.current

        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Checkbox(opt1, onCheckedChange = { opt1 = it })
            if (opt1){
                Toast.makeText(context, "You have selected CSE", Toast.LENGTH_SHORT).show()
            }
            Text(text = "CSE", color = Color.Black)
        }

        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Checkbox(opt2, onCheckedChange = { opt2 = it })
            if (opt2){
                Toast.makeText(context, "You have selected ECE",  Toast.LENGTH_SHORT).show()
            }
            Text(text = "ECE", color = Color.Black)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    FirstTheme {
        call()
    }
}