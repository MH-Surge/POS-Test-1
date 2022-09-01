package com.application.app.modules.iphone13promaxfifteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListrectanglefifteenFourBinding
import com.application.app.modules.iphone13promaxfifteen.`data`.model.ListrectanglefifteenFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefifteenFourAdapter(
  var list: List<ListrectanglefifteenFourRowModel>
) : RecyclerView.Adapter<ListrectanglefifteenFourAdapter.RowListrectanglefifteenFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefifteenFourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefifteen_four,parent,false)
    return RowListrectanglefifteenFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefifteenFourVH, position: Int) {
    val listrectanglefifteenFourRowModel = ListrectanglefifteenFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefifteenFourRowModel = list[position]
    holder.binding.listrectanglefifteenFourRowModel = listrectanglefifteenFourRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefifteenFourRowModel>) {
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
      item: ListrectanglefifteenFourRowModel
    ) {
    }
  }

  inner class RowListrectanglefifteenFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefifteenFourBinding =
        RowListrectanglefifteenFourBinding.bind(itemView)
  }
}
