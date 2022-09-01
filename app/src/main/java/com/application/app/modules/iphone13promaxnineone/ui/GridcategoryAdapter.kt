package com.application.app.modules.iphone13promaxnineone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridcategoryBinding
import com.application.app.modules.iphone13promaxnineone.`data`.model.GridcategoryRowModel
import kotlin.Int
import kotlin.collections.List

class GridcategoryAdapter(
  var list: List<GridcategoryRowModel>
) : RecyclerView.Adapter<GridcategoryAdapter.RowGridcategoryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcategoryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcategory,parent,false)
    return RowGridcategoryVH(view)
  }

  override fun onBindViewHolder(holder: RowGridcategoryVH, position: Int) {
    val gridcategoryRowModel = GridcategoryRowModel()
    // TODO uncomment following line after integration with data source
    // val gridcategoryRowModel = list[position]
    holder.binding.gridcategoryRowModel = gridcategoryRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridcategoryRowModel>) {
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
      item: GridcategoryRowModel
    ) {
    }
  }

  inner class RowGridcategoryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcategoryBinding = RowGridcategoryBinding.bind(itemView)
  }
}
