package com.application.app.modules.iphone13promaxseventeen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgrid2Binding
import com.application.app.modules.iphone13promaxseventeen.`data`.model.Gridgrid2RowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<Gridgrid2RowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgrid2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgrid2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid2,parent,false)
    return RowGridgrid2VH(view)
  }

  override fun onBindViewHolder(holder: RowGridgrid2VH, position: Int) {
    val gridgrid2RowModel = Gridgrid2RowModel()
    // TODO uncomment following line after integration with data source
    // val gridgrid2RowModel = list[position]
    holder.binding.gridgrid2RowModel = gridgrid2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridgrid2RowModel>) {
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
      item: Gridgrid2RowModel
    ) {
    }
  }

  inner class RowGridgrid2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgrid2Binding = RowGridgrid2Binding.bind(itemView)
    init {
      binding.linearColumngrid.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridgrid2RowModel())
      }
    }
  }
}
