package com.application.app.modules.iphone13promaxnineteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListrectanglefifteenTwo2Binding
import com.application.app.modules.iphone13promaxnineteen.`data`.model.ListrectanglefifteenTwo2RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefifteenTwoAdapter(
  var list: List<ListrectanglefifteenTwo2RowModel>
) : RecyclerView.Adapter<ListrectanglefifteenTwoAdapter.RowListrectanglefifteenTwo2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefifteenTwo2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefifteen_two2,parent,false)
    return RowListrectanglefifteenTwo2VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefifteenTwo2VH, position: Int) {
    val listrectanglefifteenTwo2RowModel = ListrectanglefifteenTwo2RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefifteenTwo2RowModel = list[position]
    holder.binding.listrectanglefifteenTwo2RowModel = listrectanglefifteenTwo2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefifteenTwo2RowModel>) {
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
      item: ListrectanglefifteenTwo2RowModel
    ) {
    }
  }

  inner class RowListrectanglefifteenTwo2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefifteenTwo2Binding =
        RowListrectanglefifteenTwo2Binding.bind(itemView)
  }
}
