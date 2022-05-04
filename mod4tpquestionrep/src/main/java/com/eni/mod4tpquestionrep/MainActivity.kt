package com.eni.mod4tpquestionrep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.eni.mod4tpquestionrep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    var index = -1
    var listQr = listOf(
        QuestionReponse("La Lune est est une planète", false),
        QuestionReponse("Apple fabrique t-il des bouteilles d'eaux", false),
        QuestionReponse("SoWeSign fonctionne super bien", false),
        QuestionReponse("Cholet est une ville chiante", true),
        QuestionReponse("Chocolatine est-il un mot", true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //initialisation du score à 0 dans le DB
        amb.score = 0
        //je pose la question suivante
        askQuestion()
        //Je traite les réponses vraies ou fausses
        amb.buttonVrai.setOnClickListener { checkAnswer(true) }
        amb.buttonFaux.setOnClickListener { checkAnswer(false) }
    }

    fun askQuestion(): Unit {
        //j'incrémente pour avoir accès à la question suivante
        index++
        //Si il y a assez de questions dans ma liste listQr
        if(index <= listQr.lastIndex )
            amb.qr = listQr[index]
        else{
            //Si non je bloque les entrées utilisateurs
            amb.buttonFaux.isEnabled = false
            amb.buttonVrai.isEnabled = false
        }
    }

    fun checkAnswer(userAnswer : Boolean){
        //Je vérifie que l'entrée utilisateur est correcte
        if(amb.qr?.reponse == userAnswer){
            //J'incrémente le score. Si score null alors je renvoie 0
            amb.score = amb.score?.let{ it + 1}
        }
        //Je pose la question suivante
        askQuestion()
    }
}