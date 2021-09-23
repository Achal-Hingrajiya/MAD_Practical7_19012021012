package com.example.practical7_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var signUpBtn = findViewById<Button>(R.id.btn_sign_up)

        signUpBtn.setOnClickListener {
            Intent(this, LoginActivity :: class.java).apply {
                startActivity(this)
            }
        }
    }
}