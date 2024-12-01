package com.cumaliguzel.fitweather

import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.cumaliguzel.fitweather.navigation.MyAppNavigation
import com.cumaliguzel.fitweather.onboard.OnBoardingUtils
import com.cumaliguzel.fitweather.onboard.OnboardingScreen
import com.cumaliguzel.fitweather.ui.theme.FitWeatherTheme
import com.cumaliguzel.fitweather.viewmodel.AuthViewModel
import com.cumaliguzel.fitweather.viewmodel.WeatherViewModel
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val onBoardingUtils by lazy { OnBoardingUtils(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authViewModel : AuthViewModel by viewModels()
        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        setContent {
            FitWeatherTheme {
              MainContent()
            }

        }

    }
    @Composable
    fun ShowOnboardingScreen(onFinished: () -> Unit) {
        val context = LocalContext.current
        Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
            OnboardingScreen {
                onFinished()
            }
        }
    }

     @Composable
     fun MainContent(){
         var isOnboardingCompleted by remember { mutableStateOf(onBoardingUtils.isOnboardingCompleted()) }
         if(isOnboardingCompleted) {
             MyAppNavigation(authViewModel = AuthViewModel(),weatherViewModel = WeatherViewModel())
         }else{
             ShowOnboardingScreen{
                 onBoardingUtils.setOnboardingCompleted()
                 isOnboardingCompleted = true
             }
         }
     }

}






