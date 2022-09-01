package com.application.app.modules.iphone13promaxseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowListcameraBinding
import com.application.app.modules.iphone13promaxseven.`data`.model.ListcameraRowModel
import kotlin.Int
import kotlin.collections.List

class ListcameraAdapter(
  var list: List<ListcameraRowModel>
) : RecyclerView.Adapter<ListcameraAdapter.RowListcameraVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcameraVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcamera,parent,false)
    return RowListcameraVH(view)
  }

  override fun onBindViewHolder(holder: RowListcameraVH, position: Int) {
    val listcameraRowModel = ListcameraRowModel()
    // TODO uncomment following line after integration with data source
    // val listcameraRowModel = list[position]
    holder.binding.listcameraRowModel = listcameraRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcameraRowModel>) {
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
      item: ListcameraRowModel
    ) {
    }
  }

  inner class RowListcameraVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcameraBinding = RowListcameraBinding.bind(itemView)
    init {
      binding.imageCamera.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListcameraRowModel())
      }
      binding.linearColumncamera.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListcameraRowModel())
      }
      binding.linearColumntrash.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListcameraRowModel())
      }
    }
  }
}
