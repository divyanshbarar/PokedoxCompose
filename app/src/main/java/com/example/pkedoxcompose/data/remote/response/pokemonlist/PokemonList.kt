package com.example.pkedoxcompose.data.remote.response.pokemonlist

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)