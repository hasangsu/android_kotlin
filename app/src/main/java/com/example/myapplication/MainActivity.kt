package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         * 상수로 객체를 참조
         */
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // 화면상에 토스트 메세지 보여주기
        // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        // 텍스트뷰의 텍스트 변경하기
        var resultText: TextView = findViewById(R.id.result_text)
        // resultText.text = "Dice Rolled!"

        var randomInt: Int = (1..45).random()
        resultText.text = randomInt.toString()
    }
}