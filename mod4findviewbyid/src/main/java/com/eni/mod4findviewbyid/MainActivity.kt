package com.eni.mod4findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Récupération de mes vues
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button)
        //Affectation des attributs
        textView.text = "Hello"
        editText.setText("Comment allez-vous?")
        ratingBar.rating = 3.0f
        button.text = "kdsljgklgkldfhgd"
        button.setOnClickListener {
            Toast.makeText(this, "Miam Miam!", Toast.LENGTH_SHORT).show()
        }

    }
}