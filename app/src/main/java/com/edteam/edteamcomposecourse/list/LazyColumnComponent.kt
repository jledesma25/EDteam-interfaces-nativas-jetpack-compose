package com.edteam.edteamcomposecourse.list

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.edteam.edteamcomposecourse.R
import com.edteam.edteamcomposecourse.list.components.PokemonItem
import com.edteam.edteamcomposecourse.list.data.Pokemon
import com.edteam.edteamcomposecourse.list.data.getPokemons

@Composable
fun LazyColumnComponent() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        item {
            Text(
                text = "Pokedex",
                fontSize = 20.sp
            )
        }

        items(getPokemons()) { pokemon ->
            PokemonItem(
                pokemon = pokemon,
                onItemClick = {
                    println("Lazy Column: ${it.name}")
                }
            )
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyColumnStickyHeadersComponent() {

    val pokemonsFilter = getPokemons().groupBy {
        it.name.first()
    }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {


        pokemonsFilter.forEach { (character,pokemons) ->
            stickyHeader {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(4.dp)) {
                    Text(
                        text = character.toString(),
                        color = Color.White
                    )
                }
            }

            items(pokemons) { pokemon ->
                PokemonItem(
                    pokemon = pokemon,
                    onItemClick = {
                        println("Lazy Column: ${it.name}")
                    }
                )
            }

        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun LazyColumnComponentPreview() {
    LazyColumnComponent()
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnStickyHeadersComponentPreview() {
    LazyColumnStickyHeadersComponent()
}






