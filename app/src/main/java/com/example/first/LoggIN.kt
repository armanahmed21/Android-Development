package com.example.first

import android.R.attr.value
import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.ui.theme.FirstTheme

class LoggIN : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                login()
            }
        }
    }
}

@Composable
fun login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var opt1 by remember { mutableStateOf(false) }

    var context=LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Log In",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            ),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        TextField(
            value = email, onValueChange = { email = it }, label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        TextField(
            value = password, onValueChange = { password = it }, label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp), visualTransformation = PasswordVisualTransformation()
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Checkbox(opt1, onCheckedChange = { opt1 = it })
            Text(
                text = "Remember Me",
                color = Color.White,
                modifier = Modifier.padding(top = 12.dp)
            )
            if (opt1){
                Toast.makeText(context, "I will remember    ", Toast.LENGTH_SHORT).show()
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
        ) {
            val context=LocalContext.current
            Button(
                onClick = {
                    if (email.isEmpty() || password.isEmpty()) {
                        Toast.makeText(context, "Enter Email and Password", Toast.LENGTH_SHORT)
                            .show()
                    }
                    else if( email=="admin@123" && password=="admin123"){
                        Toast.makeText(context, "Logged In As Admin", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(context, "Logged In", Toast.LENGTH_SHORT).show()
                    }
                }
            ) {
                Text(text = "Log In")
            }
            Button(
                onClick = {
                    Toast.makeText(context, "Signing In", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text(text = "Sign In")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstTheme {
        login()
    }
}
