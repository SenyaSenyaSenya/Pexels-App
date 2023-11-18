package com.example.testtaskpexelsappbykseniamakaretskaya.view

import EditTextUtils
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.testtaskpexelsappbykseniamakaretskaya.R

class HomeScreen : AppCompatActivity() {

    private lateinit var searchEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        searchEditText = findViewById(R.id.editTextTextPersonName4)

        EditTextUtils.addClearButton(searchEditText)
    }
}