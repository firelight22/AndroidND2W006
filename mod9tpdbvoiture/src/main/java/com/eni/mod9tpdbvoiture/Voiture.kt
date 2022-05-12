package com.eni.mod9tpdbvoiture

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Categorie{
    CITADINE,BREAK,CROSSOVER,BERLINE,BERLINE_COMPACTE,
    SUV,PICKUP
}
@Entity
data class Voiture(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val voitureId:Long,
    val marque:String,
    val modele:String,
    val categorie:Categorie,
    val energie:String,
    val km:Int,
    val prix:Int,
)
