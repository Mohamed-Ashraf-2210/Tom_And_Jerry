package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Tuatara15
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.White

@Composable
fun NotificationIcon(numberOfNotification: Int, modifier: Modifier = Modifier) {
    BadgedBox(
        modifier = modifier,
        badge = {
            Badge(
                contentColor = White,
                containerColor = VeniceBlue,
            ) {
                Text(text = "$numberOfNotification")
            }
        },

        ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .border(1.dp, Tuatara15, RoundedCornerShape(12.dp))
        ) {
            Image(
                painterResource(R.drawable.notification),
                contentDescription = "Notification",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}