package com.example.tomandjerry.screens.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.tomAccount.composables.SettingsSection
import com.example.tomandjerry.screens.tomAccount.composables.TomAccountCard
import com.example.tomandjerry.ui.theme.AquaHaze
import com.example.tomandjerry.ui.theme.Champagne
import com.example.tomandjerry.ui.theme.ChromeWhite
import com.example.tomandjerry.ui.theme.CodGray60
import com.example.tomandjerry.ui.theme.DividerColor
import com.example.tomandjerry.ui.theme.LinkWater
import com.example.tomandjerry.ui.theme.Tuatara15
import com.example.tomandjerry.ui.theme.VanillaIce
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomAccountScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.background_tom_account),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-56).dp, x = 20.dp)
                    .graphicsLayer(scaleX = 1.5f, scaleY = 1.5f)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.tom_donkey),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .border(1.dp, color = Tuatara15, shape = RoundedCornerShape(12.dp))
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Tom",
                    color = White,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )

                Text(
                    text = "specializes in failure!",
                    color = White.copy(alpha = 0.8f),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(width = 97.dp, height = 25.dp)
                        .clip(RoundedCornerShape(40.dp)),
                    colors = ButtonDefaults.buttonColors(White.copy(alpha = 0.12F)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Edit foolishness",
                        color = White,
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.sp,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                    colors = CardDefaults.cardColors(containerColor = AquaHaze)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 23.dp, start = 16.dp, end = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            TomAccountCard(
                                colorCard = LinkWater,
                                icon = R.drawable.no_of_quarrels_icon,
                                text = "2M 12K",
                                description = "No. of quarrels"
                            )
                            TomAccountCard(
                                colorCard = ChromeWhite,
                                icon = R.drawable.hunting_times_icon,
                                text = "+500 h",
                                description = "Chase time"
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            TomAccountCard(
                                colorCard = VanillaIce,
                                icon = R.drawable.chase_time_icon,
                                text = "2M 12K",
                                description = "Hunting times"
                            )
                            TomAccountCard(
                                colorCard = Champagne,
                                icon = R.drawable.heartbroken_icon,
                                text = "3M 7K",
                                description = "Heartbroken"
                            )
                        }



                        Spacer(modifier = Modifier.height(24.dp))
                        SettingsSection(
                            title = "Tom settings",
                            icons = listOf(
                                R.drawable.bed_single,
                                R.drawable.cat,
                                R.drawable.fridge
                            ),
                            texts = listOf(
                                "Change sleeping place",
                                "Meow settings",
                                "Password to open the fridge"
                            )
                        )
                    }



                    HorizontalDivider(
                        modifier = Modifier.fillMaxWidth(),
                        thickness = 1.dp,
                        color = DividerColor
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 12.dp, start = 16.dp, end = 16.dp)
                    ) {
                        SettingsSection(
                            title = "His favorite foods",
                            icons = listOf(
                                R.drawable.alert_01,
                                R.drawable.hamburger_02,
                                R.drawable.sleeping
                            ),
                            texts = listOf(
                                "Mouses",
                                "Last stolen meal",
                                "Change sleep mood"
                            )
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Text(
                            text = "v.TomBeta",
                            color = CodGray60,
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                    }
                }
            }
        }
    }
}