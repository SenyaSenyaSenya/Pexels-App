package com.example.testtaskpexelsappbykseniamakaretskaya.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.testtaskpexelsappbykseniamakaretskaya.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000 // 3 секунды

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logoImageView = findViewById<ImageView>(R.id.logoImageView)
        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
        logoImageView.startAnimation(scaleAnimation)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}