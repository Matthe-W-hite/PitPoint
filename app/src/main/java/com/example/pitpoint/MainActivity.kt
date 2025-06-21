package com.example.pitpoint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pitpoint.ui.navigation.NavGraph
import com.example.pitpoint.ui.theme.PitPointTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PitPointTheme {
                NavGraph()
            }
        }
    }
} 