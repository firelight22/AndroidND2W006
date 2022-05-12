package com.eni.mod10rvclimat

data class Climatisation(
    val marque:String,
    val modele: String,
    val qteGaz: Float,// en litres
    val typeCompresseur: String,
    val typeTelecommande : String
)
