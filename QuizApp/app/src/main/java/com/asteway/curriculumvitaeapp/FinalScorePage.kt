package com.asteway.curriculumvitaeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class FinalScorePage : AppCompatActivity() {
    lateinit var headerLayOut: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_score_page)

        val tryAgain = findViewById<Button>(R.id.try_againbtn)
        tryAgain.setOnClickListener {
            val intent = Intent(this, QuizPage::class.java)
            startActivity(intent)
        }

        val resultAnalysisPage = findViewById<Button>(R.id.result_analysisbtn)
        resultAnalysisPage.setOnClickListener {
            val intent = Intent(this, ResultAnalysisPage::class.java)
            startActivity(intent)
        }
    }
}