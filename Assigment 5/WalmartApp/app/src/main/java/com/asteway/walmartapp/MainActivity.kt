package com.asteway.walmartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asteway.walmartapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;

    val users = Arrays.asList(
        User("Asteway", "Yiheyis", "ay@gmail.com", "astewayyiheyis"),
        User("John", "Doe", "johndoe@gmail.com", "johndoe"),
        User("Jane", "Doe", "janedoe@gmail.com", "janedoe")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater);
    }
}