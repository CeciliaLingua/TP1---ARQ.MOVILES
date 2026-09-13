package com.example.tp1_arqmoviles

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp1_arqmoviles.ui.theme.TP1ARQMOVILESTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            TP1ARQMOVILESTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    PantallaPrincipal(
                        modifier = Modifier.padding(innerPadding),
                        irASegundaPantalla = {
                            val intent = Intent(this, SecondActivity::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun PantallaPrincipal(
    modifier: Modifier = Modifier,
    irASegundaPantalla: () -> Unit
) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Hola Mundo",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(
            onClick = irASegundaPantalla
        ) {
            Text("Ir a segunda pantalla")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaPrincipalPreview() {

    TP1ARQMOVILESTheme {
        PantallaPrincipal(
            irASegundaPantalla = {}
        )
    }
}