package com.application.app.modules.iphone13promaxfourone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListserverBinding
import com.application.app.modules.iphone13promaxfourone.`data`.model.ListserverRowModel
import kotlin.Int
import kotlin.collections.List

class ListserverAdapter(
  var list: List<ListserverRowModel>
) : RecyclerView.Adapter<ListserverAdapter.RowListserverVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListserverVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listserver,parent,false)
    return RowListserverVH(view)
  }

  override fun onBindViewHolder(holder: RowListserverVH, position: Int) {
    val listserverRowModel = ListserverRowModel()
    // TODO uncomment following line after integration with data source
    // val listserverRowModel = list[position]
    holder.binding.listserverRowModel = listserverRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListserverRowModel>) {
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
      item: ListserverRowModel
    ) {
    }
  }

  inner class RowListserverVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListserverBinding = RowListserverBinding.bind(itemView)
  }
}
