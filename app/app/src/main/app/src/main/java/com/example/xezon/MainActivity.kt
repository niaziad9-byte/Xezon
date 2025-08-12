package com.example.xezon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<TextInputEditText>(R.id.input1)
        val input2 = findViewById<TextInputEditText>(R.id.input2)
        val input3 = findViewById<TextInputEditText>(R.id.input3)
        val resultText = findViewById<TextView>(R.id.resultText)
        val calcButton = findViewById<Button>(R.id.calcButton)

        calcButton.setOnClickListener {
            try {
                val step1 = input1.text.toString().toDouble()
                val step2 = input2.text.toString().toDouble()
                val step3 = input3.text.toString().toDouble()

                val result = (step1 * step2) + step3
                resultText.text = "Result: $result"
            } catch (e: Exception) {
                resultText.text = "Invalid input!"
            }
        }
    }
}
