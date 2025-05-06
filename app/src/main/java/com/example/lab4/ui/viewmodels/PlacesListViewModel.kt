package com.example.lab4.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab4.data.PlacesRepository
import com.example.lab4.data.model.Place
import com.example.lab4.data.model.PlaceCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PlacesListViewModel : ViewModel() {
    private val _places = MutableStateFlow<List<Place>>(emptyList())
    val places: StateFlow<List<Place>> = _places

    fun loadPlaces(category: PlaceCategory) {
        viewModelScope.launch {
            _places.value = PlacesRepository.getPlacesByCategory(category)
        }
    }
}