package com.eni.mod9magasinroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ArticleViewModel(val articleDao:ArticleDao,
    application: Application)
    : AndroidViewModel(application) {
    val article = MutableLiveData<Article>()

    fun pickRandomArticle(){
        //On ne peut pas faire d'opérations sur la BDD
        // depuis l'UI
        viewModelScope.launch {
            article.value = articleDao.getById(1)
        }
    }
}