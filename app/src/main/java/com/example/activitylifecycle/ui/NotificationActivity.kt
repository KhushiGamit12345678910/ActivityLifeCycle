package com.example.activitylifecycle.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitylifecycle.R
import com.example.activitylifecycle.databinding.ActivityNotificationBinding
import com.example.activitylifecycle.model.Data
import com.example.activitylifecycle.ui.notification.NotificationAdapter

class NotificationActivity : AppCompatActivity() {
    lateinit var binding: ActivityNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val notificationList: ArrayList<Data> = arrayListOf()
        val notificationAdapter: NotificationAdapter by lazy {
            NotificationAdapter(
                notificationList = notificationList,
                notificationItemClick = ::notificationItemCLickCallback
            )
        }
        binding.recyclerViewNotification.adapter = notificationAdapter



    }

    private fun notificationItemCLickCallback(notificationDataBean: Data, position: Int){

    }
}