package com.example.wallpaper

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

             findViewById<Button>(R.id.firebase).setOnClickListener {
                 val database = Firebase.database
                 val myRef = database.getReference("message")
                 myRef.setValue("Hello, World!")
             }

    }
}