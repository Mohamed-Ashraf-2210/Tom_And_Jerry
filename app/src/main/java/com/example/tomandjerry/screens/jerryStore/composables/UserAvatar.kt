package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Tuatara15

@Composable
fun UserAvatar(imageResourceId: Int, imageSize: Int) {
    Image(
        painter = painterResource(id = imageResourceId),
        contentDescription = stringResource(R.string.profile_image),
        modifier = Modifier
            .size(imageSize.dp)
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, color = Tuatara15)
    )
}