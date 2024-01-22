package com.edteam.edteamcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposable()
        }
    }
}

@Composable
fun MyFirstComposable(){
    Text(text = "Hello EDTEAM")
}



@Preview(
    name = "Preview",
    showSystemUi = true
)
@Preview(
    name = "Preview Nexus",
    showSystemUi = true,
    device = Devices.NEXUS_10
)
@Composable
fun MyFirstComposablePreview(){
    MyFirstComposable()
}





