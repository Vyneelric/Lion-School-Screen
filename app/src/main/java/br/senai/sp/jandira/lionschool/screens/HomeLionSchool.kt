package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreenLionSchool(navegacao: NavHostController?){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .padding(top = 40.dp)
                    .background(color = Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    modifier = Modifier
                        .size(200.dp)
                        .padding(horizontal = 15.dp)
                    ,
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "",
                    )
                Text(
                    text = stringResource(R.string.name_school),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
            }

            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(350.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = stringResource(R.string.subtitle),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0),
                    modifier = Modifier
                        .padding(bottom = 10.dp, top = 90.dp)
                )

                Card(
                    modifier = Modifier
                        .height(6.dp)
                        .width(70.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    shape = CircleShape

                ){}

                Text(
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .padding(horizontal = 20.dp),
                    text = stringResource(R.string.desc),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0xFF9E9FA4),
                    textAlign = TextAlign.Center
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                horizontalArrangement = Arrangement.Center
            ){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(280.dp)
                        .height(48.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFF3347B0)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.text_button),
                        color = Color(0xFF3347B0),
                        fontSize = 16.sp,
                        )
                }
            }

            Row(
                modifier = Modifier
                    .width(320.dp)
                    .background(Color.Transparent)
                    .padding(top = 115.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Image(
                    modifier = Modifier
                        .size(33.dp)
                    ,
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier
                        .size(33.dp)
                    ,
                    painter = painterResource(R.drawable.twitter),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier
                        .size(33.dp)
                    ,
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = "",
                )
                Image(
                    modifier = Modifier
                        .size(33.dp)
                    ,
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = "",
                )
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenLionSchoolPreview(){
    HomeScreenLionSchool(navegacao = null)
}