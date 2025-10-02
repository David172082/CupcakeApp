package com.example.cupcakeapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreenCentered(modifier: Modifier = Modifier, onNext: ()->Unit = {}) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Start your order")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNext) { Text("Next") }
    }
}
