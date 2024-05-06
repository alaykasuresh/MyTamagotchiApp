package com.example.mytamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class PlayPage2 : AppCompatActivity() {

    private lateinit var petImageView2: ImageView
    private lateinit var feedbtn2: Button
    private lateinit var cleanbtn2: Button
    private lateinit var playwithbtn2: Button
    private lateinit var happinesspb2: ProgressBar
    private lateinit var hungerpb2: ProgressBar
    private lateinit var cleanlinesspb2: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_page2)

        // Initialize views
        petImageView2 = findViewById(R.id.petImageView2)
        feedbtn2 = findViewById(R.id.feedbtn2)
        cleanbtn2 = findViewById(R.id.cleanbtn2)
        playwithbtn2 = findViewById(R.id.playwithbtn2)
        happinesspb2 = findViewById(R.id.happinesspb2)
        cleanlinesspb2 = findViewById(R.id.cleanlinesspb2)
        hungerpb2 = findViewById(R.id.hungerpb2)

        var BackButton2 = findViewById<Button>(R.id.BackButton2)
        BackButton2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Set initial pet image
        petImageView2.setImageResource(R.drawable.normal_dog)

        // Set up button click listeners
        feedbtn2.setOnClickListener { feedPet() }
        cleanbtn2.setOnClickListener { cleanPet() }
        playwithbtn2.setOnClickListener { playWithPet() }
    }

    private fun feedPet() {
        petImageView2.setImageResource(R.drawable.sad_dog)
        happinesspb2.progress += 5
        hungerpb2.progress += 10
        cleanlinesspb2.progress -= 2
    }

    private fun cleanPet() {
        petImageView2.setImageResource(R.drawable.dirty_dog)
        happinesspb2.progress += 5
        hungerpb2.progress -= 2
        cleanlinesspb2.progress += 10
    }

    private fun playWithPet() {
        petImageView2.setImageResource(R.drawable.happy_dog)
        happinesspb2.progress += 8
        hungerpb2.progress -= 4
        cleanlinesspb2.progress -= 3
    }
}
