package com.example.tomandjerry.screens.secretEpisode.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Tuatara15
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun MostWatchedCard(image: Int, title: String) {
    Card(
        modifier = Modifier.size(width = 212.dp, height = 311.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Tuatara15)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .border(1.dp, White.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                        .background(color = White.copy(alpha = 0.24f))
                        .align(Alignment.End)
                ) {
                    Image(
                        painter = painterResource(R.drawable.cheese_icon),
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = title,
                    color = White,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 20.sp,
                    fontSize = 14.sp,
                    letterSpacing = 0.25.sp,
                    modifier = Modifier
                        .padding(bottom = 4.dp).align(Alignment.Start)
                )
            }
        }

    }
}