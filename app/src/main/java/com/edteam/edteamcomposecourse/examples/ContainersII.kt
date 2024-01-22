package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContainerComponent() {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ) {

        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Blue)) {

        }
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Red)) {

        }
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Green)) {

        }

    }

}

@Composable
fun ContainerRowComponent() {

    Row(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Blue)) {

        }
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Red)) {

        }
        Box(modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .background(Color.Green)) {

        }

    }

}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun ContainerComponentPreview() {
    ContainerComponent()
}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun ContainerRowComponentPreview() {
    ContainerRowComponent()
}