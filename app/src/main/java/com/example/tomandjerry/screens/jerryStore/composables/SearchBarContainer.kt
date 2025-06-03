package com.example.tomandjerry.screens.jerryStore.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Delta
import com.example.tomandjerry.ui.theme.NightRider
import com.example.tomandjerry.ui.theme.OsloGray
import com.example.tomandjerry.ui.theme.VeniceBlue
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun SearchBarContainer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        SearchBar(modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.padding(start = 8.dp))
        FilterIcon()
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier
            .fillMaxSize()
            .background(White, RoundedCornerShape(12.dp))
            .border(1.dp, Delta.copy(alpha = 0.08f), RoundedCornerShape(12.dp)),
        singleLine = true,
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = White,
            focusedContainerColor = White,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(12.dp),
        leadingIcon = {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .padding(start = 0.dp),
                contentDescription = "Search Icon",
                painter = painterResource(R.drawable.search_icon)
            )
        },
        placeholder = {
            Text(
                text = "Search about tom ...",
                color = OsloGray,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 0.dp),
                style = LocalTextStyle.current.copy(
                    lineHeight = 20.sp
                )
            )
        }
    )
}

@Composable
fun FilterIcon(modifier: Modifier = Modifier) {
    IconButton(
        onClick = {},
        modifier = modifier
            .size(48.dp)
            .background(
                color = VeniceBlue,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Icon(
            painterResource(R.drawable.filter_icon),
            contentDescription = "Filter Icon",
            modifier = Modifier.size(24.dp),
            tint = White
        )
    }
}