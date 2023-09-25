package com.example.sharepreferece

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name= findViewById<EditText>(R.id.name)
        val email= findViewById<EditText>(R.id.email)
        val save = findViewById<Button>(R.id.save)
        val show = findViewById<Button>(R.id.show)

        val localStorage = getSharedPreferences("user",Context.MODE_PRIVATE)

        save.setOnClickListener {

            val editPref = localStorage.edit()

            editPref.putString("userName", ""+ name.text.toString())
            editPref.putString("userEmail",""+ email.text.toString()).apply()
        }
        show.setOnClickListener {
//            val getName = localStorage.getString("UserName","Name Not Found")
//            val getEmail = localStorage.getString("UserEmail","Email Not Found")

            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}