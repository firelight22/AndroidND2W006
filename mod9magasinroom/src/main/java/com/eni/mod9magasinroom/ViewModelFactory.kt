package com.eni.mod9magasinroom

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory(val application: Application):
ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ArticleViewModel::class.java)){
            return ArticleViewModel(
                MagasinDb.getInstance(application).articleDao(),
                application
            ) as T
        }
        throw IllegalArgumentException("ViewModel non connu")
    }
}