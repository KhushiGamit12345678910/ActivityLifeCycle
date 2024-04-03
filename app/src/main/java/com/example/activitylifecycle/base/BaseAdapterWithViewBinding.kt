package com.example.activitylifecycle.base

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 *Created by Parth Patel on 20,January,2023
 *Excellent WebWorld
 *parth.patel.eww@gmail.com
 */

abstract class BaseAdapterWithViewBinding(private val items: ArrayList<out Any?>) :
    RecyclerView.Adapter<BaseAdapterWithViewBinding.ItemViewHolder>() {

    protected abstract fun getViewBinding(viewType: Int, parent: ViewGroup): ViewBinding

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ItemViewHolder(getViewBinding(viewType, parent))

    class ItemViewHolder(val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root)
}