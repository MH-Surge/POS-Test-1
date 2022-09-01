package com.application.app.modules.iphone13promaxseventwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListmenuTwoBinding
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListmenuTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListmenuTwoAdapter(
  var list: List<ListmenuTwoRowModel>
) : RecyclerView.Adapter<ListmenuTwoAdapter.RowListmenuTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmenuTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmenu_two,parent,false)
    return RowListmenuTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListmenuTwoVH, position: Int) {
    val listmenuTwoRowModel = ListmenuTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listmenuTwoRowModel = list[position]
    holder.binding.listmenuTwoRowModel = listmenuTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmenuTwoRowModel>) {
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
      item: ListmenuTwoRowModel
    ) {
    }
  }

  inner class RowListmenuTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmenuTwoBinding = RowListmenuTwoBinding.bind(itemView)
  }
}
