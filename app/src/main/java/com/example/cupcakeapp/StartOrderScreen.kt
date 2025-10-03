package com.example.cupcakeapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreenImage(modifier: Modifier = Modifier, onNext: ()->Unit = {}) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // image - placeholder: make sure to add an image resource named ic_cupcake in your drawable
            Card(shape = RoundedCornerShape(8.dp)) {
                Image(painter = painterResource(id = android.R.drawable.star_big_on),
                      contentDescription = "cupcake",
                      modifier = Modifier.size(120.dp))
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Orden de Cupcakes", )
        }
        // bottom container for actions
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Button(onClick = onNext) { Text("Siguiente") }
        }
    }
}
