package com.application.app.modules.iphone13promaxseventwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgrid5Binding
import com.application.app.modules.iphone13promaxseventwo.`data`.model.Gridgrid5RowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<Gridgrid5RowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgrid5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgrid5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid5,parent,false)
    return RowGridgrid5VH(view)
  }

  override fun onBindViewHolder(holder: RowGridgrid5VH, position: Int) {
    val gridgrid5RowModel = Gridgrid5RowModel()
    // TODO uncomment following line after integration with data source
    // val gridgrid5RowModel = list[position]
    holder.binding.gridgrid5RowModel = gridgrid5RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridgrid5RowModel>) {
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
      item: Gridgrid5RowModel
    ) {
    }
  }

  inner class RowGridgrid5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgrid5Binding = RowGridgrid5Binding.bind(itemView)
  }
}
