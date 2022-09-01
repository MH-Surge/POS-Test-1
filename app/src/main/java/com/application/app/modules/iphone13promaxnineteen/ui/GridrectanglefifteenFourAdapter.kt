package com.application.app.modules.iphone13promaxnineteen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowGridrectanglefifteenFourBinding
import com.application.app.modules.iphone13promaxnineteen.`data`.model.GridrectanglefifteenFourRowModel
import kotlin.Int
import kotlin.collections.List

class GridrectanglefifteenFourAdapter(
  var list: List<GridrectanglefifteenFourRowModel>
) : RecyclerView.Adapter<GridrectanglefifteenFourAdapter.RowGridrectanglefifteenFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridrectanglefifteenFourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridrectanglefifteen_four,parent,false)
    return RowGridrectanglefifteenFourVH(view)
  }

  override fun onBindViewHolder(holder: RowGridrectanglefifteenFourVH, position: Int) {
    val gridrectanglefifteenFourRowModel = GridrectanglefifteenFourRowModel()
    // TODO uncomment following line after integration with data source
    // val gridrectanglefifteenFourRowModel = list[position]
    holder.binding.gridrectanglefifteenFourRowModel = gridrectanglefifteenFourRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridrectanglefifteenFourRowModel>) {
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
      item: GridrectanglefifteenFourRowModel
    ) {
    }
  }

  inner class RowGridrectanglefifteenFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridrectanglefifteenFourBinding =
        RowGridrectanglefifteenFourBinding.bind(itemView)
  }
}
