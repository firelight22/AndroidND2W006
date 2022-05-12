package com.eni.mod9tpdbvoiture

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface VoitureDao {
    @Insert
    fun insert(v:Voiture)

    @Query("SELECT * FROM Voiture WHERE id = :id")
    suspend fun getById(id:Long) : Voiture

    @Query("SELECT * FROM Voiture")
    fun getAll():List<Voiture>
}