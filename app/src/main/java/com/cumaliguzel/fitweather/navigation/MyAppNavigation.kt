package com.cumaliguzel.fitweather.navigation
import com.cumaliguzel.fitweather.pages.LoginPage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cumaliguzel.fitweather.pages.HomePage
import com.cumaliguzel.fitweather.pages.SignupPage
import com.cumaliguzel.fitweather.viewmodel.AuthViewModel
import com.cumaliguzel.fitweather.viewmodel.WeatherViewModel

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel,weatherViewModel: WeatherViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = "login", builder = {

        composable("login"){
            LoginPage(modifier,navController,authViewModel)
        }
        composable("signup"){
           SignupPage(modifier,navController,authViewModel)
        }
        composable("home"){
            HomePage(modifier,navController,authViewModel,weatherViewModel)
        }

    })


}