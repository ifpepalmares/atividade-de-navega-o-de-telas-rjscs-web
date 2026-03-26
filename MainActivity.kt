package com.example.mojodojocasahousedary


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}


@Composable
fun AppNavigation() {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = "screen_a") {


        composable("screen_a") {
            ScreenA(navController)
        }


        composable("screen_b/{message}") { backStackEntry ->
            val message = backStackEntry.arguments?.getString("message")
            ScreenB(navController, message)
        }
    }
}


@Composable
fun ScreenA(navController: NavController) {
    val darkBlue = Color(0xFF0A1A2F)
    val darkerBlue = Color (0xFF02060D)
    val red = Color(0xFFD50000)
    val yellow = Color(0xFFFFC400)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(darkBlue, darkerBlue)
                )
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "RED BULL RACING",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )


        Text(
            text = "RedBull Gives You Wings",
            color = yellow,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
        )


        Text(
            text = "Simply Lovely",
            color = Color.LightGray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )


        Button(
            onClick = {
                navController.navigate("screen_b/Max Verstappen")
            },
            colors = ButtonDefaults.buttonColors(containerColor = red),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text("SABER MAIS", color = Color.White)
        }
    }
}


@Composable
fun ScreenB(navController: NavController, message: String?) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.darkBlue))
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Text(
            text = "Perfil do Piloto",
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.verstappen),
            contentDescription = "Foto do piloto",
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height (150.dp)
        )


        Text(
            text = "Max Verstappen",
            color = (colorResource(R.color.yellow)),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )


        Text(
            text = "Equipe atual: Red Bull Racing",
            color = Color.White
        )


        Text(
            text = "Número: 1",
            color = Color.White
        )


        Text(
            text = "Nacionalidade: Holanda",
            color = Color.White
        )


        Text(
            text = "Idade: 28 anos",
            color = Color.White
        )


        Text(
            text = "Ano de estreia: 2015",
            color = Color.White
        )


        Text(
            text = "Equipe de estreia: Toro Rosso",
            color = Color.White
        )

        Text(
            text = "Número de estreia: 33",
            color = Color.White
        )


        Text(
            text = "Tetracampeão mundial",
            color = Color.White
        )


        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.red)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text("VOLTAR", color = (colorResource(R.color.white)))
        }
    }
}

@Composable
fun ScreenC(navController: NavController, message: String?) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.darkBlue))
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Text(
            text = "Perfil do Piloto",
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.ricciardo),
            contentDescription = "Foto do piloto",
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height (150.dp)
        )


        Text(
            text = "Daniel Ricciardo",
            color = (colorResource(R.color.yellow)),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )


        Text(
            text = "Equipe atual: Red Bull Racing",
            color = Color.White
        )


        Text(
            text = "Número: 3",
            color = Color.White
        )


        Text(
            text = "Nacionalidade: Australia",
            color = Color.White
        )


        Text(
            text = "Idade: 36 anos",
            color = Color.White
        )


        Text(
            text = "Ano de estreia: 2011",
            color = Color.White
        )


        Text(
            text = "Equipe de estreia: HRT F1 Team",
            color = Color.White
        )

        Text(
            text = "Número de estreia: 3",
            color = Color.White
        )


        Text(
            text = "8 vitórias, 0 campeonatos mundiais",
            color = Color.White
        )


        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.red)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text("VOLTAR", color = (colorResource(R.color.white)))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewScreenA() {
    ScreenA(navController =
        rememberNavController())
}


@Preview(showBackground = true)
@Composable
fun PreviewScreenB(){
    ScreenB(navController =
        rememberNavController(),
        message = "Max Verstappen"
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewScreenC() {
    ScreenC(
        navController =
            rememberNavController(),
        message = "Daniel Ricciardo"
    )
}
