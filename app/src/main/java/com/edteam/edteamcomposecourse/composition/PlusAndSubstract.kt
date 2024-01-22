package com.edteam.edteamcomposecourse.composition

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlusAndSubstractComponent() {

    //Estados: quantity
    //Eventos: boton sumar, boton restar

    //Estado: 0 -> 1, modificarse la UI

    //var quantity = 0
    var quantity = remember {
        mutableStateOf(0)
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            quantity.value++
        }) {
            Text(text = "+")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "${quantity.value}",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.width(8.dp))
        Button(onClick = {
            quantity.value--
        }) {
            Text(text = "-")
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun PlusAndSubstractComponentPreview() {
    PlusAndSubstractComponent()
}