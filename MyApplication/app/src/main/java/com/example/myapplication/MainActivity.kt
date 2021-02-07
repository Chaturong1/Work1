package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.textView)
        var textView0: TextView = findViewById(R.id.textView0)
        var Num1: EditText = findViewById(R.id.Num1)
        var Num2: EditText = findViewById(R.id.Num2)

        var Plus: Button = findViewById(R.id.Plus1)
        var Minus: Button = findViewById(R.id.Minus1)
        var multiply: Button = findViewById(R.id.multiply1)
        var Divider: Button = findViewById(R.id.Divider1)
        var Modulo: Button = findViewById(R.id.Modulo1)
        var Clear: Button = findViewById(R.id.Clear1)
        //Plus
        Plus.setOnClickListener() {
            var num1 = Num1.text.toString()
            var num2 = Num2.text.toString()
            var total = 0
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Num1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toInt() + num2.toString().toInt()
                textView.setText("+")
                textView0.setText(total.toString())

            }
        }

        //Minus
        Minus.setOnClickListener() {
            var num1 = Num1.text.toString()
            var num2 = Num2.text.toString()
            var total = 0
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Num1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toInt() - num2.toString().toInt()
                textView.setText("-")
                textView0.setText(total.toString())

            }
        }

        //multiply
        multiply.setOnClickListener() {
            var num1 = Num1.text.toString()
            var num2 = Num2.text.toString()
            var total = 0.000
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Num1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toDouble() * num2.toString().toDouble()
                textView.setText("*")
                textView0.setText(total.toString())

            }
        }

        //Divider
        Divider.setOnClickListener() {
            var num1 = Num1.text.toString()
            var num2 = Num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Num1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            } else {
                total = num1.toString().toDouble() / num2.toString().toDouble()
                textView.setText("/")
                textView0.setText(total.toString())

            }
        }

        //Modulo
        Modulo.setOnClickListener() {
            var num1 = Num1.text.toString()
            var num2 = Num2.text.toString()
            var total = 0.000
            if (num1 == "" || num2 == "") {
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ทั้ง Num1 และ Num2", Toast.LENGTH_LONG)
                toast.show()
            } else if (num2 == "0") {
                val toast1 =
                    Toast.makeText(applicationContext, "ห้ามกรอกค่า Num2 = 0 ", Toast.LENGTH_LONG)
                toast1.show()
            } else {
                total = num1.toString().toDouble() % num2.toString().toDouble()
                textView.setText("%")
                textView0.setText(total.toString())

            }
        }
    // Clear
        Clear.setOnClickListener() {
            Num1.setText("")
            Num2.setText("")
            textView.setText("")
            textView0.setText("")
        }
    }
}