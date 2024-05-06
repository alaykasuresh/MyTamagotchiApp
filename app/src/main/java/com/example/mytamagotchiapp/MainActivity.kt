package com.example.mytamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Dogbtn = findViewById<Button>(R.id.Dogbtn)
        Dogbtn.setOnClickListener {
            val intent = Intent(this, PlayPage2::class.java)
            startActivity(intent)
        }

        val Catbtn = findViewById<Button>(R.id.Catbtn)
        Catbtn.setOnClickListener {
            val intent = Intent(this, PlayPage::class.java)
            startActivity(intent)


        }
    }
}