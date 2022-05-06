package com.eni.mod6intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Lors du clic sur le bouton
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            //J'effectue un Intent vers DestinationActivity
            val intent = Intent(this,DestinationActivity::class.java)
            intent.putExtra("histoire",321)
            startActivity(intent)

        }
    }
}