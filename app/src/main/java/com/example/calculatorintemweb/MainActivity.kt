package com.example.calculatorintemweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc:Button ?= null
    var ButtonIntent:Button ?= null
    var ButtonWeb:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.Btn_Calc)
        ButtonCalc!!.setOnClickListener {
            val intent= Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb=findViewById(R.id.Btn_Web)
        ButtonWeb!!.setOnClickListener {
            val web= Intent(this,WebActivity::class.java )
            startActivity(web)
        }
        ButtonIntent=findViewById(R.id.Btn_Intent)
        ButtonIntent!!.setOnClickListener {
            val calc= Intent(this,IntentActivity::class.java)
            startActivity(calc)
        }
    }
}