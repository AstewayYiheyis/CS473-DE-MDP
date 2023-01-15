package com.asteway.curriculumvitaeapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class Home : AppCompatActivity() {
    lateinit var headerLayOut: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.setTitle("Quiz App");
        val buttonClick = findViewById<Button>(R.id.start_quiz_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, QuizPage::class.java)
            startActivity(intent)
        }
    }
}