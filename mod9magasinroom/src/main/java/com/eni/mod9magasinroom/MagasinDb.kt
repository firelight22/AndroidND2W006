package com.eni.mod9magasinroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = arrayOf(Article::class),version = 1,exportSchema = false)
abstract class MagasinDb : RoomDatabase() {
    //Liste de nos Dao
    abstract fun articleDao(): ArticleDao

    companion object{
        @Volatile
        private var INSTANCE: MagasinDb? = null
        //Permet de récupérer une instance de la BDD
        fun getInstance(ctx: Context):MagasinDb{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    ctx,
                    MagasinDb::class.java,
                    "magasin.db"
                ).fallbackToDestructiveMigration()
                .build()
                INSTANCE = instance
            }
            return instance
        }
    }
}