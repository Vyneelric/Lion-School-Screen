package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.lionschool.R

@Composable
fun CoursesScreen(navegacao: NavHostController?){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 20.dp)
                .background(Color.Transparent),
            horizontalAlignment = Alignment.Start
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(bottom = 5.dp)
                    .background(color = Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Image(
                    modifier = Modifier
                        .height(100.dp)
                        .size(50.dp)
                    ,
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "",
                )
                Text(
                    text = stringResource(R.string.name_school_text),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }

            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFC23D)
                ),
                shape = CircleShape

            ){}

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(size = 8.dp),
                    value = "",
                    label = {
                        Text(
                            stringResource(
                                R.string.label_text_field
                            ),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFF9E9FA4)
                        )
                    },
                    onValueChange = {},
                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.lupa),
                            contentDescription = "",
                            tint = Color.Gray
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color(0xFFFFC23D),
                        unfocusedLabelColor = Color(0xFFFFC23D)
                    )
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.lista),
                    contentDescription = ""
                )
                Text(
                    text = stringResource(R.string.title_courses),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .background(Color.Transparent),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card(
                    modifier = Modifier
                        .height(209.dp)
                        .width(322.dp)
                        .border(BorderStroke(2.dp, color = Color(0xFFFFC23D))),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ){
                    Column(
                        modifier = Modifier
                            .height(209.dp)
                            .width(322.dp)
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(Color(0xFF3347B0),
                                        Color(0xFFCFD4EA)
                                    )
                                )
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                modifier = Modifier
                                    .size(130.dp)
                                    .padding(horizontal = 15.dp)
                                    .padding(top = 10.dp)
                                ,
                                painter = painterResource(R.drawable.ds),
                                contentDescription = "",
                            )
                            Text(
                                text = stringResource(R.string.acronym_ds),
                                fontSize = 64.sp,
                                fontWeight = FontWeight.W800,
                                color = Color(0xFFFFC23D)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 15.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.name_course_ds),
                                fontSize = 21.sp,
                                fontWeight = FontWeight.W800,
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Left
                            )
                            Text(
                                text = stringResource(R.string.desc_course_ds),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.W400,
                                color = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(
                                    modifier = Modifier
                                        .size(15.dp),
                                    painter = painterResource(R.drawable.relogio),
                                    contentDescription = ""
                                )
                                Text(
                                    text = stringResource(R.string.semesters),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W300,
                                    color = Color(0xFFFFFFFF),
                                    modifier = Modifier
                                        .padding(horizontal = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview

private fun CoursesScreenPreview(){
    CoursesScreen(navegacao = null)
}