package com.application.app.modules.iphone13promaxthreeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListordercounterOneBinding
import com.application.app.modules.iphone13promaxthreeone.`data`.model.ListordercounterOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListordercounterOneAdapter(
  var list: List<ListordercounterOneRowModel>
) : RecyclerView.Adapter<ListordercounterOneAdapter.RowListordercounterOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListordercounterOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listordercounter_one,parent,false)
    return RowListordercounterOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListordercounterOneVH, position: Int) {
    val listordercounterOneRowModel = ListordercounterOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listordercounterOneRowModel = list[position]
    holder.binding.listordercounterOneRowModel = listordercounterOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListordercounterOneRowModel>) {
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
      item: ListordercounterOneRowModel
    ) {
    }
  }

  inner class RowListordercounterOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListordercounterOneBinding = RowListordercounterOneBinding.bind(itemView)
  }
}
