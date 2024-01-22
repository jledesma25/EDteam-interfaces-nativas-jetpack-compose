package com.edteam.edteamcomposecourse.list.data

data class Pokemon(
    val id:Int,
    val name:String,
    val image:String
)

fun getPokemons() = (1..151).map {

    //Crear Pokemon
    Pokemon(
        id = it,
        name = getRandomString(),
        image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$it.png"
    )

}

fun getRandomString() : String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..10)
        .map { charset.random() }
        .joinToString("")
}



