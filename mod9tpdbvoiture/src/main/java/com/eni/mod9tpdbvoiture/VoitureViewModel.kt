package com.eni.mod9tpdbvoiture

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VoitureViewModel(val dao:VoitureDao,
                       application: Application
) : AndroidViewModel(application){
    val voiture = MutableLiveData<Voiture>()

    fun pickRandomVoiture(){
        viewModelScope.launch {
            voiture.value = dao.getById(1)
        }
    }
}