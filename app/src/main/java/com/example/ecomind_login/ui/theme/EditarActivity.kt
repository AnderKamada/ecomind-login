package com.example.ecomind_login.ui.theme

import android.widget.EditText

object adapterPosition {

}

class TelaEditar {

}

class Intent(editarActivity: EditarActivity, java: Class<TelaEditar>) {

}

class EditarActivity {
    var position = adapterPosition // Obter a posição da resposta na lista
    val intent = Intent(this, TelaEditar::class.java)
    intent.putExtra("position", position)
    startActivity(intent)


    var position= intent.getIntExtra("position", -1)
    if (position != -1) {
        val resposta = respostas[position]
        val editText = findViewById<EditText>(R.id.editText)
        editText.setText(resposta)

        val novaResposta = editText.text.toString()
        val respostas = null
        respostas[position] = novaResposta
        finish()
    }
}