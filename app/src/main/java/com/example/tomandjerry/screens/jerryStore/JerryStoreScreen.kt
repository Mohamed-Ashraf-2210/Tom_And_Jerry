package com.example.tomandjerry.screens.jerryStore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.RunApp
import com.example.tomandjerry.screens.jerryStore.composables.AppBar
import com.example.tomandjerry.screens.jerryStore.composables.CheapTom
import com.example.tomandjerry.screens.jerryStore.composables.PromotionBanner
import com.example.tomandjerry.screens.jerryStore.composables.SearchBarContainer
import com.example.tomandjerry.ui.theme.AquaHaze
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun JerryStoreScreen() {
    Column(
        modifier = Modifier
            .background(color = AquaHaze)
            .padding(horizontal = 16.dp)
            //.padding(top = 12.dp)
    ) {
        AppBar(name = "Jerry")
        Spacer(modifier = Modifier.height(12.dp))
        SearchBarContainer()
        Spacer(modifier = Modifier.height(8.dp))
        PromotionBanner()
        Spacer(modifier = Modifier.height(24.dp))
        CheapTom()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JerryStorePreview() {
    TomAndJerryTheme {
        RunApp()
    }
}