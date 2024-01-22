package com.edteam.edteamcomposecourse.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edteam.edteamcomposecourse.list.components.PokemonItem
import com.edteam.edteamcomposecourse.list.data.getPokemons

@Composable
fun LazyRowComponent() {


   LazyRow(
      modifier = Modifier.fillMaxWidth(),
      contentPadding = PaddingValues(8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.spacedBy(8.dp)
   ){

      items(getPokemons()){ pokemon ->
         PokemonItem(
            pokemon = pokemon,
            onItemClick = {
               println("Lazy Row: ${it.name}")
            }
         )
      }

   }

}

@Preview(showSystemUi = true)
@Composable
fun LazyRowComponentPreview() {
   LazyRowComponent()
}