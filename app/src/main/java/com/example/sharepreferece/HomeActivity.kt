package com.example.sharepreferece

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val localStorage = getSharedPreferences("user",Context.MODE_PRIVATE)

        val getName = localStorage.getString("userName","name Not Found")
        val getEmail = localStorage.getString("userEmail","email Not Found")


        val name1= findViewById<TextView>(R.id.name1)
        val email1 = findViewById<TextView>(R.id.email1)

         name1.text = getName.toString()
        email1.text = getEmail.toString()

        Toast.makeText(this, "$getName", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "$getEmail", Toast.LENGTH_SHORT).show()

    }
}