package com.example.womentechstersapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgetPasswordButton: Button = findViewById(R.id.forgottenPassword)

        forgetPasswordButton.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)

            startActivity(intent)
        }

        val createAccount: Button = findViewById(R.id.createNewAccount)

        createAccount.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)

            startActivity(intent)
        }

        val loginButton: Button = findViewById(R.id.loginButton)
        val userName: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)

        loginButton.setOnClickListener {
            val userNameEntered: String = userName.text.toString()
            val passwordEntered: String = password.text.toString()
            var message = ""

            if (userNameEntered.isEmpty() || passwordEntered.isEmpty()){

                message = "Input all your details"
            } else {
                val intent = Intent(this, HomeActivity::class.java)
            }
            Snackbar.make(this, findViewById(R.id.layout), message, Snackbar.LENGTH_LONG).show()
            }

        }
    }
}