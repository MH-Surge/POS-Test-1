package com.application.app.modules.onboardingone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowOnboardingOneBinding
import com.application.app.modules.onboardingone.`data`.model.OnboardingOneRowModel
import kotlin.Int
import kotlin.collections.List

class OnboardingOneAdapter(
  var list: List<OnboardingOneRowModel>
) : RecyclerView.Adapter<OnboardingOneAdapter.RowOnboardingOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOnboardingOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_onboarding_one,parent,false)
    return RowOnboardingOneVH(view)
  }

  override fun onBindViewHolder(holder: RowOnboardingOneVH, position: Int) {
    val onboardingOneRowModel = OnboardingOneRowModel()
    // TODO uncomment following line after integration with data source
    // val onboardingOneRowModel = list[position]
    holder.binding.onboardingOneRowModel = onboardingOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OnboardingOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: OnboardingOneRowModel
    ) {
    }
  }

  inner class RowOnboardingOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOnboardingOneBinding = RowOnboardingOneBinding.bind(itemView)
  }
}
