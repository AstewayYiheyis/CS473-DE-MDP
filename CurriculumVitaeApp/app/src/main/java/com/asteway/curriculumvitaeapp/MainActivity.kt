package com.asteway.curriculumvitaeapp

import android.content.Intent;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("CV");

        val intent = Intent(applicationContext, Login::class.java);
        startActivity(intent)
    }
}