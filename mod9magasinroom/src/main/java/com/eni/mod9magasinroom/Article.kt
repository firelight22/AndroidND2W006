package com.eni.mod9magasinroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Article(
    @PrimaryKey(autoGenerate = true) val id: Long =0L,
    val nom:String,
    val marque: String,
    val quantite: Int,
    val prix: Float
)
