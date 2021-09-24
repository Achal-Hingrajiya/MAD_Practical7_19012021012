package com.example.practical7_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var logoutBtn = findViewById<Button>(R.id.tbtn_logout)

        logoutBtn.setOnClickListener {
            Intent(this, LoginActivity :: class.java).apply {
                startActivity(this)
            }
        }
    }
}