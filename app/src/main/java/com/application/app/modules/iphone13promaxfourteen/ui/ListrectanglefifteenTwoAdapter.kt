package com.application.app.modules.iphone13promaxfourteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListrectanglefifteenTwo3Binding
import com.application.app.modules.iphone13promaxfourteen.`data`.model.ListrectanglefifteenTwo3RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefifteenTwoAdapter(
  var list: List<ListrectanglefifteenTwo3RowModel>
) : RecyclerView.Adapter<ListrectanglefifteenTwoAdapter.RowListrectanglefifteenTwo3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefifteenTwo3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefifteen_two3,parent,false)
    return RowListrectanglefifteenTwo3VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefifteenTwo3VH, position: Int) {
    val listrectanglefifteenTwo3RowModel = ListrectanglefifteenTwo3RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefifteenTwo3RowModel = list[position]
    holder.binding.listrectanglefifteenTwo3RowModel = listrectanglefifteenTwo3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefifteenTwo3RowModel>) {
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
      item: ListrectanglefifteenTwo3RowModel
    ) {
    }
  }

  inner class RowListrectanglefifteenTwo3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefifteenTwo3Binding =
        RowListrectanglefifteenTwo3Binding.bind(itemView)
  }
}
