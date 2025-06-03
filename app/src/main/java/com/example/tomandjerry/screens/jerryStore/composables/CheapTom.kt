package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.jerryStore.TomInformation
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun CheapTom() {
    Column(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Cheap tom section",
                color = Tuatara,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "View all",
                    color = VeniceBlue,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Icon(
                    painter = painterResource(R.drawable.arrow_right_04),
                    contentDescription = null,
                    modifier = Modifier
                        .size(14.dp)
                        .align(Alignment.CenterVertically)
                        .padding(start = 4.dp),
                    tint = VeniceBlue
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState()),
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TomProductCard(
                    TomInformation(
                        tomName = "Sport Tom",
                        tomDescription = "He runs 1 meter... trips over his boot.",
                        tomOldPrice = "5",
                        tomNewPrice = "3",
                        tomImage = R.drawable.sport_tom
                    )
                )
                TomProductCard(
                    TomInformation(
                        tomName = "Tom the lover",
                        tomDescription = "He loves one-sidedly... and is beaten by the other side.",
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
                        tomDescription = "He blows himself up before Jerry can catch him.",
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
                        tomDescription = "He was chasing Jerry, he froze after the first look",
                        tomOldPrice = "5",
                        tomNewPrice = "3",
                        tomImage = R.drawable.frozen_tom
                    )
                )
                TomProductCard(
                    TomInformation(
                        tomName = "Sleeping Tom",
                        tomDescription = "He doesn't chase anyone, he just snores in stereo.",
                        tomNewPrice = "5",
                        tomImage = R.drawable.sleeping_tom
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
                        tomName = "Sport Tom",
                        tomDescription = "He runs 1 meter... trips over his boot.",
                        tomOldPrice = "5",
                        tomNewPrice = "3",
                        tomImage = R.drawable.sport_tom
                    )
                )
                TomProductCard(
                    TomInformation(
                        tomName = "Tom the lover",
                        tomDescription = "He loves one-sidedly... and is beaten by the other side.",
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
                        tomDescription = "He blows himself up before Jerry can catch him.",
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
                        tomDescription = "He was chasing Jerry, he froze after the first look",
                        tomOldPrice = "5",
                        tomNewPrice = "3",
                        tomImage = R.drawable.frozen_tom
                    )
                )
                TomProductCard(
                    TomInformation(
                        tomName = "Sleeping Tom",
                        tomDescription = "He doesn't chase anyone, he just snores in stereo.",
                        tomNewPrice = "5",
                        tomImage = R.drawable.sleeping_tom
                    )
                )
            }


            Spacer(modifier = Modifier.height(12.dp))
        }

    }
}