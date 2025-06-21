package com.example.pitpoint.data.models

import com.google.android.gms.maps.model.LatLng

data class ServicePoint(
    val id: String = "",
    val name: String = "",
    val type: String = "WORKSHOP", // WORKSHOP, GAS_STATION, TIRE_SERVICE
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val address: String = ""
) {
    val location: LatLng
        get() = LatLng(latitude, longitude)
}

enum class ServiceType {
    WORKSHOP,
    GAS_STATION,
    TIRE_SERVICE,
    ROAD_ASSISTANCE
} 