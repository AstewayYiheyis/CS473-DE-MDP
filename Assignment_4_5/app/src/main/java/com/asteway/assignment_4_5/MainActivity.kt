package com.asteway.assignment_4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var users = Arrays.asList(
        *arrayOf(
            User("Abebe", "Kebede", "Abe1234", "1234"),
            User("Tedy", "Mikael", "A234", "56789"),
            User("Addisu", "Yenet", "Adi2389", "8901dsfv"),
            User("Abeba", "Yenet", "23hvk", "2323xdsf"),
            User("John", "Doe", "Abw23d4", "112cxdd")
        )
    );
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signInBtn = findViewById(R.id.btn_login) as Button;

        var userName = findViewById(R.id.email) as EditText;
        var password = findViewById(R.id.password) as EditText;

        signInBtn.setOnClickListener{
           for(user in users){
               if(user.userName.equals(userName) && user.password.equals(password)){
                   // to be continued
               }
           }
        }
    }
}