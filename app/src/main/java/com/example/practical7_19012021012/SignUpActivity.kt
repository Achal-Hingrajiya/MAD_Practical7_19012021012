package com.example.practical7_19012021012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import src.LoginInfo

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var signUpBtn = findViewById<Button>(R.id.btn_sign_up)

        signUpBtn.setOnClickListener {

            val fullName : String = findViewById<TextInputLayout>(R.id.ftf_full_name).editText.toString()
            val phoneNumber : String = findViewById<TextInputLayout>(R.id.ftf_phone).editText.toString()
            val city : String = findViewById<TextInputLayout>(R.id.ftf_city).editText.toString()
            val email : String = findViewById<TextInputLayout>(R.id.ftf_email).editText.toString()
            val password : String = findViewById<TextInputLayout>(R.id.ftf_password).editText.toString()
            val confPassword : String = findViewById<TextInputLayout>(R.id.ftf_conf_password).editText.toString()
            if (password == confPassword){
                LoginInfo.signUp(fullName, phoneNumber, city, email, password)
                Toast.makeText(this, "Signed Up Successfully!", Toast.LENGTH_SHORT).show()

                Intent(this, LoginActivity :: class.java).apply {
                    startActivity(this)
                }
            }else{
                Toast.makeText(this, "Passwords doesn't match!", Toast.LENGTH_SHORT).show()

            }

        }
    }
}