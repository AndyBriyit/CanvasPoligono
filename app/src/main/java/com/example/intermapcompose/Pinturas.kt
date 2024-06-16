package com.example.intermapcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Pinturas(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.painting),
            contentDescription = "Pinturas",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("SalaPinturas") }) {
            Text("Volver")
        }
    }
}

