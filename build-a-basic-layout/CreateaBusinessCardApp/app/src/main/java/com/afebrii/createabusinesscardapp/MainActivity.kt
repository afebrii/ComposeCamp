package com.afebrii.createabusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afebrii.createabusinesscardapp.ui.theme.CreateABusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateABusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Background()
                }
            }
        }
    }
}

@Composable
fun Background() {
    Column(
        modifier = Modifier
            .background(Color(0xFFD2E7D4))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BusinessCard()
        Contact()
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8F),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(109.dp)
                .height(109.dp)
                .background(Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.name),
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(
            text = stringResource(R.string.android_developer),
            color = Color(0xFF4F6F52),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Contact() {
    Column(
        modifier = Modifier.padding(bottom = 24.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier
        ) {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = null,
                tint = Color(0xFF4F6F52),
                modifier = Modifier.padding(end = 8.dp)
                )
            Text(text = stringResource(R.string.telepon),
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = null,
                tint = Color(0xFF4F6F52),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.social_media_handle),
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = null,
                tint = Color(0xFF4F6F52),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = stringResource(R.string.email),
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun BusinessCardPreview() {
    CreateABusinessCardAppTheme {
        Background()
    }
}