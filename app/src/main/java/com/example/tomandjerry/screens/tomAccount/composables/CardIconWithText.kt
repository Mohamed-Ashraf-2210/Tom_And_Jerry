package com.example.tomandjerry.screens.tomAccount.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun CardIconWithText(icon: Int, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(White)
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Text(
            text = text,
            modifier = Modifier.padding(start = 8.dp).align(Alignment.CenterVertically),
            color = Tuatara.copy(alpha = 0.8f),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
    }
}