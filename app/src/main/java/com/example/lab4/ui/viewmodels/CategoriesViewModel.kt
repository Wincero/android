package com.example.lab4.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab4.data.PlacesRepository
import com.example.lab4.data.model.PlaceCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CategoriesViewModel : ViewModel() {
    private val _categories = MutableStateFlow<List<PlaceCategory>>(emptyList())
    val categories: StateFlow<List<PlaceCategory>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
        viewModelScope.launch {
            _categories.value = PlacesRepository.getCategories()
        }
    }
}