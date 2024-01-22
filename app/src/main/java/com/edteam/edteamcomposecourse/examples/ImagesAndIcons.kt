package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edteam.edteamcomposecourse.R

@Composable
fun ImagesAndIcons() {

    Column {

        Icon(
            imageVector = Icons.Filled.ShoppingCart,
            contentDescription = "Shopping",
            modifier = Modifier
                .size(100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.images_logo),
            contentDescription = "Logo Edteam",
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.Gray,
                    shape = CircleShape
                )
        )

        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.Gray,
                    shape = CircleShape
                )
        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun ImagesAndIconsPreview() {
    ImagesAndIcons()
}