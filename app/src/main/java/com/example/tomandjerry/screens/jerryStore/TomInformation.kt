package com.example.tomandjerry.screens.jerryStore

data class TomInformation(
    val tomName: String,
    val tomDescription: String,
    val tomOldPrice: String = "0",
    val tomNewPrice: String,
    val tomImage: Int,
)
