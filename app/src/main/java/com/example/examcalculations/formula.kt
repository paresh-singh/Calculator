package com.example.examcalculations

import android.annotation.SuppressLint
import kotlin.math.pow
import kotlin.math.sqrt

class formula {
    
    fun lorentzFactor(v:Long) : String{

        val c = 3 * 10.0.pow(8.0)
        val l = 1 / (sqrt(1 + ((v*v)/(c*c)))).toFloat()
        println(l)
        return l.toString()
    }
    fun checkAns(v:Long , L:Double) : String{

        val c = 3 * 10.0.pow(8.0)
        val l = 1 / (sqrt(1 + ((v*v)/(c*c))))
        println(l)
        // only first few numbers of l should be equal to L
        if(l == L){
            // green background

        }else{
            // red background
        }
        return l.toString()
    }
}