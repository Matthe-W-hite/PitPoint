package com.example.pitpoint.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pitpoint.ui.screens.issues.IssuesScreen
import com.example.pitpoint.ui.screens.login.LoginScreen
import com.example.pitpoint.ui.screens.map.MapScreen
import com.example.pitpoint.ui.screens.report.ReportIssueScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("map") {
            MapScreen(navController = navController)
        }
        composable("report_issue") {
            ReportIssueScreen(navController = navController)
        }
        composable("issues") {
            IssuesScreen(navController = navController)
        }
    }
} 