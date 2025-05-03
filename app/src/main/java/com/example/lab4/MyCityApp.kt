package com.example.lab4

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lab4.data.PlacesRepository
import com.example.lab4.data.model.PlaceCategory
import com.example.lab4.ui.navigation.Screen
import com.example.lab4.ui.screens.*

@Composable
fun MyCityApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Categories.route
    ) {
        composable(Screen.Categories.route) {
            CategoriesScreen(
                onCategoryClick = { category ->
                    navController.navigate(Screen.PlacesList.createRoute(category))
                }
            )
        }
        composable(
            route = Screen.PlacesList.route,
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = enumValueOf<PlaceCategory>(
                backStackEntry.arguments?.getString("category")!!
            )
            PlacesListScreen(
                category = category,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetails.createRoute(placeId))
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable(
            route = Screen.PlaceDetails.route,
            arguments = listOf(navArgument("placeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getInt("placeId")!!
            val place = PlacesRepository.getPlaceById(placeId)

            if (place != null) {
                PlaceDetailsScreen(
                    place = place,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}