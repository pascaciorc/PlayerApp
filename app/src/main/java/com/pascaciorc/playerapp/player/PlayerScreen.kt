package com.pascaciorc.playerapp.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pascaciorc.playerapp.R

@Composable
fun PlayerScreen() {
    Surface(color = Color(0xFF000000)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 40.dp, end = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.fallen),
                    contentDescription = "Album cover",
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_baseline_thumb_down),
                        contentDescription = "Thumb down"
                    )
                    Text(text = "Tourniquet", style = MaterialTheme.typography.h5, color = Color.White)
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_baseline_thumb_up),
                        contentDescription = "Thumb up"
                    )
                }
                Text(text = "Evanescence", style = MaterialTheme.typography.body1, color = Color.White)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Divider(
                    color = Color.DarkGray,
                    thickness = 3.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "0:00", color = Color.White)
                    Text(text = "3:17", color = Color.White)
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_shuffle),
                    contentDescription = "Shuffle",
                    modifier = Modifier.size(24.dp)
                )
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                    contentDescription = "Back",
                    modifier = Modifier.size(40.dp)
                )
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_play_circle),
                    contentDescription = "Play",
                    modifier = Modifier.size(72.dp)
                )
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_front),
                    contentDescription = "Next",
                    modifier = Modifier.size(40.dp)
                )
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_repeat),
                    contentDescription = "Repeat",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PlayerScreen()
}