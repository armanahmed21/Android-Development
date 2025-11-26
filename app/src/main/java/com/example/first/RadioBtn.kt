package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.ui.theme.FirstTheme

class RadioBtn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                quiz()
            }
        }
    }
}

@Composable
fun quiz() {
    Column(modifier = Modifier.fillMaxSize().padding(30.dp)) {

        //image
        Image(painter = painterResource(R.drawable.img_8),
            contentDescription = null , modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally))
        //question
        Text("Where do we define intent-filter?", fontSize = 18.sp)


        val options = listOf("Gradle", "Manifest", "Resource", "None of the above")
        var selectedOptions by remember { mutableStateOf("") }
        var showResult by remember { mutableStateOf(false) }


        options.forEach { option ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOptions == option,
                    onClick = { selectedOptions = option }
                )
                Text(option)
            }
        }

        Button(
            onClick = { showResult = true },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit")
        }


        if (showResult) {
            if (selectedOptions == "Manifest") {
                Text(
                    text = "1/1",
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.primary
                )
            } else {
                Text(
                    text = "0/1",
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    FirstTheme {
        quiz()
    }
}