package com.example.lab_g2

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var nEditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nEditText = findViewById(R.id.inputEditText)
        resultTextView = findViewById(R.id.outputTextView)

        findViewById<Button>(R.id.ResultButton).setOnClickListener {
            val n = nEditText.text.toString().toIntOrNull() ?: return@setOnClickListener
            val result = calculateFactorialSum(n)
            resultTextView.text = result.toString()
        }
    }
    fun factorial (n: Int): Int {
        if (n == 0) return 1
        else return n * factorial(n - 1)
    }
    private fun calculateFactorialSum(n: Int): Double {
        var sum = 0.0
        for (i in 1..n) {
            sum += 1.0 / factorial(i)
        }
        return sum
    }
}
