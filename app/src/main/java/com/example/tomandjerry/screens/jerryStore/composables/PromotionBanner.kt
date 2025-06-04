package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Lochmara
import com.example.tomandjerry.ui.theme.RegalBlue
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun PromotionBanner(modifier: Modifier = Modifier) {
    val gradientColors = listOf(
        RegalBlue,
        Lochmara
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(108.dp)
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = gradientColors,
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                    )
                )
        ) {
            Column(
                modifier = modifier
                    .fillMaxHeight()
                    .padding(top = 12.dp, start = 12.dp, bottom = 12.dp)
            ) {
                Text(
                    text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                    color = White,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                )

                Text(
                    text = "Adopt Tom! (Free Fail-Free\nGuarantee)",
                    color = White.copy(alpha = 0.8f),
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 20.sp
                )
            }
            Image(
                painter = painterResource(R.drawable.circles),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight()
                    .align(alignment = Alignment.CenterEnd)
                    .width(92.dp),
                contentScale = ContentScale.Crop
            )
        }


        Image(
            painter = painterResource(R.drawable.tom_promotion_banner),
            contentDescription = null,
            modifier = Modifier
                .size(width = 116.dp, height = 108.dp)
                .align(alignment = Alignment.CenterEnd),
            contentScale = ContentScale.Crop
        )
    }
}