package com.example.activitylifecycle.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NotificationData(
    var booking_id: Int?,
    var name: String?,
    var redirection_type: String?,
    var text: String?="yutiytoiyutiouyoiyouipyuopo[pi[upi[u",
    var title: String?= "gfhdjg",
    var type: String?,
): Parcelable