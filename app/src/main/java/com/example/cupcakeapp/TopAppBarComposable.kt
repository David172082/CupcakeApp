package com.example.cupcakeapp

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CupcakeTopAppBar(title: String) {
    CenterAlignedTopAppBar(title = { Text(title) })
}
