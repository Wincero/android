package com.example.lab4.data.model

data class Place(
    val id: Int,
    val name: String,
    val category: PlaceCategory,
    val description: String,
    val address: String,
    val workingHours: String,
    val imageRes: Int,
    val phone: String,
)