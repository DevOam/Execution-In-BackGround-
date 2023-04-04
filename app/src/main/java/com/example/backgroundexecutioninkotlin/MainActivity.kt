package com.example.backgroundexecutioninkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recuperer_compteur:TextView=findViewById(R.id.compteur)


        val intent = Intent(this, MonService::class.java)
        startService(intent)


    }
}