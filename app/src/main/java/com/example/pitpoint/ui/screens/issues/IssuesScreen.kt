package com.example.pitpoint.ui.screens.issues

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pitpoint.data.models.IssueReport
import com.example.pitpoint.data.repository.IssueReportRepository
import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen(navController: NavController, issueReportRepository: IssueReportRepository = IssueReportRepository(FirebaseFirestore.getInstance())) {
    var issues by remember { mutableStateOf<List<IssueReport>>(emptyList()) }

    LaunchedEffect(Unit) {
        issueReportRepository.getIssueReports { reports ->
            issues = reports
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista zgłoszeń") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("map") }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Powrót do mapy")
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(issues) { issue ->
                Card(modifier = Modifier.padding(bottom = 8.dp)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "User: ${issue.userId}")
                        Text(text = "Description: ${issue.description}")
                        Text(text = "Location: (${issue.latitude}, ${issue.longitude})")
                    }
                }
            }
        }
    }
} 