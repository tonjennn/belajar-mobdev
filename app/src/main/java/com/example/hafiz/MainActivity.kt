package com.example.hafiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.hafiz.ui.theme.AnimeAppTheme // Pastikan ini dari package yang benar
import com.example.hafiz.screen.HomeScreen
import com.example.hafiz.viewmodel.AnimeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimeAppTheme { // Pastikan AnimeAppTheme adalah @Composable function tanpa parameter
                val animeViewModel: AnimeViewModel = viewModel()
                HomeScreen(viewModel = animeViewModel)
            }
        }
    }
}
