package com.ungkritx.customtextlibrary

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CustomText(str:String) {
    Box(modifier = Modifier) {
        Text(str,color = Color.Red)
    }
}