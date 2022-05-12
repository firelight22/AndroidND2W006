package com.eni.mod9tpdbvoiture

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Voiture::class),version =1,exportSchema = false)
abstract class VoitureDb : RoomDatabase() {
    abstract fun voitureDao() : VoitureDao

    companion object{
        @Volatile
        private var INSTANCE: VoitureDb? = null
        //Permet de récupérer une instance de la BDD
        fun getInstance(ctx: Context):VoitureDb{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    ctx,
                    VoitureDb::class.java,
                    "voiture.db"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}