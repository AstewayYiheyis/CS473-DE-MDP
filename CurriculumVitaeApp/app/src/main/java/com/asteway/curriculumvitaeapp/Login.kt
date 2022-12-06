package com.asteway.curriculumvitaeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
    lateinit var username: EditText;
    lateinit var password: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)

        supportActionBar?.setTitle("CV");
    }

    fun login(view: View)
    {
        username = findViewById<View>(R.id.userName) as EditText
        password = findViewById<View>(R.id.password) as EditText
        if (username.getText().toString().equals("asteway") && password.getText().toString()
                .equals("123")
        ) {
            //correcct password
            val intent = Intent(applicationContext, Home::class.java);
            startActivity(intent)
        } else {
            //wrong password
            var loginFailureLabel =
                findViewById<View>(R.id.loginfailure) as TextView

            loginFailureLabel.setText("Wrong username and / or password!");
        }
    }
}