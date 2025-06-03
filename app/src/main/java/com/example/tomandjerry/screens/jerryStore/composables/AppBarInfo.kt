package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Delta
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun AppBarInfo(userName: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Text(
            text = "Hi, $userName \uD83D\uDC4B\uD83C\uDFFB",
            color = Tuatara,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
        )

        Text(
            text = stringResource(R.string.which_tom_do_you_want_to_buy),
            color = Delta,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
        )
    }
}