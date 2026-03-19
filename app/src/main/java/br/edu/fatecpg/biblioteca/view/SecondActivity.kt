package br.edu.fatecpg.biblioteca.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.biblioteca.R

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtTitulo = findViewById<TextView>(R.id.txv_título)
        val txtAutor = findViewById<TextView>(R.id.txv_autor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"
    }
}