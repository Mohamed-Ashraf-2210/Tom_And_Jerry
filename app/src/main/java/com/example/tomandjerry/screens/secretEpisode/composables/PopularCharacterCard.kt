package com.example.tomandjerry.screens.secretEpisode.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ChromeWhite
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun PopularCharacterCard(
    image: Int,
    title: String,
    subtitle: String,
    colorCard: androidx.compose.ui.graphics.Color
) {

    Box(modifier = Modifier.size(width = 140.dp, height = 128.dp)) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
                .clip(RoundedCornerShape(16.dp))

                .background(color = colorCard),

            ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    color = Tuatara.copy(alpha = 0.87f),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 20.sp,
                    fontSize = 18.sp,
                )

                Text(
                    text = subtitle,
                    color = Tuatara.copy(alpha = 0.6f),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    lineHeight = 20.sp,
                    fontSize = 12.sp,
                )
            }

        }

        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.TopCenter)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PopularCharacterCardPreview() {
    TomAndJerryTheme {
        PopularCharacterCard(
            image = R.drawable.tom_head,
            title = "Tom",
            subtitle = "Jerry",
            colorCard = ChromeWhite
        )
    }
}