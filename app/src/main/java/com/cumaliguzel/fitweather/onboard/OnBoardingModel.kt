package com.cumaliguzel.fitweather.onboard
//This sealed class purpose :
//We  create as many objects as the number of pages it will consist of
import androidx.annotation.DrawableRes
import com.cumaliguzel.fitweather.R

sealed  class OnBoardingModel(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
//Create for data object
    data object  FirstPages : OnBoardingModel(
        image = R.drawable.onboarding_1,
        title = "What will you wear today?",
        description = "Do you sometimes wonder what to wear? Let us help you decide and make your day stress-free!"
    )
    data object SecondPages : OnBoardingModel(
        image = R.drawable.onboardin2,
        title = "Check the Weather, Pick Your Outfit",
        description = "Our app suggests the perfect outfit combinations based on the weather, so you can stay stylish and comfortable every day!"
    )
    data object ThirdPages : OnBoardingModel(
        image = R.drawable.onboarding_3,
        title = "We've Left a Link for You",
        description = "Easily access the outfits you like and similar items with a simple link, making shopping for your favorite pieces hassle-free"
    )
    data object ForthPages : OnBoardingModel(
        image = R.drawable.onboarding_4,
        title = "Let’s Start",
        description = "You’re ready to explore and start!Let's go"
    )

}