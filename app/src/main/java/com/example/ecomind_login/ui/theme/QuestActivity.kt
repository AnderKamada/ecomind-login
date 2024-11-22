package com.example.ecomind_login.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.ecomind_login.R

class QuestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telaquest)

        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button4.setOnClickListener {
            val intent = Intent(this, button4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this, button5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this, button6::class.java)
            startActivity(intent)
        }
    }
}