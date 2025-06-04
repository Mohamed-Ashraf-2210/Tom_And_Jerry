package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.screens.composables.CheesesBox
import com.example.tomandjerry.screens.jerryStore.TomInformation
import com.example.tomandjerry.ui.theme.OsloGray
import com.example.tomandjerry.ui.theme.Polar
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomProductCard(
    tomInformation: TomInformation,
) {
    Box {
        Box(
            modifier = Modifier
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = White),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier
                    .padding(top = 92.dp, start = 8.dp, end = 8.dp, bottom = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = tomInformation.tomName,
                    color = Tuatara,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                )


                Box(modifier = Modifier.height(54.dp)) {
                    Text(
                        text = tomInformation.tomDescription,
                        color = OsloGray,
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        lineHeight = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    CheesesBox(
                        colorBox = Polar,
                        oldPrice = tomInformation.tomOldPrice,
                        newPrice = tomInformation.tomNewPrice,
                        modifier = Modifier.size(width = 106.dp, height = 30.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .background(color = White)
                            .border(1.dp, color = VeniceBlue, shape = RoundedCornerShape(8.dp))
                            .padding(8.dp)
                    ) {
                        Image(
                            painterResource(R.drawable.add_to_cart_icon),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }

        Image(
            painter = painterResource(id = tomInformation.tomImage),
            contentDescription = tomInformation.tomName,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )
    }
}