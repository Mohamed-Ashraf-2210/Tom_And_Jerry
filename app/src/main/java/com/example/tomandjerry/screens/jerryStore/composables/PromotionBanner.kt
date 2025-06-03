package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
            .height(116.dp)
    ) {
        Box(
            modifier = modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = gradientColors,
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                    )
                )
                .padding(top = 12.dp, start = 12.dp, bottom = 12.dp),

            ) {
            Column(modifier = modifier.fillMaxHeight()) {
                Text(
                    text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                    color = White,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 24.sp,
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Adopt Tom! (Free Fail-Free\nGuarantee)",
                    color = White.copy(alpha = 0.8f),
                    fontFamily = ibmPlexSansArabic,
                    letterSpacing = 0.sp,
                    maxLines = 2,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                )
            }
        }
        Image(
            painter = painterResource(R.drawable.tom_promotion_banner),
            contentDescription = null,
            modifier = Modifier
                .size(width = 116.dp, height = 116.dp)
                .align(alignment = Alignment.CenterEnd),
            contentScale = ContentScale.Crop
        )
    }
}