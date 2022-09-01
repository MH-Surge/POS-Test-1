package com.application.app.modules.iphone13promaxtwenty.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListrectanglefifteenTwo1Binding
import com.application.app.modules.iphone13promaxtwenty.`data`.model.ListrectanglefifteenTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefifteenTwoAdapter(
  var list: List<ListrectanglefifteenTwo1RowModel>
) : RecyclerView.Adapter<ListrectanglefifteenTwoAdapter.RowListrectanglefifteenTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefifteenTwo1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefifteen_two1,parent,false)
    return RowListrectanglefifteenTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefifteenTwo1VH, position: Int) {
    val listrectanglefifteenTwo1RowModel = ListrectanglefifteenTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefifteenTwo1RowModel = list[position]
    holder.binding.listrectanglefifteenTwo1RowModel = listrectanglefifteenTwo1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefifteenTwo1RowModel>) {
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
      item: ListrectanglefifteenTwo1RowModel
    ) {
    }
  }

  inner class RowListrectanglefifteenTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefifteenTwo1Binding =
        RowListrectanglefifteenTwo1Binding.bind(itemView)
  }
}
