package com.example.carterinha_digital_senai

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carterinha_digital_senai.ui.theme.CarterinhadigitalsenaiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarterinhadigitalsenaiTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(
                            R.drawable.fundo_cardeirinha
                        ),
                        contentDescription = ""
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxSize()
                    ) {

                        Logo()
                        Centro()
                        Rodape()
                    }

                }


            }
        }
    }
}

@Composable
fun Logo() {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .width(200.dp),
            painter = painterResource(
                R.drawable.logo_senai
            ),
            contentDescription = null
        )
    }

}

@Composable
fun Centro() {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.height(600.dp)
    ){
        Text(
            "Gabriel Galhiardo Farina",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color(0xFFFFFFFF),
            lineHeight = 45.sp,
            fontFamily = FontFamily.Serif
        )
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(1000.dp))
                .size(250.dp),
            painter = painterResource(
                R.drawable.perfil
            ),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .size(250.dp),
            painter = painterResource(
                R.drawable.qr_code
            ),
            contentDescription = null
        )


    }
}

@Composable
fun Rodape(){
    Column (
        modifier = Modifier .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically){
            Texto("Senai Anchieta")
            Texto("23/07/2006")
        }

        Row (horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically){
            Texto("3-DEV-A")
            Texto("31/12/2025")
        }
    }
}

@Composable
fun Texto(texto: String){
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(12))
            .background(color = Color(0xD75B2424))
            .width(150.dp)
            .height(60.dp)
            .border(2.dp, color = Color(0xD7C91B1B))
    ) {
        Text(
            texto,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color(0xFFFFFFFF),
            lineHeight = 20.sp,
            fontFamily = FontFamily.Serif,


        )
    }
}