package com.application.app.modules.iphone13promaxthirteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgrid4Binding
import com.application.app.modules.iphone13promaxthirteen.`data`.model.Gridgrid4RowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<Gridgrid4RowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgrid4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgrid4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid4,parent,false)
    return RowGridgrid4VH(view)
  }

  override fun onBindViewHolder(holder: RowGridgrid4VH, position: Int) {
    val gridgrid4RowModel = Gridgrid4RowModel()
    // TODO uncomment following line after integration with data source
    // val gridgrid4RowModel = list[position]
    holder.binding.gridgrid4RowModel = gridgrid4RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridgrid4RowModel>) {
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
      item: Gridgrid4RowModel
    ) {
    }
  }

  inner class RowGridgrid4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgrid4Binding = RowGridgrid4Binding.bind(itemView)
    init {
      binding.linearColumngrid.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridgrid4RowModel())
      }
    }
  }
}
