package com.example.tomandjerry.screens.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Polar
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun CheesesBox(colorBox: Color,oldPrice: String, newPrice: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color = colorBox)         ,
        contentAlignment = Alignment.Center
    ) {
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.money_bag_01),
                contentDescription = null,
                modifier = Modifier.padding(end = 4.dp)
            )
            if (oldPrice != "0") {
                Text(
                    text = oldPrice,
                    color = VeniceBlue,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough
                )
            }

            Text(
                text = "$newPrice cheeses",
                color = VeniceBlue,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )

        }
    }
}