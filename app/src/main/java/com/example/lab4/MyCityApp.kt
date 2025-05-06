package com.example.lab4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab4.data.PlacesRepository
import com.example.lab4.ui.screens.*
import com.example.lab4.ui.viewmodels.NavigationViewModel
import com.example.lab4.ui.viewmodels.ScreenState

@Composable
fun MyCityApp() {
    val navViewModel: NavigationViewModel = viewModel()
    val currentScreen by navViewModel.currentScreen.collectAsState()

    when (val screen = currentScreen) {
        is ScreenState.Categories -> {
            CategoriesScreen(
                onCategoryClick = { category ->
                    navViewModel.navigateToPlacesList(category)
                }
            )
        }
        is ScreenState.PlacesList -> {
            PlacesListScreen(
                category = screen.category,
                onPlaceClick = { placeId ->
                    PlacesRepository.getPlaceById(placeId)?.let { place ->
                        navViewModel.navigateToPlaceDetails(place)
                    }
                },
                onBackClick = { navViewModel.onBack() }
            )
        }
        is ScreenState.PlaceDetails -> {
            PlaceDetailsScreen(
                place = screen.place,
                onBackClick = { navViewModel.onBack() }
            )
        }
    }
}