package com.example.lab4.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab4.data.model.PlaceCategory
import com.example.lab4.ui.components.PlaceCard
import com.example.lab4.ui.viewmodels.PlacesListViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlacesListScreen(
    category: PlaceCategory,
    onPlaceClick: (Int) -> Unit,
    onBackClick: () -> Unit,
    viewModel: PlacesListViewModel = viewModel()
) {
    val places by viewModel.places.collectAsState()

    var isInitialLoad by remember { mutableStateOf(true) }

    LaunchedEffect(category) {
        isInitialLoad = true
        viewModel.loadPlaces(category)
        isInitialLoad = false
    }

    if (isInitialLoad && places.isNotEmpty()) {
        CircularProgressIndicator()
    } else {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(category.title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 22.sp) },
                    navigationIcon = {
                        IconButton(onClick = onBackClick) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Назад")
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color(0XFF5E89C9),
                    )
                )
            }
        ) { padding ->
            LazyColumn(
                contentPadding = padding,
                modifier = Modifier.fillMaxSize()
            ) {
                items(places.size) { index ->
                    PlaceCard(
                        place = places[index],
                        onClick = { onPlaceClick(places[index].id) }
                    )
                }
            }
        }
    }
}