package com.edteam.edteamcomposecourse.composition

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.edteam.edteamcomposecourse.composition.components.MyText
import com.edteam.edteamcomposecourse.composition.components.MyTextField

@Composable
fun StateHoistingComponent() {
    //Estado: Texto de la caja
    //Evento: digite sobre la caja / onValueChange
    //Recomposicion

    var text by remember {
        mutableStateOf("")
    }

    Column {

        MyTextField(
            myText = text,
            onValueChange = {
                text = it
            }
        )
        MyText(
            myText = text
        )

    }
}



@Preview(showSystemUi = true)
@Composable
fun StateHoistingComponentPreview() {
   StateHoistingComponent()
}