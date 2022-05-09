package com.eni.mod8viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var compteur = MutableLiveData(0)

    fun plusUn() {
      //compteur = compteur + 1
        compteur.value = compteur.value?.plus(1)
    }
    fun moinsUn(){
        compteur.value = compteur.value?.minus(1)
    }
}
