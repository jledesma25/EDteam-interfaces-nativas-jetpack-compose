package com.edteam.edteamcomposecourse.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edteam.edteamcomposecourse.list.components.PokemonItem
import com.edteam.edteamcomposecourse.list.data.getPokemons

@Composable
fun LazyHorizontalGridComponent() {

    LazyHorizontalGrid(
        rows = GridCells.Adaptive(200.dp),
        //rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(getPokemons()){pokemon ->
            PokemonItem(
                pokemon = pokemon,
                onItemClick = {
                    println("LazyHorizontalGrid: ${it.name}")
                }
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun LazyHorizontalGridComponentPreview() {
   LazyHorizontalGridComponent()
}