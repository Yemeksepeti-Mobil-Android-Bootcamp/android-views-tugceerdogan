package com.example.advancedviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var txtLogin : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLogin = findViewById<TextView>(R.id.text_login)


            txtLogin.setOnClickListener {
                startActivity(Intent(this@MainActivity, SignInActivity::class.java))

            }
    }
}