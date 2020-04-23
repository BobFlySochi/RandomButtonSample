package com.example.randombuttonsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomButton.setOnClickListener {
            val sRange = editStart.text.toString().toInt()
            val eRange = editEnd.text.toString().toInt()
            val randomDigit=(sRange .. eRange).random()
            txtForRandom.text="Результат: $randomDigit"
        }
    }
}
