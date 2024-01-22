package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyModifiers() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Text(
            text = "Modifiers",
            color = Color.Blue,
            fontSize = 20.sp,
            modifier = Modifier
                .background(Color.Red)
                .border(
                    width = 4.dp,
                    color = Color.Green
                )
                .padding(20.dp)
                .border(
                    width = 2.dp,
                    color = Color.Green
                )
                .padding(8.dp)

        )

    }

}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun MyModifiersPreview() {
    MyModifiers()
}