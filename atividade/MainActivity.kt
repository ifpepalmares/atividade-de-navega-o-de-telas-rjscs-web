package com.example.inferno

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
import androidx.compose.ui.res.stringResource
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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        colorResource(R.color.darkBlue),
                        colorResource(R.color.darkerBlue)
                    )
                )
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(R.string.red_bull_title),
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.red_bull_slogan),
            color = colorResource(R.color.yellow),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
        )

        Text(
            text = stringResource(R.string.red_bull_sub),
            color = Color.LightGray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Button(
            onClick = {
                navController.navigate("screen_b/Max Verstappen")
            },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.red)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text(stringResource(R.string.btn_saber_mais), color = Color.White)
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
            text = stringResource(R.string.perfil_piloto),
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.verstappen),
            contentDescription = stringResource(R.string.foto_piloto),
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height (150.dp)
        )

        Text(
            text = stringResource(R.string.max_nome),
            color = (colorResource(R.color.yellow)),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = stringResource(R.string.max_equipe),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_numero),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_nacionalidade),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_idade),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_estreia_ano),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_estreia_equipe),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_estreia_numero),
            color = Color.White
        )

        Text(
            text = stringResource(R.string.max_titulos),
            color = Color.White
        )

        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.red)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text(stringResource(R.string.voltar), color = (colorResource(R.color.white)))
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
            text = stringResource(R.string.perfil_piloto),
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ricciardo),
            contentDescription = stringResource(R.string.foto_piloto),
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height (150.dp)
        )

        Text(
            text = stringResource(R.string.ricciardo_nome),
            color = (colorResource(R.color.yellow)),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(stringResource(R.string.ricciardo_equipe), color = Color.White)
        Text(stringResource(R.string.ricciardo_numero), color = Color.White)
        Text(stringResource(R.string.ricciardo_nacionalidade), color = Color.White)
        Text(stringResource(R.string.ricciardo_idade), color = Color.White)
        Text(stringResource(R.string.ricciardo_estreia_ano), color = Color.White)
        Text(stringResource(R.string.ricciardo_estreia_equipe), color = Color.White)
        Text(stringResource(R.string.ricciardo_estreia_numero), color = Color.White)
        Text(stringResource(R.string.ricciardo_titulos), color = Color.White)

        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.red)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text(stringResource(R.string.voltar), color = (colorResource(R.color.white)))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreenA() {
    ScreenA(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun PreviewScreenB(){
    ScreenB(
        navController = rememberNavController(),
        message = "Max Verstappen"
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewScreenC() {
    ScreenC(
        navController = rememberNavController(),
        message = "Daniel Ricciardo"
    )
}

