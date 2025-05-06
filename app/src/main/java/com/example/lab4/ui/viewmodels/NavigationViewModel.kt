package com.example.lab4.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab4.data.model.Place
import com.example.lab4.data.model.PlaceCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

sealed class ScreenState {
    object Categories : ScreenState()
    data class PlacesList(val category: PlaceCategory) : ScreenState()
    data class PlaceDetails(val place: Place) : ScreenState()
}

class NavigationViewModel : ViewModel() {
    private val _currentScreen = MutableStateFlow<ScreenState>(ScreenState.Categories)
    val currentScreen: StateFlow<ScreenState> = _currentScreen

    fun navigateToPlacesList(category: PlaceCategory) {
        viewModelScope.launch {
            _currentScreen.value = ScreenState.PlacesList(category)
        }
    }

    fun navigateToPlaceDetails(place: Place) {
        viewModelScope.launch {
            _currentScreen.value = ScreenState.PlaceDetails(place)
        }
    }

    fun onBack() {
        viewModelScope.launch {
            _currentScreen.value = when (val current = _currentScreen.value) {
                is ScreenState.PlaceDetails -> ScreenState.PlacesList(current.place.category)
                is ScreenState.PlacesList -> ScreenState.Categories
                ScreenState.Categories -> ScreenState.Categories
            }
        }
    }
}