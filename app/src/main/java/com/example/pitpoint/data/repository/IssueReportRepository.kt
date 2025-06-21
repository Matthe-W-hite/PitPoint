package com.example.pitpoint.data.repository

import com.example.pitpoint.data.models.IssueReport
import com.google.firebase.firestore.FirebaseFirestore

class IssueReportRepository(private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()) {

    private val issuesCollection = firestore.collection("issue_reports")

    fun addIssueReport(report: IssueReport, callback: (Boolean, String?) -> Unit) {
        issuesCollection.add(report)
            .addOnSuccessListener {
                callback(true, null)
            }
            .addOnFailureListener { e ->
                callback(false, e.message)
            }
    }

    fun getIssueReports(callback: (List<IssueReport>) -> Unit) {
        issuesCollection.orderBy("timestamp").get()
            .addOnSuccessListener { result ->
                val reports = result.toObjects(IssueReport::class.java)
                callback(reports)
            }
            .addOnFailureListener {
                // Handle error, maybe return empty list
                callback(emptyList())
            }
    }
} 