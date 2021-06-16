package com.example.examcalculations

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.logging.Handler
import kotlin.concurrent.timer

class spi_factor : AppCompatActivity() {

    lateinit var timeHour: TextView
    lateinit var timeMinute: TextView
    lateinit var timeSecond: TextView
    lateinit var spiFactor: TextView
    lateinit var hour: TextView
    lateinit var min: TextView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spi_factor)

        timeHour   = findViewById(R.id.hour)
        timeMinute = findViewById(R.id.mins)
        timeSecond = findViewById(R.id.secs)
        spiFactor  = findViewById(R.id.spi)
        hour       = findViewById(R.id.hourFactorial)
        min        = findViewById(R.id.minCube)

        val timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                updateTimer()
            }
        }, 0, 1000)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun updateTimer() {
        val list = formula().spiFac()
        runOnUiThread {
            timeHour.text   =  list[0]
            timeMinute.text =  list[1]
            timeSecond.text =  list[2]
            spiFactor.text  =  "Spi   = " + list[3]
            hour.text = list[4]
            min.text = list[5]
        }
    }
}