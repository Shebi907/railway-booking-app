package com.railway.booking.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trains")
data class TrainEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val trainNumber: String,
    val trainName: String,
    val source: String,
    val destination: String,
    val departureTime: String,
    val arrivalTime: String,
    val duration: String,
    val seatsAvailable: Int,
    val fare: Double,
    val date: String
)