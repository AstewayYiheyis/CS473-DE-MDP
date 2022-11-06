package com.asteway.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import com.asteway.quiz_app.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding;
    lateinit var questionOneGroup: RadioGroup;
    var score = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(R.layout.activity_main)
        questionOneGroup = findViewById(R.id.question_one_radio) as RadioGroup;
    }

    fun onQuestionOneClicked(view: View) {
        println("Inside onQuestionOneClicked");
        if (view is RadioButton) {
            when (view.getId()) {
                R.id.radio_btn_a -> {
                    if (view.isChecked) {
                        score = score + 50;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    fun submitBtnHandler(view: View) {
        println("Submit Button Clicked!");

        val date = SimpleDateFormat("dd/M/yyyy hh:mm:ss");

        val today = date.format(Date());

        val alertMessage = if (score > 0) """
     Congratulations! You submitted on $today, You achieved 50%
     """.trimIndent() else "You failed the quiz! Please, try again.";

        val alertDialog: AlertDialog = this.let {
            val builder = AlertDialog.Builder(it);
            builder.apply {
                setPositiveButton("ok")
                { dialog, _ ->
                    score = 0
                    questionOneGroup.clearCheck()
                    dialog.dismiss()
                }
            }
            builder.setMessage(alertMessage)
            builder.create();
        }

        alertDialog.show();
    }

    fun resetBtnHandler(view: View){
        questionOneGroup.clearCheck();
        println("In Reset Button Handler")
    }
}