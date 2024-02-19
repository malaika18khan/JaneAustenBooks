package com.malaika18khan.janeaustenbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            val mainIntent = Intent(this@Splash, MainActivity::class.java)

            startActivity(mainIntent)
        }, 2000)

    }
}