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

@Composable
fun FormComponent() {

   //Estado: Texto de la caja
   //Evento: digite sobre la caja / onValueChange
   //Recomposicion

   var text by remember {
      mutableStateOf("")
   }

   Column {

      OutlinedTextField(
         value = text,
         onValueChange = { textWriting ->
            text = textWriting
         }
      )
      Text(
         text = text
      )

   }

}

@Preview(showSystemUi = true)
@Composable
fun FormComponentPreview() {
   FormComponent()
}