package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.first.ui.theme.FirstTheme
import java.util.Scanner

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}
fun main(){
//    println("enter the value ")
//    var a1=readLine()!!
//    println("Entered value is "+a1)
//    println("Convert the value of Int "+a1.toInt())
//
//    println("Enter the value: ")
//    var a2=readln()
//    println("Entered value is "+a2)

//    var sc= Scanner(System.`in`)
//    var i=sc.nextInt()
//    println("Enter value is of int type: "+i)
//    var d=sc.nextDouble()
//    println("Entered value is of double type: "+d)

//    println("Enter name: ")
//    var sc= Scanner(System.`in`)
//    var n=sc.nextLine()
//    println("Enter Reg no.: ")
//    var reg=sc.nextInt()
//    println("Enter CGPA: ")
//    var c=sc.nextDouble()
//    println("Placed/Not Placed: ")
//    var p=sc.nextLine()
//
//    println(n+" with Reg no.U "+reg+" and CGPA of "+c+" is "+p)

//    var s:String="LPU"
//    val l=s.length
//    print(l)
//
//    var a: String?=null
//    val len=a?.length
//    print(len)
//
//    var d:String?="Vertos"
//    var name=d?:"LPU"
//    print(name)




}
fun input(subject:String){
    if(subject.equals(""))
        println("Enter the subject name:")
    if(subject.equals("Maths"))
        println("You can take the admission in CSE")
    else
        println("Take the admission in another branch")
}