package com.eni.mod9magasinroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ArticleViewModel(val articleDao:ArticleDao,
    application: Application)
    : AndroidViewModel(application) {
    val article = MutableLiveData<Article>()

    fun pickRandomArticle(){
        //On ne peut pas faire d'opérations sur la BDD
        // depuis l'UI
        article.value = articleDao.getById(1)
    }
}