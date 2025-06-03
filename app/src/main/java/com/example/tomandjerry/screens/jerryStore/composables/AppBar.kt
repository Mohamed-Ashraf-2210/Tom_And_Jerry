package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun AppBar(name: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        UserAvatar(imageResourceId = R.drawable.profile_image, imageSize = 48)
        AppBarInfo(userName = name, modifier = Modifier.padding(start = 8.dp))
        Spacer(modifier = Modifier.weight(1f))
        NotificationIcon(numberOfNotification = 3, modifier = Modifier.padding(top = 4.dp))
    }
}