package com.application.app.modules.iphone13promaxthreeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgrid3Binding
import com.application.app.modules.iphone13promaxthreeone.`data`.model.Gridgrid3RowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<Gridgrid3RowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgrid3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgrid3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid3,parent,false)
    return RowGridgrid3VH(view)
  }

  override fun onBindViewHolder(holder: RowGridgrid3VH, position: Int) {
    val gridgrid3RowModel = Gridgrid3RowModel()
    // TODO uncomment following line after integration with data source
    // val gridgrid3RowModel = list[position]
    holder.binding.gridgrid3RowModel = gridgrid3RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridgrid3RowModel>) {
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
      item: Gridgrid3RowModel
    ) {
    }
  }

  inner class RowGridgrid3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgrid3Binding = RowGridgrid3Binding.bind(itemView)
  }
}
