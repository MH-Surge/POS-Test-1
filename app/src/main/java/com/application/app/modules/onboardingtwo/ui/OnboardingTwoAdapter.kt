package com.application.app.modules.onboardingtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowOnboardingTwoBinding
import com.application.app.modules.onboardingtwo.`data`.model.OnboardingTwoRowModel
import kotlin.Int
import kotlin.collections.List

class OnboardingTwoAdapter(
  var list: List<OnboardingTwoRowModel>
) : RecyclerView.Adapter<OnboardingTwoAdapter.RowOnboardingTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOnboardingTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_onboarding_two,parent,false)
    return RowOnboardingTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowOnboardingTwoVH, position: Int) {
    val onboardingTwoRowModel = OnboardingTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val onboardingTwoRowModel = list[position]
    holder.binding.onboardingTwoRowModel = onboardingTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OnboardingTwoRowModel>) {
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
      item: OnboardingTwoRowModel
    ) {
    }
  }

  inner class RowOnboardingTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOnboardingTwoBinding = RowOnboardingTwoBinding.bind(itemView)
  }
}
