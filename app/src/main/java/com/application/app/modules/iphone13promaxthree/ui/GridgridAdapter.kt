package com.application.app.modules.iphone13promaxthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgrid1Binding
import com.application.app.modules.iphone13promaxthree.`data`.model.Gridgrid1RowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<Gridgrid1RowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgrid1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgrid1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid1,parent,false)
    return RowGridgrid1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridgrid1VH, position: Int) {
    val gridgrid1RowModel = Gridgrid1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridgrid1RowModel = list[position]
    holder.binding.gridgrid1RowModel = gridgrid1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridgrid1RowModel>) {
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
      item: Gridgrid1RowModel
    ) {
    }
  }

  inner class RowGridgrid1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgrid1Binding = RowGridgrid1Binding.bind(itemView)
    init {
      binding.linearColumngrid.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridgrid1RowModel())
      }
    }
  }
}
