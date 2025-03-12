package com.example.animeapp.ui.component


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.hafiz.model.Anime
import com.example.animeapp.ui.component.AnimeList


@Composable
fun AnimeItem(anime: Anime) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { /* Bisa tambahkan detail screen */ },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            AsyncImage(
                model = anime.imageUrl,
                contentDescription = anime.title,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(text = anime.title, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = "Genre: ${anime.genre}", fontSize = 14.sp, color = Color.Gray)
                Text(text = "Rating: ${anime.rating}", fontSize = 14.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Composable
fun AnimeList(animeList: List<Anime>) {
    Column {
        animeList.forEach { anime ->
            AnimeItem(anime)
        }
    }
}
