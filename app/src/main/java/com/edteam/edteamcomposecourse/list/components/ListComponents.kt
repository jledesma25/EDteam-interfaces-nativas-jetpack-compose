package com.edteam.edteamcomposecourse.list.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.edteam.edteamcomposecourse.list.data.Pokemon

@Composable
fun PokemonItem(
    pokemon: Pokemon,
    onItemClick:(Pokemon)->Unit
) {

    Card(
        border = BorderStroke(width = 1.dp, color = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                //println("Cliked")
                onItemClick(pokemon)
            }
    ) {
        Column {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(pokemon.image)
                    .crossfade(2000)
                    .build(),
                contentDescription = "Pokemon",
                modifier = Modifier
                    .fillMaxWidth(),
                    //.height(200.dp),
                contentScale = ContentScale.Fit
            )

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(android.graphics.Color.parseColor("#FF090F20")))
                    .padding(16.dp)
            ) {
                Text(
                    text = pokemon.name,
                    color = Color.White,
                    fontSize = 20.sp
                )
            }


        }
    }


}