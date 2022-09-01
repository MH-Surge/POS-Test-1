package com.application.app.modules.onboardingfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListarrowtwoBinding
import com.application.app.modules.onboardingfive.`data`.model.ListartwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowtwoAdapter(
  var list: List<ListartwoRowModel>
) : RecyclerView.Adapter<ListarrowtwoAdapter.RowListarrowtwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowtwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowtwo,parent,false)
    return RowListarrowtwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowtwoVH, position: Int) {
    val listartwoRowModel = ListartwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listartwoRowModel = list[position]
    holder.binding.listartwoRowModel = listartwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListartwoRowModel>) {
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
      item: ListartwoRowModel
    ) {
    }
  }

  inner class RowListarrowtwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowtwoBinding = RowListarrowtwoBinding.bind(itemView)
  }
}
