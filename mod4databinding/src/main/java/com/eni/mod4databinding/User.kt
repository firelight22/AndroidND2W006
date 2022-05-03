package com.eni.mod4databinding

data class User(
    val prenom: String="John",
    val nom: String ="Doe",
    var age:Int,
    val villeNaissance: String= "Tatouine",
    var telephone:String ="911"
)
