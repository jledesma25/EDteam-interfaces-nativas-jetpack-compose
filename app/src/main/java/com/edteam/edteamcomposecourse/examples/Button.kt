package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComponent() {

    Column {
        TextButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.Magenta,
                contentColor = Color.Red
            )
        ) {
            Text(text = "Click")
        }

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Magenta
            )
        ) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Shopping"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Buy")
        }

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Magenta
            ),
            shape = RoundedCornerShape(12.dp),
            enabled = true,
            border = BorderStroke(
                width = 2.dp,
                //color= Color.Blue,
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.Yellow,
                        Color.Blue
                    )
                )
            )
        ) {
            Text(text = "Welcome")
        }

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Shopping"
            )
        }

    }



}

@Preview(showSystemUi = true)
@Composable
fun ButtonComponentPreview() {
    ButtonComponent()
}