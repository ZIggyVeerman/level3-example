package com.example.reminderapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Reminder(
  val reminderText: String
) :Parcelable
