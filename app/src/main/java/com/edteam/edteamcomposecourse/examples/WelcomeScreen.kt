package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#073042"))),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "JUAN JOSE LEDESMA",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Android Developer",
                color = Color(android.graphics.Color.parseColor("#3ddc84")),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Divider(thickness = 1.dp, color = Color.White)
            Row(modifier = Modifier.padding(12.dp)) {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "Phone",
                    tint = Color(android.graphics.Color.parseColor("#3ddc84")),
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "+11 (123) 111 222 333",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
            Divider(thickness = 1.dp, color = Color.White)
        }
    }

}

@Preview(name = "Preview", showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}