package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RadioButtonAndCheckbox() {

    val courses = listOf("Jetpack Compose","IOS")
    
    Column {

        courses.forEach { name ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = false,
                    onClick = { },
                    enabled = false,
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

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = false,
                onCheckedChange = {},
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Yellow,
                    checkmarkColor = Color.Green,
                    disabledCheckedColor = Color.Magenta,
                    disabledUncheckedColor = Color.Gray
                )
            )
            Text(text = "Aceptar terminos")
        }





    }

}

@Preview(showSystemUi = true)
@Composable
fun RadioButtonAndCheckboxPreview() {
    RadioButtonAndCheckbox()
}