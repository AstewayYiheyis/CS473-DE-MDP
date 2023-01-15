package com.asteway.curriculumvitaeapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.asteway.curriculumvitaeapp.db.Question
import com.asteway.curriculumvitaeapp.db.QuestionDao
import com.asteway.curriculumvitaeapp.db.QuestionDatabase


class QuizPage : AppCompatActivity() {
    private val questions: List<Question>? = null
    private lateinit var questionDatabase: QuestionDatabase
    private lateinit var questionDao: QuestionDao
    private var counter:Int = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_page)

        supportActionBar?.setTitle("Quiz App");

        val questionText = findViewById<View>(R.id.question_text) as TextView
        loadQuestion(questionText);
    }

    private fun loadQuestion(questionText: TextView) {
        questionDao = questionDatabase.questionDao()
        val question = questionDao.getAllQuestions().first();
        questionText.setText(question.question);
        counter++;
    }
}