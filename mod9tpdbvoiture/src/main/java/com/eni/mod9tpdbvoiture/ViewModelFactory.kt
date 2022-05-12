package com.eni.mod9tpdbvoiture

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory(val app:Application) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(VoitureViewModel::class.java)){
            return VoitureViewModel(
                VoitureDb.getInstance(app).voitureDao(),
                app
            ) as T
        }else
            throw IllegalArgumentException("ViewModel Non reconnu")
    }
}