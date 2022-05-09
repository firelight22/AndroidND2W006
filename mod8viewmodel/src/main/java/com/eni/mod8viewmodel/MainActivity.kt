package com.eni.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod8viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm : CompteurViewModel
    //var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //On récupère l'instance du CompteurViewModel
        vm = ViewModelProvider(this)[CompteurViewModel::class.java]
        vm.compteur.observe(this,
            {amb.textViewCompteur.text = it?.toString() })

        amb.textViewCompteur.text = vm.compteur.toString()

        amb.floatingActionButton.setOnClickListener {
            vm.plusUn()
        }
        amb.floatingActionButtonMoins.setOnClickListener {
            vm.moinsUn()
        }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("compteur",compteur)
    //}
//
    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    compteur = savedInstanceState.getInt("compteur")
    //    amb.textViewCompteur.text = compteur.toString()
//
    //}

}