package com.application.app.modules.iphone13promaxeighteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridgridBinding
import com.application.app.modules.iphone13promaxeighteen.`data`.model.GridgridRowModel
import kotlin.Int
import kotlin.collections.List

class GridgridAdapter(
  var list: List<GridgridRowModel>
) : RecyclerView.Adapter<GridgridAdapter.RowGridgridVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridgridVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridgrid,parent,false)
    return RowGridgridVH(view)
  }

  override fun onBindViewHolder(holder: RowGridgridVH, position: Int) {
    val gridgridRowModel = GridgridRowModel()
    // TODO uncomment following line after integration with data source
    // val gridgridRowModel = list[position]
    holder.binding.gridgridRowModel = gridgridRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridgridRowModel>) {
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
      item: GridgridRowModel
    ) {
    }
  }

  inner class RowGridgridVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridgridBinding = RowGridgridBinding.bind(itemView)
    init {
      binding.linearColumngrid.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridgridRowModel())
      }
    }
  }
}
