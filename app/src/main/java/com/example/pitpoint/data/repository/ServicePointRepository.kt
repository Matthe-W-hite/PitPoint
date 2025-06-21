package com.example.pitpoint.data.repository

import com.example.pitpoint.data.models.ServicePoint
import com.google.firebase.firestore.FirebaseFirestore

class ServicePointRepository(private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()) {

    private val pointsCollection = firestore.collection("service_points")

    fun getServicePoints(callback: (List<ServicePoint>) -> Unit) {
        pointsCollection.get()
            .addOnSuccessListener { result ->
                val points = result.toObjects(ServicePoint::class.java)
                callback(points)
            }
            .addOnFailureListener {
                callback(emptyList())
            }
    }
}