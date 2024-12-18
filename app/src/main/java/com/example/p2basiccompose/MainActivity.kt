package com.example.p2basiccompose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2basiccompose.ui.theme.P2BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 5.dp)
    ) {
        Text("Login",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Ini Halaman Login",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.padding(10.dp))

        Image(
            painter = painterResource(id = R.drawable.logou),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).size(250.dp)
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Nama",
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.padding(3.dp))

        Text(
            text = "Musthafa Luthfi",
            fontSize = 18.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "20220140201",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(15.dp))

        Image(
            painter = painterResource(id = R.drawable.pp),
            contentDescription = "",
            modifier = Modifier.clip(RoundedCornerShape(16.dp)).size(250.dp)
        )
        Spacer(modifier = Modifier.padding(10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2BasicComposeTheme {
        BasicColumn()
    }
}