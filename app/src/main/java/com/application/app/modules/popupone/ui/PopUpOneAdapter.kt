package com.application.app.modules.popupone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowPopUpOneBinding
import com.application.app.modules.popupone.`data`.model.PopUpOneRowModel
import kotlin.Int
import kotlin.collections.List

class PopUpOneAdapter(
  var list: List<PopUpOneRowModel>
) : RecyclerView.Adapter<PopUpOneAdapter.RowPopUpOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPopUpOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pop_up_one,parent,false)
    return RowPopUpOneVH(view)
  }

  override fun onBindViewHolder(holder: RowPopUpOneVH, position: Int) {
    val popUpOneRowModel = PopUpOneRowModel()
    // TODO uncomment following line after integration with data source
    // val popUpOneRowModel = list[position]
    holder.binding.popUpOneRowModel = popUpOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PopUpOneRowModel>) {
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
      item: PopUpOneRowModel
    ) {
    }
  }

  inner class RowPopUpOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPopUpOneBinding = RowPopUpOneBinding.bind(itemView)
  }
}
