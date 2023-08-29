package com.matesdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miNombre : EditText =  findViewById(R.id.editTextTextNombre)
        val boton : Button = findViewById(R.id.buttonAgregar)


        boton.setOnClickListener {
            val texto : String = miNombre.text.toString()

            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }
    }


}