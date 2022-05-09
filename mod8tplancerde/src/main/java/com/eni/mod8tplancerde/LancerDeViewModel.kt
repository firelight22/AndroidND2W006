package com.eni.mod8tplancerde

import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel() {
    var valeurDe = 0
    fun lancerDe(){
        valeurDe = (1..6).random()
    }
}