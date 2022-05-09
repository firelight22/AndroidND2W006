package com.eni.mod8tplancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod8tplancerde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm : LancerDeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[LancerDeViewModel::class.java]


        amb.textViewDe.text = vm.valeurDe.toString()
        amb.floatingActionButton.setOnClickListener {
            //lancer le dé
            vm.lancerDe()
            //Afficher la valeur
            amb.textViewDe.text = vm.valeurDe.toString()
        }

    }
}