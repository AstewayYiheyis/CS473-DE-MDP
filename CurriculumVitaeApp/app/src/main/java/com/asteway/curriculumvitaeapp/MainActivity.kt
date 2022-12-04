package com.asteway.curriculumvitaeapp

import android.content.Intent;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity : AppCompatActivity() {
    lateinit var aboutMeButton: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("CV");
        aboutMeButton = findViewById(R.id.HeaderTabLayout) as TabLayout;
        aboutMeButton.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when(tab.position){
                    0 -> {
                        openHome();
                    }
                    1 -> {
                        openAboutMe();
                    }
                    2 -> {
                        openWork();
                    }
                    3 -> {
                        openContact();
                    }
                }


            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    fun openHome(){
        val intent = Intent(applicationContext, MainActivity::class.java);
        startActivity(intent)
    }

    private fun openAboutMe() {
        val intent = Intent(applicationContext, AboutMe::class.java);
        startActivity(intent)
    }

    private fun openWork() {
        val intent = Intent(applicationContext, Work::class.java);
        startActivity(intent)
    }

    private fun openContact() {
        val intent = Intent(applicationContext, Contact::class.java);
        startActivity(intent)
    }
}