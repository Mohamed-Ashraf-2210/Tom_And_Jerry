package com.example.tomandjerry.screens.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun RowTitleWithViewAll(
    title: String,
    titleSize: Int,
    titleLineHeight: Int,
    titleColor: androidx.compose.ui.graphics.Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            color = titleColor,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.SemiBold,
            fontSize = titleSize.sp,
            lineHeight = titleLineHeight.sp,
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "View all",
                color = VeniceBlue,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 4.dp)
            )
            Icon(
                painter = painterResource(R.drawable.arrow_right_04),
                contentDescription = null,
                modifier = Modifier
                    .size(12.dp)
                    .align(Alignment.CenterVertically),
                tint = VeniceBlue
            )
        }
    }
}