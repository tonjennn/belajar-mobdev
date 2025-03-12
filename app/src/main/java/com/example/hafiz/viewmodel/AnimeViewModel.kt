package com.example.hafiz.viewmodel

import androidx.lifecycle.ViewModel
import com.example.hafiz.model.Anime  // Hanya satu import Anime

class AnimeViewModel : ViewModel() {
    val animeList = listOf(
        Anime(
            title = "One Piece",
            genre = "Action, Adventure",
            rating = 9.0,
            imageUrl = "https://i.ibb.co.com/ZpH3f1kR/633ff1157e3fbc25557517c8-one-piece-poster-japanese-anime-posters.jpg"
        ),
        Anime(
            title = "Solo Leveling",
            genre = "Action, Fantasy",
            rating = 9.2,
            imageUrl = "https://upload.wikimedia.org/wikipedia/en/d/d2/Solo_Leveling_Anime_Poster.jpg"
        ),
        Anime(
            title = "Naruto",
            genre = "Action, Shounen",
            rating = 8.7,
            imageUrl = "https://upload.wikimedia.org/wikipedia/en/9/94/NarutoCoverTankobon1.jpg"
        ),
        Anime(
            title = "Boruto",
            genre = "Action, Adventure",
            rating = 7.5,
            imageUrl = "https://static.wikia.nocookie.net/naruto/images/0/0d/BorutoPart1AnimeDesign.png"
        ),
        Anime(
            title = "Kimetsu no Yaiba",
            genre = "Action, Supernatural",
            rating = 9.1,
            imageUrl = "https://upload.wikimedia.org/wikipedia/en/7/7f/Kimetsu_no_Yaiba%2C_Volume_1.jpg"
        )
    )
}
