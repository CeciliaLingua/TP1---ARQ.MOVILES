package com.example.tp1_arqmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.tp1_arqmoviles.ui.theme.TP1ARQMOVILESTheme

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            TP1ARQMOVILESTheme {

                PantallaSecundaria(
                    volver = {
                        finish()
                    }
                )
            }
        }
    }
}

@Composable
fun PantallaSecundaria(volver: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Esta es la segunda pantalla",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(
            onClick = volver
        ) {
            Text("Volver")
        }
    }
}