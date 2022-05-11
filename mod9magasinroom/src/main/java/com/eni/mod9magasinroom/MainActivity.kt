package com.eni.mod9magasinroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod9magasinroom.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    lateinit var vm : ArticleViewModel
    lateinit var amb:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this,ViewModelFactory(application)
        ).get(ArticleViewModel::class.java)

        vm.article.observe(this,{amb.article = it})

        //On récupère un article Aléatoire
        vm.pickRandomArticle()


        //thread {
        //    val dao = MagasinDb.getInstance(this).articleDao()
        //    dao.insert(Article(
        //        nom = "Projecteur",marque = "Dell",quantite = 1,prix = 1500f))
        //    dao.insert(Article(
        //        nom = "Ecran PC",marque = "Dell",quantite = 11,prix = 250f))
        //}
    }
}