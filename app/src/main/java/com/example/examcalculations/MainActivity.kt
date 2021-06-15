package com.example.examcalculations

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    lateinit var butLor: Button
    lateinit var butPsi: Button
    lateinit var butprac: Button


    @RequiresApi(Build.VERSION_CODES.O)
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
        butPsi = findViewById(R.id.toPsi)
        butPsi.setOnClickListener {
            val currentTime = LocalDateTime.now()
            println(currentTime.format(DateTimeFormatter.ISO_TIME))
            Toast.makeText(this , "${currentTime.format(DateTimeFormatter.ISO_TIME)}" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this,spi_factor::class.java)
            startActivity(intent)
        }

    }
}