package com.asteway.curriculumvitaeapp

import android.app.Activity
import android.content.Intent;
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.asteway.curriculumvitaeapp.db.Question
import com.asteway.curriculumvitaeapp.db.QuestionDao
import com.asteway.curriculumvitaeapp.db.QuestionDatabase
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private val questionDatabase by lazy { QuestionDatabase.getDatabase(this).questionDao() }

    private val newNoteResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val noteText = result.data?.getStringExtra("note_text")
                val questionOne = Question(1, "Represents a table within a database: ",
                    "Intent \n Entity \n Row \n Id",
                    "B");
                val questionTwo = Question(2, "Database is annotated with: ",
                    "Database \n Entity \n Row \n Id",
                    "A");
                val questionThree = Question(3, "Contains Methods used for accessing the database: ",
                    "Dao \n Column \n Row \n Primary Key",
                    "A");
                val questionFour = Question(4, "Live data advantages: ",
                    "No memory leaks \n Always up to date data \n Sharing resources \n All choices above",
                    "D");
                val questionFive = Question(5, "Allows data to survive configuration changes such\n" +
                        "as screen rotations: ",
                    "View \n Entity \n ViewModel \n Database",
                    "C");
                val questionSix = Question(6, "Jetpack compose into which categories? ",
                    "Foundation \n Behavior \n UI \n All choices above",
                    "D");
                val questionSeven = Question(7, "Which of the following is not a type of android permission: ",
                    "Normal/Installed permissions \n Dangerous/Runtime permissions \n Table permission \n A and B",
                    "C");
                val questionEight = Question(8, "Returns an integer value indicating the current\n" +
                        "position of playback: ",
                    "setMediaController(MediaController) \n setOnPreparedListener(MediaPlayer.OnPreparedListener) \n getCurrentPosition() \n None of the choices",
                    "C");
                val questionNine = Question(9, "Controls are displayed for the designated duration: ",
                    "setAnchorView(View view) \n show(int timeout) \n show() \n isShowing()",
                    "B");
                val questionTen = Question(10, "Android devices make excellent platforms for the delivery of\n" +
                        "content to users, particularly in the form of video media.: ",
                    "True \n False",
                    "A");
                val questionEleven = Question(11, "MediaRecorder is a more advanced option that uses streaming audio buffers and\n" +
                        "provides greater control over the audio: ",
                    "True \n False",
                    "B");
                val questionTwelve = Question(12, "We set the output format of a media recorder using: ",
                    "setAudioEncoder() \n setOutputFormat() \n setOutputFile() \n prepare()",
                    "B");
                val questionThirteen = Question(13, "Useful methods in WebViewClent class are onPageStatred and\n" +
                        "onPageFinished helps to perform something when the page is started, new Url\n" +
                        "is loaded and the page has finished loading: ",
                    "True \n False",
                    "A");
                val questionFourteen = Question(14, "Option for storing data as key value pairs: ",
                    "Shared Preferences \n External Storage \n Internal Storage \n Network Connection",
                    "A");
                val questionFifteen = Question(15, "Which of the following are data exchange formats: ",
                    "JSON \n XML \n Both A and B \n None",
                    "C");

                lifecycleScope.launch {
                    questionDatabase.addQuestion(questionOne)
                    questionDatabase.addQuestion(questionTwo)
                    questionDatabase.addQuestion(questionThree)
                    questionDatabase.addQuestion(questionFour)
                    questionDatabase.addQuestion(questionFive)
                    questionDatabase.addQuestion(questionSix)
                    questionDatabase.addQuestion(questionSeven)
                    questionDatabase.addQuestion(questionEight)
                    questionDatabase.addQuestion(questionNine)
                    questionDatabase.addQuestion(questionTen)
                    questionDatabase.addQuestion(questionEleven)
                    questionDatabase.addQuestion(questionTwelve)
                    questionDatabase.addQuestion(questionThirteen)
                    questionDatabase.addQuestion(questionFourteen)
                    questionDatabase.addQuestion(questionFifteen)
                }
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("Quiz App");

        val intent = Intent(applicationContext, Home::class.java);
        startActivity(intent)
    }
}