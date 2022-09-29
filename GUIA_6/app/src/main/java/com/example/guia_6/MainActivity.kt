package com.example.guia_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejemplo_frame_layout)
        setContentView(R.layout.ejemplo_linear_layout)
        setContentView(R.layout.ejemplo_relative_layout);
        setContentView(R.layout.ejemplo_table_layout);
        setContentView(R.layout.ejemplo_grid_layout);

    }
}