package com.eni.mod8tplancerde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel() {
    var valeurDe = MutableLiveData((1..6).random())
    fun lancerDe(){
        valeurDe.value = (1..6).random()
    }
}