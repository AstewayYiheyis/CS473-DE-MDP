package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var selectedFood: TextView;
    lateinit var addedFood: EditText;
    val foodList = listOf("Hamburger", "Pizza",
        "Mexican", "American", "Chinese");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectedFood = findViewById(R.id.decide_button)
        addedFood = findViewById(R.id.add_food_btn);
    }

    fun addFood(v: View){
        val foodToAdd = addedFood.text;

        if(foodToAdd.isNullOrEmpty()){
            foodList.plus(foodToAdd);
            selectedFood.text = foodToAdd;
        }
    }

    fun decideFood(v: View){
        val i = Random.nextInt(foodList.size);
        selectedFood.text = foodList[i];
    }
}