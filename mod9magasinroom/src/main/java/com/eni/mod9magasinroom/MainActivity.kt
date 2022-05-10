package com.eni.mod9magasinroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        thread {
            val dao = MagasinDb.getInstance(this).articleDao()
            dao.insert(Article(
                nom = "Projecteur",marque = "Dell",quantite = 1,prix = 1500f))
            dao.insert(Article(
                nom = "Ecran PC",marque = "Dell",quantite = 11,prix = 250f))
        }
    }
}