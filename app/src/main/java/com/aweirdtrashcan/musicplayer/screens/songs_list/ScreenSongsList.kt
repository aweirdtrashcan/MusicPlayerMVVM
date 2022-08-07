package com.aweirdtrashcan.musicplayer.screens.songs_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.aweirdtrashcan.musicplayer.screens.ui.theme.SpaceMedium
import com.aweirdtrashcan.musicplayer.screens.ui.theme.SpaceSmall
import com.aweirdtrashcan.musicplayer.R
import com.aweirdtrashcan.musicplayer.models.Song

@Composable
fun ScreenSongsList() {

    val songs = listOf<Song>()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(SpaceSmall)
    ) {
        Spacer(modifier = Modifier.height(SpaceMedium))
        Text(
            text = stringResource(id = R.string.welcome),
            style = MaterialTheme.typography.h2
        )
        Spacer(modifier = Modifier.height(SpaceMedium))
        LazyColumn {
            items(songs) { song ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(shape = RectangleShape, elevation = SpaceSmall)
                        .border(2.dp, Color.Black, RectangleShape)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.clickable {
                            // TODO: Play the card song
                        }
                    ) {
                        Image(
                            bitmap = ImageBitmap(
                                song.albumCover.width,
                                song.albumCover.height,
                                ImageBitmapConfig.Argb8888,
                                hasAlpha = false
                            ),
                            contentDescription = stringResource(id = R.string.album_cover_image)
                        )
                        Spacer(modifier = Modifier.width(SpaceSmall))
                        Column {
                            Text(
                                text = song.name,
                                style = MaterialTheme.typography.body1
                            )
                            Text(
                                text = song.artistName,
                                style = MaterialTheme.typography.body2
                            )
                        }
                        IconButton(onClick = {
                            // TODO: Play just a song
                        }) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = stringResource(id = R.string.play_arrow)
                            )
                        }
                    }
                }
            }
        }
        BottomNavigation(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}