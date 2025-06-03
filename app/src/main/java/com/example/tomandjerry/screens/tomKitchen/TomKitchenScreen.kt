package com.example.tomandjerry.screens.tomKitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.composables.CheesesBox
import com.example.tomandjerry.screens.tomKitchen.composables.AddToCard
import com.example.tomandjerry.screens.tomKitchen.composables.DetailsCard
import com.example.tomandjerry.screens.tomKitchen.composables.PreparationMethod
import com.example.tomandjerry.ui.theme.AquaHaze
import com.example.tomandjerry.ui.theme.CodGray60
import com.example.tomandjerry.ui.theme.LinkWater
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomKitchenScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(VeniceBlue.copy(alpha = 0.5f))
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ellipse_3_tom_kitchen),
                    contentDescription = null,
                    modifier = Modifier.offset(y = -16.dp)
                )

                Column(modifier = Modifier.padding(start = 16.dp, top = 56.dp)) {
                    Row(modifier = Modifier.padding(bottom = 16.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.high_tension_icon),
                            contentDescription = null,
                            tint = White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 9.dp)
                        )
                        Text(
                            text = stringResource(R.string.high_tension),
                            color = White.copy(alpha = 0.87f),
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                        )
                    }

                    Row {
                        Icon(
                            painter = painterResource(id = R.drawable.shocking_foods_icon),
                            contentDescription = null,
                            tint = White,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 9.dp)
                        )
                        Text(
                            text = stringResource(R.string.shocking_foods),
                            color = White.copy(alpha = 0.87f),
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp,
                        )
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 180.dp),
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                    colors = CardDefaults.cardColors(containerColor = AquaHaze)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                    ) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Column {
                                Text(
                                    text = stringResource(R.string.electric_tom_pasta),
                                    color = Tuatara.copy(alpha = 0.87f),
                                    fontFamily = ibmPlexSansArabic,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 20.sp,
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                CheesesBox(
                                    colorBox = LinkWater,
                                    verticalPadding = 7,
                                    horizontalPadding = 7,
                                    oldPrice = "0",
                                    newPrice = "5"
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))

                            Icon(
                                modifier = Modifier.padding(top = 25.dp),
                                painter = painterResource(id = R.drawable.baseline_favorite_24),
                                contentDescription = null,
                                tint = VeniceBlue
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                            color = CodGray60,
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            maxLines = 3,
                            lineHeight = 20.sp,
                            letterSpacing = 0.5.sp
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "Details",
                            color = Tuatara.copy(alpha = 0.87f),
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            lineHeight = 32.sp,
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            DetailsCard(
                                image = R.drawable.temperature_icon,
                                title = "Temperature",
                                description = "1000 V"
                            )
                            DetailsCard(
                                image = R.drawable.time_icon,
                                title = "Time",
                                description = "3 sparks"
                            )
                            DetailsCard(
                                image = R.drawable.deaths_icon,
                                title = "No. of deaths",
                                description = "1M 12K"
                            )
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "Preparation method",
                            color = Tuatara.copy(alpha = 0.87f),
                            fontFamily = ibmPlexSansArabic,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            lineHeight = 32.sp,
                        )

                        Spacer(modifier = Modifier.height(8.dp))


                        Column(modifier = Modifier.fillMaxWidth()) {
                            PreparationMethod(
                                number = "1", description = "Put the pasta in a toaster."
                            )
                            PreparationMethod(
                                number = "2", description = "Pour battery juice over it."
                            )
                            PreparationMethod(
                                number = "3", description = "Wait for the spark to ignite."
                            )
                            PreparationMethod(
                                number = "4", description = "Serve with an insulating glove."
                            )
                        }
                    }

                }

                Image(
                    painter = painterResource(id = R.drawable.tom_pasta),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 18.dp, end = 25.dp, start = 145.dp)
                )


            }

        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(86.dp)
                .background(color = White)
                .border(1.dp, Tuatara.copy(alpha = 0.12f))
                .padding(vertical = 15.dp, horizontal = 16.dp)
        ) {
            AddToCard(oldCheeses = "5", newCheeses = "3")
        }
    }
}