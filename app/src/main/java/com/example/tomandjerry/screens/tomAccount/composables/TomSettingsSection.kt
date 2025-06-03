package com.example.tomandjerry.screens.tomAccount.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.Tuatara
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun SettingsSection(title: String, icons: List<Int>, texts: List<String>) {
    Column {
        Text(
            text = title,
            color = Tuatara.copy(alpha = 0.8f),
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))
        for (i in icons.indices) {
            CardIconWithText(icon = icons[i], text = texts[i])
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}