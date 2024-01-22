package com.edteam.edteamcomposecourse.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent() {

    Column {
        Text(
            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's",
            color = Color.Red,
            fontSize = 17.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Monospace,
            letterSpacing = 1.em,
            //textDecoration = TextDecoration.LineThrough,
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            ),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            lineHeight = 2.em,
            //maxLines = 1,
            //softWrap = false,
            //overflow = TextOverflow.Ellipsis
        )

        Text(
            buildAnnotatedString {
                append("Si no estas sucrito, dale click")
                withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        textDecoration = TextDecoration.Underline
                    )
                ) {
                    append(" AQUI")
                }
            }
        )

    }


}

@Preview(showSystemUi = true)
@Composable
fun TextComponentPreview() {
    TextComponent()
}

