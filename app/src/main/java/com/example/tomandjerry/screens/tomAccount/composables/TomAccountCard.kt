package com.example.tomandjerry.screens.tomAccount.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.CodGray
import com.example.tomandjerry.ui.theme.CodGray60
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomAccountCard(
    colorCard: Color,
    icon: Int,
    text: String,
    description: String
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = colorCard),
        modifier = Modifier.width(170.dp)
    ) {
        Row(modifier = Modifier.padding(top = 9.dp, bottom = 9.dp, start = 12.dp, end = 10.dp)) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text = text,
                    color = CodGray60,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    letterSpacing = 0.5.sp
                )
                Text(
                    text = description,
                    color = CodGray.copy(alpha = 0.37f),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp
                )
            }
        }
    }
}