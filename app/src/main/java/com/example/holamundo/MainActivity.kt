package com.example.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.holamundo.ui.theme.HOLAMUNDOTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HOLAMUNDOTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Surface(
                        modifier = Modifier,
                        color = Color.Red
                    ) {
                        Greeting("Android")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
    ) {
        Text(text = "¡Hola Mundo, soy Juan Delgado y esta es mi app!", modifier = modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HOLAMUNDOTheme {
        Greeting("Android")
    }
}

