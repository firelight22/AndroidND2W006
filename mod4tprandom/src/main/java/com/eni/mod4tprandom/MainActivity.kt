package com.eni.mod4tprandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //récupération de mes vues
        val button = findViewById<Button>(R.id.button)
        val editTextMin = findViewById<EditText>(R.id.editTextMin)
        val editTextMax = findViewById<EditText>(R.id.editTextMax)
        val textViewRes = findViewById<TextView>(R.id.textViewRes)
        //Au clic je récupère les valeurs et j'affiche le random
        button.setOnClickListener {
            it.isEnabled = false
            val minInt = editTextMin.text.toString().toInt()
            val maxInt = editTextMax.text.toString().toInt()
            textViewRes.text = (minInt..maxInt).random().toString()
        }
    }
}