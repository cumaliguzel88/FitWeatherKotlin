package com.cumaliguzel.fitweather.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnBoardingGraphUI(onBoardingModel: OnBoardingModel) {

     Column(
         modifier = Modifier.fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
     ) {

         //add image first

         Image(
             painter = painterResource(id = onBoardingModel.image),
             contentDescription = "page image",
             modifier = Modifier.fillMaxWidth().padding(20.dp,0.dp)

         )
         Spacer(modifier = Modifier.size(70.dp))

         //title text

         Text(
             text = onBoardingModel.title,
             modifier = Modifier.fillMaxWidth(),
             fontSize = 20.sp,
             textAlign = TextAlign.Center,
             style = MaterialTheme.typography.titleLarge,
             color = MaterialTheme.colorScheme.onBackground
         )
         Spacer(modifier = Modifier.fillMaxWidth().size(15.dp))

         //description text

         Text(
             text = onBoardingModel.description,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(25.dp, 0.dp),
             fontSize = 16.sp,
             textAlign = TextAlign.Center,
             style = MaterialTheme.typography.bodySmall,
             color = MaterialTheme.colorScheme.onSurface,
         )
         Spacer(modifier = Modifier.fillMaxWidth().size(5.dp))
     }
}

//Preview part each pages u can see easily how it looks like :)

//First page preview
@Preview(showBackground = true)
@Composable
fun OnBoardingGraphUIPreview1() {
    OnBoardingGraphUI(onBoardingModel = OnBoardingModel.FirstPages)
}

//Second page preview
@Preview(showBackground = true)
@Composable
fun OnBoardingGraphUIPreview2() {
    OnBoardingGraphUI(onBoardingModel = OnBoardingModel.SecondPages)
}

//Third page preview
@Preview(showBackground = true)
@Composable
fun OnBoardingGraphUIPreview3() {
    OnBoardingGraphUI(onBoardingModel = OnBoardingModel.ThirdPages)
}

// Fourth preview
@Preview(showBackground = true)
@Composable
fun OnBoardingGraphUIPreview4() {
    OnBoardingGraphUI(onBoardingModel = OnBoardingModel.ForthPages)
}