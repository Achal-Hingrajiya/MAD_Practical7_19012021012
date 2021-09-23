package com.example.practical7_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var signUpBtn = findViewById<Button>(R.id.tbtn_signup)

        signUpBtn.setOnClickListener {
            Intent(this, SignUpActivity :: class.java).apply {
                startActivity(this)
            }
        }
    }
}