package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

//Columns
@Composable
fun MyColumns() {
    Column {
        Text(text = "EDTEAM")
        Text(text = "Juan Jose Ledesma")
    }

}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun MyColumnsPreview() {
    MyColumns()
}

//Rows
@Composable
fun MyRows() {
    Row {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Clicked")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Clicked")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Clicked")
        }
    }
}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun MyRowsPreview() {
    MyRows()
}

//Box
@Composable
fun MyBox() {
    Box(contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(text = "Juan José")
    }

}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun MyBoxPreview() {
    MyBox()
}