package com.eni.mod9tpdbvoiture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod9tpdbvoiture.databinding.ActivityMainBinding
import kotlin.concurrent.thread

fun String.toCamelC():String
 = this.substring(1).lowercase()

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm : VoitureViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this,ViewModelFactory(application))
            .get(VoitureViewModel::class.java)
        //J'affiche ma voiture avec le DataBinding à chaque fois qu'une
        // nouvelle est affectée à la variable vm.voiture
        vm.voiture.observe(this,{amb.voiture = it})

        vm.pickRandomVoiture()
        //thread {
        //    VoitureDb.getInstance(this).voitureDao().insert(
        //        Voiture(
        //            0,
        //            "tesla","Model S",Categorie.BERLINE,"EL",0,
        //            90000
        //        )
        //    )
        //    VoitureDb.getInstance(this).voitureDao().insert(
        //        Voiture(
        //            0,
        //            "BMW","Série 3",Categorie.BERLINE,"ES",0,
        //            90000
        //        )
        //    )
        //}
    }
}