package com.eni.mod8tpde2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel(){
    var valeurDe = MutableLiveData(0)

    fun randomDice(max:Int = 6){
        valeurDe.value = (1..max).random()
    }
}