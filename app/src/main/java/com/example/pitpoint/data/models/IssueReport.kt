package com.example.pitpoint.data.models

import com.google.android.gms.maps.model.LatLng

data class IssueReport(
    val id: String = "",
    val description: String = "",
    val userId: String = "",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val timestamp: Long = System.currentTimeMillis()
) {
    val location: LatLng
        get() = LatLng(latitude, longitude)
}

enum class IssueStatus {
    OPEN,
    IN_PROGRESS,
    RESOLVED,
    CLOSED
} 