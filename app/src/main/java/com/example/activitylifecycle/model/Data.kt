package com.example.activitylifecycle.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    var created_at: String?,
    var `data`: NotificationData?,
    var days_ago: String?,
    var id: String?,
    var notifiable_id: Int?,
    var notifiable_type: String?,
    var read_at: String?,
    var type: String?,
    var updated_at: String?,
): Parcelable