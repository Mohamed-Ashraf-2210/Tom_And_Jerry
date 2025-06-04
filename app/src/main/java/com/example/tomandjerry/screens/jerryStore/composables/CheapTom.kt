package com.example.tomandjerry.screens.jerryStore.composables

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.composables.RowTitleWithViewAll
import com.example.tomandjerry.screens.jerryStore.TomInformation
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun CheapTom() {
    Column(modifier = Modifier.fillMaxSize()) {


        RowTitleWithViewAll(title = "Cheap tom section", titleSize = 20,titleLineHeight = 30, titleColor = Tuatara, modifier = Modifier.padding(horizontal = 16.dp))

        val scrollState = rememberScrollState()
        val showShadow by remember {
            derivedStateOf { scrollState.value > 0 }
        }

        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
                    .verticalScroll(state = scrollState),
            ) {

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TomProductCard(
                        TomInformation(
                            tomName = "Sport Tom",
                            tomDescription = "He runs 1 meter... trips\nover his boot.",
                            tomOldPrice = "5",
                            tomNewPrice = "3",
                            tomImage = R.drawable.sport_tom
                        )
                    )
                    TomProductCard(
                        TomInformation(
                            tomName = "Tom the lover",
                            tomDescription = "He loves one-sidedly...\nand is beaten by the other\nside.",
                            tomNewPrice = "5",
                            tomImage = R.drawable.tom_the_lover
                        )
                    )
                }


                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TomProductCard(
                        TomInformation(
                            tomName = "Tom the bomb",
                            tomDescription = "He blows himself up\nbefore Jerry can catch\nhim.",
                            tomNewPrice = "10",
                            tomImage = R.drawable.tom_the_bomb
                        )
                    )
                    TomProductCard(
                        TomInformation(
                            tomName = "Spy Tom",
                            tomDescription = "Disguises itself as a table.",
                            tomNewPrice = "12",
                            tomImage = R.drawable.spy_tom
                        )
                    )
                }


                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TomProductCard(
                        TomInformation(
                            tomName = "Frozen Tom",
                            tomDescription = "He was chasing Jerry, he\nfroze after the first look",
                            tomOldPrice = "5",
                            tomNewPrice = "3",
                            tomImage = R.drawable.frozen_tom
                        )
                    )
                    TomProductCard(
                        TomInformation(
                            tomName = "Sleeping Tom",
                            tomDescription = "He doesn't chase anyone,\nhe just snores in stereo.",
                            tomNewPrice = "5",
                            tomImage = R.drawable.sleeping_tom
                        )
                    )
                }


                Spacer(modifier = Modifier.height(12.dp))
            }

            if (showShadow) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Black.copy(alpha = 0.12f),
                                    Color.Transparent
                                )
                            )
                        )
                        .align(Alignment.TopCenter)
                )
            }
        }



    }
}