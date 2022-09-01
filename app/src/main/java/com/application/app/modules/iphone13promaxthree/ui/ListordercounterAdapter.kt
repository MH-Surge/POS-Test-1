package com.application.app.modules.iphone13promaxthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListordercounterBinding
import com.application.app.modules.iphone13promaxthree.`data`.model.ListordercounterRowModel
import kotlin.Int
import kotlin.collections.List

class ListordercounterAdapter(
  var list: List<ListordercounterRowModel>
) : RecyclerView.Adapter<ListordercounterAdapter.RowListordercounterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListordercounterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listordercounter,parent,false)
    return RowListordercounterVH(view)
  }

  override fun onBindViewHolder(holder: RowListordercounterVH, position: Int) {
    val listordercounterRowModel = ListordercounterRowModel()
    // TODO uncomment following line after integration with data source
    // val listordercounterRowModel = list[position]
    holder.binding.listordercounterRowModel = listordercounterRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListordercounterRowModel>) {
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
      item: ListordercounterRowModel
    ) {
    }
  }

  inner class RowListordercounterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListordercounterBinding = RowListordercounterBinding.bind(itemView)
    init {
      binding.linearColumnordercounter.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListordercounterRowModel())
      }
    }
  }
}
