package com.application.app.modules.iphone13promaxsevenone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowStaggeredrectanglefifteenBinding
import com.application.app.modules.iphone13promaxsevenone.`data`.model.StaggeredrectanglefifteenRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredrectanglefifteenAdapter(
  var list: List<StaggeredrectanglefifteenRowModel>
) : RecyclerView.Adapter<StaggeredrectanglefifteenAdapter.RowStaggeredrectanglefifteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowStaggeredrectanglefifteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredrectanglefifteen,parent,false)
    return RowStaggeredrectanglefifteenVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredrectanglefifteenVH, position: Int) {
    val staggeredrectanglefifteenRowModel = StaggeredrectanglefifteenRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredrectanglefifteenRowModel = list[position]
    holder.binding.staggeredrectanglefifteenRowModel = staggeredrectanglefifteenRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredrectanglefifteenRowModel>) {
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
      item: StaggeredrectanglefifteenRowModel
    ) {
    }
  }

  inner class RowStaggeredrectanglefifteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredrectanglefifteenBinding =
        RowStaggeredrectanglefifteenBinding.bind(itemView)
  }
}
