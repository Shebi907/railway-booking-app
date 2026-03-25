package com.railway.booking.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "bookings",
    foreignKeys = [
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class BookingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userId: Int,
    val trainId: Int,
    val trainNumber: String,
    val trainName: String,
    val passengerName: String,
    val passengerAge: Int,
    val seatType: String = "General",
    val source: String,
    val destination: String,
    val travelDate: String,
    val bookingDate: Long = System.currentTimeMillis(),
    val fare: Double,
    val status: String = "Confirmed"
)