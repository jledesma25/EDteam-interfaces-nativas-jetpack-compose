package com.edteam.edteamcomposecourse.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edteam.edteamcomposecourse.list.components.PokemonItem
import com.edteam.edteamcomposecourse.list.data.getPokemons

@Composable
fun LazyVerticalGridComponent() {

    LazyVerticalGrid(
        //columns = GridCells.Fixed(2),
        columns = GridCells.Adaptive(140.dp),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(getPokemons()){ pokemon ->
            PokemonItem(
                pokemon = pokemon,
                onItemClick = {
                    println("LazyVerticalGrid: ${it.name}")
                }
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun LazyVerticalGridComponentPreview() {
   LazyVerticalGridComponent()
}

@Preview(showSystemUi = true, device = Devices.NEXUS_10)
@Composable
fun LazyVerticalGridComponentTabletPreview() {
    LazyVerticalGridComponent()
}