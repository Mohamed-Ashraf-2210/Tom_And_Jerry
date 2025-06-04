package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
        modifier = Modifier.padding(start = 16.dp),
        badge = {
            Badge(
                contentColor = White,
                containerColor = VeniceBlue,
                modifier = Modifier.offset(x = 2.dp, y = (-4).dp)
            ) {
                Text(text = "$numberOfNotification")
            }
        },

        ) {
        Box(
            modifier = modifier
                .border(1.dp, Tuatara15, RoundedCornerShape(12.dp))
        ) {
            Image(
                painterResource(R.drawable.notification),
                contentDescription = "Notification",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}