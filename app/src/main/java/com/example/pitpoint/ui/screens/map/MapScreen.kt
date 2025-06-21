package com.example.pitpoint.ui.screens.map

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pitpoint.data.models.ServicePoint
import com.example.pitpoint.data.repository.ServicePointRepository
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.firestore.FirebaseFirestore
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(navController: NavController, servicePointRepository: ServicePointRepository = ServicePointRepository(FirebaseFirestore.getInstance())) {
    var servicePoints by remember { mutableStateOf<List<ServicePoint>>(emptyList()) }
    val warsaw = LatLng(52.2297, 21.0122)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(warsaw, 10f)
    }

    LaunchedEffect(Unit) {
        servicePointRepository.getServicePoints { points ->
            servicePoints = points
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            servicePoints.forEach { point ->
                Marker(
                    state = MarkerState(position = LatLng(point.latitude, point.longitude)),
                    title = point.name,
                    snippet = point.type
                )
            }
        }
        
        // Floating Action Buttons positioned on the left side
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FloatingActionButton(onClick = { navController.navigate("report_issue") }) {
                Icon(Icons.Default.Add, contentDescription = "Report Issue")
            }
            FloatingActionButton(onClick = { navController.navigate("issues") }) {
                Icon(Icons.AutoMirrored.Filled.List, contentDescription = "View Issues")
            }
        }
    }
} 