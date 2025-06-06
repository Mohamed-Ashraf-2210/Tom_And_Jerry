package com.example.tomandjerry

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tomandjerry.screens.jerryStore.JerryStoreScreen
import com.example.tomandjerry.screens.secretEpisode.SecretEpisode
import com.example.tomandjerry.screens.tomAccount.TomAccountScreen
import com.example.tomandjerry.screens.tomKitchen.TomKitchenScreen

@Composable
fun RunApp() {
    Scaffold() { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ) {
            //JerryStoreScreen()
            TomKitchenScreen()
            //TomAccountScreen()
            //SecretEpisode()
        }
    }
}