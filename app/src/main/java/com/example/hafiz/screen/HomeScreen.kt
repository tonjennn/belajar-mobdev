package com.example.hafiz.screen

import androidx.compose.material3.Typography
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.animeapp.ui.component.AnimeList
import com.example.hafiz.viewmodel.AnimeViewModel
@Composable
fun HomeScreen(viewModel: AnimeViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Rekomendasi Anime 2025", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(12.dp))
        AnimeList(animeList = viewModel.animeList)
    }
}
