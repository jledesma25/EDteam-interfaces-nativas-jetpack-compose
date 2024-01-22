package com.edteam.edteamcomposecourse.composition.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyTextField(
    myText : String,
    onValueChange:(String)->Unit
) {

    OutlinedTextField(
        value = myText,
        onValueChange = { textWriting ->
            onValueChange(textWriting)
        }
    )
}

@Composable
fun MyText(
    myText:String
) {
    Text(
        text = myText
    )
}