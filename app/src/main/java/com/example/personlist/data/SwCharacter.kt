package com.example.personlist.data

data class SwCharacter(
    val name: String,
    val height: String,
    val mass: String,
    val gender: String,
    val birth_year: String,
    val url: String
)

data class SwCharacterResponse(
    val results: List<SwCharacter>
)