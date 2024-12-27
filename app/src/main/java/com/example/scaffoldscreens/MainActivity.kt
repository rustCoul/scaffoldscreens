package com.example.scaffoldscreens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.scaffoldscreens.screens.NavigationScreen
import com.example.scaffoldscreens.ui.theme.ScaffoldNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ScaffoldNavigationTheme {
                Scaffold { innerPadding ->
                    NavigationScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
