package com.example.pollossilvermodulopedidos

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreen()
        }
    }
}

@Preview
@Composable
fun MyScreen() {
    val image: ImageBitmap = ImageBitmap
        .imageResource(R.drawable.logo)
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
            Cardd(productName = "Nombre del producto", price = "$9.99", image = image)
        }
    }
}

@Composable
fun Cardd(productName: String, price: String, image: ImageBitmap) {
    Card(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = productName,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = price,
                    style = TextStyle(fontWeight = FontWeight.ExtraBold),
                    modifier = Modifier.padding(top=40.dp)
                )
            }
            Image(
                bitmap = image,
                contentDescription = "Imagen del producto",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(100.dp)
            )
        }
    }
}






