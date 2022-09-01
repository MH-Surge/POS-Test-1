package com.application.app.modules.addanewcategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridrectanglefifteenBinding
import com.application.app.modules.addanewcategory.`data`.model.GridrectanglefifteenRowModel
import kotlin.Int
import kotlin.collections.List

class GridrectanglefifteenAdapter(
  var list: List<GridrectanglefifteenRowModel>
) : RecyclerView.Adapter<GridrectanglefifteenAdapter.RowGridrectanglefifteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridrectanglefifteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridrectanglefifteen,parent,false)
    return RowGridrectanglefifteenVH(view)
  }

  override fun onBindViewHolder(holder: RowGridrectanglefifteenVH, position: Int) {
    val gridrectanglefifteenRowModel = GridrectanglefifteenRowModel()
    // TODO uncomment following line after integration with data source
    // val gridrectanglefifteenRowModel = list[position]
    holder.binding.gridrectanglefifteenRowModel = gridrectanglefifteenRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridrectanglefifteenRowModel>) {
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
      item: GridrectanglefifteenRowModel
    ) {
    }
  }

  inner class RowGridrectanglefifteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridrectanglefifteenBinding = RowGridrectanglefifteenBinding.bind(itemView)
  }
}
