package com.example.tomandjerry.screens.tomKitchen.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.CodGray60
import com.example.tomandjerry.ui.theme.LinkWater
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun PreparationMethod(number: String, description: String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp),
            shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp),
            colors = CardDefaults.cardColors(containerColor = White)
        ) {
            Text(
                text = description,
                color = CodGray60,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 28.dp, top = 8.dp, bottom = 8.dp)
            )
        }

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(100.dp))
                .background(color = White)
                .border(1.dp, LinkWater, RoundedCornerShape(100.dp)),
        ) {
            Text(
                text = number,
                color = VeniceBlue,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }

    }


}