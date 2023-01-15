package com.asteway.curriculumvitaeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class ResultAnalysisPage : AppCompatActivity(){
    lateinit var headerLayOut: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_anlysis_page)
    }
}