package com.example.mytamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class PlayPage : AppCompatActivity() {

    private lateinit var petImageView: ImageView
    private lateinit var feedbtn: Button
    private lateinit var cleanbtn: Button
    private lateinit var playwithbtn: Button
    private lateinit var happinesspb: ProgressBar
    private lateinit var hungerpb: ProgressBar
    private lateinit var cleanlinesspb: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_page)

var BackButton = findViewById<Button>(R.id.BackButton)
        BackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Initialize views
        petImageView = findViewById(R.id.petImageView)
        feedbtn = findViewById(R.id.feedbtn)
        cleanbtn = findViewById(R.id.cleanbtn)
        playwithbtn = findViewById(R.id.playwithbtn)
        happinesspb = findViewById(R.id.happinesspb)
        cleanlinesspb = findViewById(R.id.cleanlinesspb)
        hungerpb = findViewById(R.id.hungerpb)


        // Set initial pet image
        petImageView.setImageResource(R.drawable.tamagotchi_app__1__happy_cat)

        // Set up button click listeners
        feedbtn.setOnClickListener { feedPet() }
        cleanbtn.setOnClickListener { cleanPet() }
        playwithbtn.setOnClickListener { playWithPet() }
    }

    private fun feedPet() {
        petImageView.setImageResource(R.drawable.sad_cat)
        happinesspb.progress += 5
        hungerpb.progress += 10
        cleanlinesspb.progress -= 2
    }

    private fun cleanPet() {
        petImageView.setImageResource(R.drawable.dirty_cat)
        happinesspb.progress += 5
        hungerpb.progress -= 2
        cleanlinesspb.progress += 10
    }

    private fun playWithPet() {
        petImageView.setImageResource(R.drawable.tamagotchi_app__1__happy_cat)
        happinesspb.progress += 8
        hungerpb.progress -= 4
        cleanlinesspb.progress -= 3
    }
}
