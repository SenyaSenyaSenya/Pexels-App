package com.example.testtaskpexelsappbykseniamakaretskaya.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.testtaskpexelsappbykseniamakaretskaya.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000 // 3 секунды

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}