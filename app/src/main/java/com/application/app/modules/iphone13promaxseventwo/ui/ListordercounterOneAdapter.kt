package com.application.app.modules.iphone13promaxseventwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListordercounterOne1Binding
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListordercounterOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListordercounterOneAdapter(
  var list: List<ListordercounterOne1RowModel>
) : RecyclerView.Adapter<ListordercounterOneAdapter.RowListordercounterOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListordercounterOne1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listordercounter_one1,parent,false)
    return RowListordercounterOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListordercounterOne1VH, position: Int) {
    val listordercounterOne1RowModel = ListordercounterOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listordercounterOne1RowModel = list[position]
    holder.binding.listordercounterOne1RowModel = listordercounterOne1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListordercounterOne1RowModel>) {
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
      item: ListordercounterOne1RowModel
    ) {
    }
  }

  inner class RowListordercounterOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListordercounterOne1Binding = RowListordercounterOne1Binding.bind(itemView)
  }
}
