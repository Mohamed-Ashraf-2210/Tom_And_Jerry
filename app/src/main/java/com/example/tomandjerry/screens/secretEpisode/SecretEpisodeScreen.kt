package com.example.tomandjerry.screens.secretEpisode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.composables.RowTitleWithViewAll
import com.example.tomandjerry.screens.secretEpisode.composables.PopularCharacterCard
import com.example.tomandjerry.ui.theme.Anakiwa
import com.example.tomandjerry.ui.theme.AquaHaze
import com.example.tomandjerry.ui.theme.AzureRadiance
import com.example.tomandjerry.ui.theme.ChromeWhite
import com.example.tomandjerry.ui.theme.Orient
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun SecretEpisode() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AquaHaze)
    )
    Box(
        modifier = Modifier
            .background(color = Anakiwa)
            .fillMaxWidth()
            .height(432.dp)
    )

    Column(modifier = Modifier.padding(top = 12.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.profile_image_3),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
                val gradientColors = listOf(
                    AzureRadiance,
                    Orient
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            brush = Brush.linearGradient(
                                colors = gradientColors,
                                start = Offset(0f, 0f),
                                end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                            )
                        )
                    //.blur(12.dp)
                    //.offset(x = 2.dp, y = 4.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.search_status),
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 8.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Deleted episodes of Tom\nand Jerry!",
                        color = Tuatara.copy(alpha = 0.87f),
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 20.sp,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(top = 33.dp, bottom = 8.dp)
                    )

                    Text(
                        text = "Scenes that were canceled for...\nmysterious (and sometimes\nembarrassing) reasons.",
                        color = Tuatara.copy(alpha = 0.6f),
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 20.sp,
                        fontSize = 14.sp,
                    )
                }

                Image(
                    painter = painterResource(R.drawable.tom_and_jerry),
                    contentDescription = null,
                    modifier = Modifier.size(width = 112.dp, height = 178.dp),
                    contentScale = ContentScale.Crop
                )
            }

            RowTitleWithViewAll(
                title = "Most watched",
                titleSize = 20,
                titleLineHeight = 20,
                titleColor = Tuatara.copy(alpha = 0.87f),
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

        PopularCharacterCard(image = R.drawable.tom_head, title = "Tom", subtitle = "Jerry", colorCard = ChromeWhite)

    }


}