package com.example.cupcakeapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreenWithOptions(quantityOptions: List<Int>, onNext: ()->Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Elige la cantidad:")
        Spacer(modifier = Modifier.height(12.dp))
        for (q in quantityOptions) { Text("- $q") }
        Spacer(modifier = Modifier.height(16.dp))
    }
}
