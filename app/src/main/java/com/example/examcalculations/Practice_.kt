package com.example.examcalculations

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Vibrator
import android.text.Layout
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Practice_ : AppCompatActivity() {

    lateinit var submit: Button
    lateinit var velocity: EditText
    lateinit var lorFac: EditText
    lateinit var result: TextView
    lateinit var vib : Vibrator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice_)
        velocity = findViewById(R.id.velocity)
        lorFac = findViewById(R.id.lorFac)
        result = findViewById(R.id.answer)
        vib = getSystemService(VIBRATOR_SERVICE) as Vibrator
        val lay: ConstraintLayout = findViewById(R.id.practicelayout)
        submit = findViewById(R.id.button2)


        submit.setOnClickListener {
            var answer = formula().checkAns(velocity.text.toString().toLong()  )
            result.text = answer
            if (answer == lorFac.text.toString()){
                lay.setBackgroundColor(Color.parseColor("#00ff00"))
                val timer = object: CountDownTimer(2000, 1000) {
                    override fun onTick(millisUntilFinished: Long) {}
                    override fun onFinish() {
                        lay.setBackgroundResource(R.drawable.bg3)
                    }
                }

            }else{
                lay.setBackgroundColor(Color.parseColor("#ff0000"))

                @Suppress("DEPRECATION")
                vib.vibrate(1000)
            }

        }
    }
}