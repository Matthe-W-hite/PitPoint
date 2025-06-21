package com.example.pitpoint.ui.screens.report

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pitpoint.data.models.IssueReport
import com.example.pitpoint.data.repository.IssueReportRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportIssueScreen(navController: NavController, issueReportRepository: IssueReportRepository = IssueReportRepository(FirebaseFirestore.getInstance())) {
    var description by remember { mutableStateOf("") }
    val context = LocalContext.current
    val userId = FirebaseAuth.getInstance().currentUser?.uid

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Zgłoś problem") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("map") }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Powrót do mapy")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = description,
                onValueChange = { description = it },
                label = { Text("Describe the issue") },
                modifier = Modifier.fillMaxWidth().height(150.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    if (description.isNotEmpty() && userId != null) {
                        val report = IssueReport(
                            description = description,
                            userId = userId,
                            latitude = 52.2297, // Hardcoded for simplicity
                            longitude = 21.0122 // Hardcoded for simplicity
                        )
                        issueReportRepository.addIssueReport(report) { success, message ->
                            if (success) {
                                navController.navigate("map")
                            } else {
                                // Handle error, e.g., show a Toast
                            }
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Submit Report")
            }
        }
    }
} 