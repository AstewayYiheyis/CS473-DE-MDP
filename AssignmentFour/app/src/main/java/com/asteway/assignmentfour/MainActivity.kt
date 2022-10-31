package com.asteway.assignmentfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import com.asteway.assignmentfour.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater);

        addDataToTable("Android 9.0", "Pie");
        addDataToTable("Android 3.0", "Oreo");
    }

    private fun addDataToTable(version: String, codeName: String) {
        val versionColumn = TextView(this);
        versionColumn.text = version;

        val codeNameColumn = TextView(this);
        codeNameColumn.text = version;

        val tableRow = TableRow(this);

        tableRow.addView(versionColumn, 0);
        tableRow.addView(codeNameColumn, 1);

        binding.androidTable.addView(tableRow);
    }
}