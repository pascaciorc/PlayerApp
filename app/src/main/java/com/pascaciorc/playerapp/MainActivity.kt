package com.pascaciorc.playerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pascaciorc.playerapp.player.PlayerScreen
import com.pascaciorc.playerapp.ui.theme.PlayerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayerAppTheme {
                PlayerApp()
            }
        }
    }
}

@Composable
fun PlayerApp() {
    PlayerScreen()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlayerAppTheme {
        PlayerApp()
    }
}