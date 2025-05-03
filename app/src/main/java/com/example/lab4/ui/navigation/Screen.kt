package com.example.lab4.ui.navigation

import com.example.lab4.data.model.PlaceCategory

sealed class Screen(val route: String) {
    object Categories : Screen("categories")
    object PlacesList : Screen("places_list/{category}") {
        fun createRoute(category: PlaceCategory) = "places_list/${category.name}"
    }
    object PlaceDetails : Screen("place_details/{placeId}") {
        fun createRoute(placeId: Int) = "place_details/$placeId"
    }
}