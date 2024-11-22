package com.example.ecomind_login.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.ecomind_login.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

private fun Any.onCreate(savedInstanceState: Bundle?) {
    TODO("Not yet implemented")
}

class AnswerActivity {
    fun onCreate(savedInstanceState: Bundle?) {
        onCreate(savedInstanceState)
        setContentView(R.layout.telaanswer)

        setupButtonWithFinish(R.id.button2)

    }

    private fun setContentView(telaanswer: Int) {
        TODO("Not yet implemented")
    }

    val database = Firebase.database
    val respostasRef = database.getReference("respostas")

        val editText = findViewById<EditText>(R.id.editTextText)

    private fun <T> findViewById(editTextText: Int): T {
        TODO("Not yet implemented")
    }

    val resposta = editText.text.toString()

        respostasRef.child("resposta1").setValue(resposta)

    val intent = Intent(this, ListaActivity::class.java)
    intent.putStringArrayListExtra("respostas", ArrayList(respostas))
    startActivity(intent)

    private fun setupButtonWithFinish(buttonId: Int) {
        val button = findViewById<Button>(buttonId)
        button.setOnClickListener {
            finish()
        }
    }

    private fun finish() {
        TODO("Not yet implemented")
    }
}