package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.ui.theme.FirstTheme

class box : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                boox()
            }
        }
    }
}

@Composable
fun boox(){
//    Box(modifier = Modifier.fillMaxSize()) {  // Added fillMaxSize()
//        Image(
//            painter = painterResource(R.drawable.img_8),
//            contentDescription = null,
//            modifier = Modifier.fillMaxSize()
//        )
//        Text(
//            text = "Quizzz",
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//        )
//    }

//    Box(modifier = Modifier.size(200.dp)){
//        Box(modifier = Modifier
//            .size(150.dp).background(Color.Red, shape = CircleShape)
//            .align(Alignment.Center)
//        )
//        Box(modifier = Modifier
//            .size(100.dp).background(Color.Blue, shape = CircleShape)
//            .align(Alignment.Center)
//        )
//        Box(modifier = Modifier
//            .size(60.dp).background(Color.Black, shape = CircleShape)
//            .align(Alignment.Center)
//        )
//    }

    Box(modifier = Modifier.size(200.dp)) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Yellow, shape = CircleShape)
                .align(Alignment.Center)
        )
        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-30).dp),
            horizontalArrangement = Arrangement.spacedBy(60.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(Color.Black, shape = CircleShape)
            )
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(Color.Black, shape = CircleShape)
            )
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    FirstTheme {
        boox()
    }
}