package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernametext: EditText = findViewById(R.id.usertext)
        val passwordtext: EditText = findViewById(R.id.passtext)
        val validUsername: String = "areeba"

        val validpassword: String = "123456"

        val textdisplaybuttonview: Button = findViewById(R.id.textDisplayBtn)

        textdisplaybuttonview.setOnClickListener {

            val enteredUsername = usernametext.text.toString()
            val enteredPassword = passwordtext.text.toString()

            if (enteredUsername == validUsername && enteredPassword == validpassword ) {
                Toast.makeText(applicationContext, "Login successful", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext, "Login unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
