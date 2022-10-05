package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val loginbtn = findViewById<Button>(R.id.loginbtn)

        loginbtn.setOnClickListener {
            val message = "email: ${email.text}, password: ${password.text}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}