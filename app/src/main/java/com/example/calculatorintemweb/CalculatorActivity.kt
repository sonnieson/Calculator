package com.example.calculatorintemweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var buttonadd: Button
    lateinit var buttonsub: Button
    lateinit var buttondiv: Button
    lateinit var buttonmult: Button
    lateinit var firstno: EditText
    lateinit var secondno: EditText
    lateinit var txt_answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        buttonadd = findViewById(R.id.Btn_Add)
        buttonsub = findViewById(R.id.Btn_Subtract)
        buttondiv = findViewById(R.id.Btn_Divide)
        buttonmult = findViewById(R.id.Btn_Multiply)
        firstno = findViewById(R.id.Edit_Fnum)
        secondno = findViewById(R.id.Edit_Snum)
        txt_answer = findViewById(R.id.Txt_Answer)
        buttonadd!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()) {
            } else {
                var answer = firstno.toDouble() + secondno.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        buttonsub!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()) {
            } else {
                var answer = firstno.toDouble() - secondno.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        buttondiv!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()) {
            } else {
                var answer = firstno.toDouble() / secondno.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        buttonmult!!.setOnClickListener {
            var firstno = firstno.text.toString()
            var secondno = secondno.text.toString()
            if (firstno.isEmpty() && secondno.isEmpty() || firstno.isEmpty() || secondno.isEmpty()) {
            } else {
                var answer = firstno.toDouble() * secondno.toDouble()
                txt_answer.text = answer.toString()
            }
        }
    }
}


























































































































































































