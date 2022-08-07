package com.aweirdtrashcan.musicplayer.models

import android.graphics.Bitmap

data class Song(
    val id: String,
    val name: String,
    val artistName: String,
    val albumName: String,
    val duration: String,
    val albumCover: Bitmap
)