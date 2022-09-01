package com.application.app.modules.iphone13promaxsixteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListrectanglefifteenTwoBinding
import com.application.app.modules.iphone13promaxsixteen.`data`.model.ListrectanglefifteenTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefifteenTwoAdapter(
  var list: List<ListrectanglefifteenTwoRowModel>
) : RecyclerView.Adapter<ListrectanglefifteenTwoAdapter.RowListrectanglefifteenTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefifteenTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefifteen_two,parent,false)
    return RowListrectanglefifteenTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefifteenTwoVH, position: Int) {
    val listrectanglefifteenTwoRowModel = ListrectanglefifteenTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefifteenTwoRowModel = list[position]
    holder.binding.listrectanglefifteenTwoRowModel = listrectanglefifteenTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefifteenTwoRowModel>) {
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
      item: ListrectanglefifteenTwoRowModel
    ) {
    }
  }

  inner class RowListrectanglefifteenTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefifteenTwoBinding =
        RowListrectanglefifteenTwoBinding.bind(itemView)
  }
}
