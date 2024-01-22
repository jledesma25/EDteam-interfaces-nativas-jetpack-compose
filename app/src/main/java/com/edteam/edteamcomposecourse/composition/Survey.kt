package com.edteam.edteamcomposecourse.composition

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SurveyComponent() {

   //Estado: Curso seleccionado
   //Acciones: Onclick radiobutton
   //Recomposicion

   val courses = listOf("Jetpack Compose","IOS")

   var currentSelection by remember {
      mutableStateOf(courses.first())
   }

   Column {

      courses.forEach { name ->
         Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
         ) {
            RadioButton(
               selected = name == currentSelection,
               onClick = {
                     currentSelection = name
               },
               enabled = true,
               colors = RadioButtonDefaults.colors(
                  selectedColor = Color.Red,
                  unselectedColor = Color.Blue,
                  disabledSelectedColor = Color.Yellow,
                  disabledUnselectedColor = Color.Green
               )
            )
            Text(
               text = name
            )
         }

      }
   }

}

@Preview(showSystemUi = true)
@Composable
fun SurveyComponentPreview() {
   SurveyComponent()
}