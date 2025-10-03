package com.example.cupcakeapp

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SelectQuantityButton(count: Int, onClick: ()->Unit) {
    Button(onClick = onClick) { Text("Cantidad: $count") }
}
