package com.example.examcalculations

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.math.pow
import kotlin.math.sqrt

class formula {
    
    fun lorentzFactor(v:Long) : String{

        val c = 3 * 10.0.pow(8.0)
        val l = 1 / (sqrt(1 + ((v*v)/(c*c)))).toFloat()
        println(l)
        return l.toString()
    }
    fun checkAns(v:Long ) : String{

        val c = 3 * 10.0.pow(8.0)
        val l = 1 / (sqrt(1 + ((v*v)/(c*c))))
        println(l)
        // only first few numbers of l should be equal to L

        return l.toString()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun spiFac() : List<String> {
        val currentTime = LocalDateTime.now()
        val time = currentTime.format(DateTimeFormatter.ISO_TIME).split(":")
        val Th = time[0]
        val Tm = time[1].toInt()
        val tHour = if ( Th.toInt() > 12){
                          Th.toInt() -12
                    }else{
                          Th.toInt()
                     }

        val TimeOfSecs = time[2].split(".")
        val Ts = TimeOfSecs[0].toInt()

        var factorial: Long = 1
        for (i in 1..tHour) {
            factorial *= i.toLong()
        }
        val min = Tm.toDouble().pow(3.0)
        val spi = (factorial/(min + Ts.toDouble())).toFloat()
        return arrayListOf( tHour.toString() , Tm.toString() , Ts.toString() , spi.toString() , factorial.toString() , min.toString())
    }

}

