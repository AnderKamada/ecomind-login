package com.example.ecomind_login.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ecomind_login.R

private fun Any.getStringArrayListExtra(s: String) {
    TODO("Not yet implemented")
}

private fun Any?.findViewById(textViewResposta: Int): TextView {
    TODO("Not yet implemented")
}

class ListaActivity(intent: Any) {val respostas = intent.getStringArrayListExtra("respostas")

    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

    private fun <T> findViewById(recyclerView: Int): T {
        TODO("Not yet implemented")
    }
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = RespostasAdapter(respostas)

    // Classe do adapter
    class RespostasAdapter(private val respostas: List<String>) : RecyclerView.Adapter<RespostasAdapter.ViewHolder<Any?>>() {

        class ViewHolder<View : Any>(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textView: TextView = itemView.findViewById(R.id.textViewResposta)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<Any?> {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.telalista, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder<Any?>, position: Int) {
            holder.textView.text = respostas[position]
        }

        override fun getItemCount(): Int {
            return respostas.size
        }
    }
}