package com.example.guia_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.operacionesapp)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val et1 = findViewById<EditText>(R.id.et1)
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val suma = nro1 + nro2
            tv1.text = "Resultado: ${suma.toString()}"
        }
    }
}