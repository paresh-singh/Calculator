package com.example.examcalculations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calc_for_Lorentz : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var textShown: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lorentz_main)
        editText = findViewById<EditText>(R.id.velo) as EditText
        button = findViewById(R.id.button)
        textShown = findViewById(R.id.result)
        button.setOnClickListener {
            val velocity = editText.text.toString().toLong()
            if (velocity > 10000000000){
                Toast.makeText(this, "velocity cant be greater than speed of light", Toast.LENGTH_LONG).show()
            }else if (velocity < 0){
                Toast.makeText(this, "velocity cant be negative", Toast.LENGTH_SHORT).show()
            }else if (velocity in 1..10000000000) {
                val ans = formula().lorentzFactor(velocity)
                textShown.text = ans
            }else {
                Toast.makeText(this, "please enter a value", Toast.LENGTH_SHORT).show()

            }

        }
    }
}