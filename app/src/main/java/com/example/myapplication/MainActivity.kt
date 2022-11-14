package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun onClickTest(view : View){

        val ffff = findViewById<TextView>(R.id.hellopro)
       ffff.text = "zero"
    }
    fun onClickTesttwo (view: View){
        val fffff = findViewById<TextView>(R.id.hellopro2)
        fffff.text = "zero"}
    fun onClickTestthree (view: View){
        val ffffff = findViewById<TextView>(R.id.hellopro3)
        ffffff.text = "one million dollar"
    }
    }
