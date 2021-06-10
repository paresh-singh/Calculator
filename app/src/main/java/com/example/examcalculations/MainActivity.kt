package com.example.examcalculations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var butLor: Button
    lateinit var butPsi: Button
    lateinit var butprac: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butLor = findViewById(R.id.toLor)
        butLor.setOnClickListener {
            val intent = Intent(this,Calc_for_Lorentz::class.java)
            startActivity(intent)
        }
        butprac = findViewById(R.id.prac)
        butprac.setOnClickListener {
            val intent = Intent(this,Practice_::class.java)
            startActivity(intent)
        }
    }
}