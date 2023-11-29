package com.example.womentechstersapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var joinButton: Button = this.findViewById(R.id.joinNowButton)

        joinButton.setOnClickListener{
            val intent = Intent(this.LoginActivity::class.java)
            this.startActivity(intent)
        }

    }
}