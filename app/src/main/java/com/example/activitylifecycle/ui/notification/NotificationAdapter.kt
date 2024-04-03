package com.example.activitylifecycle.ui.notification

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.activitylifecycle.R
import com.example.activitylifecycle.base.BaseAdapterWithViewBinding
import com.example.activitylifecycle.databinding.ItemNotificationListBinding
import com.example.activitylifecycle.databinding.LayoutLoadingItemBinding
import com.example.activitylifecycle.model.Data

class NotificationAdapter(
    val notificationList: ArrayList<Data>,
    val notificationItemClick: (Data, Int) -> Unit
): BaseAdapterWithViewBinding(notificationList) {

    private lateinit var context: Context


    override fun getItemViewType(position: Int): Int =
        R.layout.item_notification_list

    override fun getViewBinding(viewType: Int, parent: ViewGroup): ViewBinding {
        context = parent.context
        return when (viewType) {
            R.layout.item_notification_list -> {
                ItemNotificationListBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }
            else -> {
                LayoutLoadingItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            }
        }
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        if (holder.itemViewType == R.layout.item_notification_list) {
            val binding = holder.binding as ItemNotificationListBinding
            val dataBean = notificationList[position]
            binding.apply {
                //-------Apply notification background tint according notification read/unread status-------//
                //-------If read at is notEmpty, that means notification is read else unread-------//

                binding.textViewNotificationTitle.text = dataBean.data?.title
                binding.textViewNotificationDescription.text = dataBean.data?.text

                //-------Highlight name(Comma separated) in notification description-------//

                textViewNotificationTime.text = dataBean.days_ago

            }

        }
    }

}