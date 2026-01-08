package com.juanma.impostores.firstsapp

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.juanma.impostores.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //reglas del juego
        val NumJugadores = findViewById<EditText>(R.id.EtJugadores)

        //accion del boton jugar
        val BtnJugar = findViewById<AppCompatButton>(R.id.BtnJugar)
        BtnJugar.setOnClickListener {
            Log.i("Msj","boton presionado")
            Log.i("Msj",NumJugadores.text.toString())




        }

        //al arrancar la pantalla
    }
}