package com.application.app.modules.iphone13promaxseventwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSevenTwoBinding
import com.application.app.modules.iphone13promaxseventwo.`data`.model.Gridgrid5RowModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListmenuTwoRowModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListordercounterOne1RowModel
import com.application.app.modules.iphone13promaxseventwo.`data`.viewmodel.Iphone13ProMaxSevenTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSevenTwoActivity :
    BaseActivity<ActivityIphone13ProMaxSevenTwoBinding>(R.layout.activity_iphone_13_pro_max_seven_two)
    {
  private val viewModel: Iphone13ProMaxSevenTwoVM by viewModels<Iphone13ProMaxSevenTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridgrid5RowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    val listmenuTwoAdapter =
    ListmenuTwoAdapter(viewModel.listmenuTwoList.value?:mutableListOf())
    binding.recyclerListmenuTwo.adapter = listmenuTwoAdapter
    listmenuTwoAdapter.setOnItemClickListener(
    object : ListmenuTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmenuTwoRowModel) {
        onClickRecyclerListmenuTwo(view, position, item)
      }
    }
    )
    viewModel.listmenuTwoList.observe(this) {
      listmenuTwoAdapter.updateData(it)
    }
    val listordercounterOneAdapter =
    ListordercounterOneAdapter(viewModel.listordercounterOneList.value?:mutableListOf())
    binding.recyclerListordercounterOne.adapter = listordercounterOneAdapter
    listordercounterOneAdapter.setOnItemClickListener(
    object : ListordercounterOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListordercounterOne1RowModel) {
        onClickRecyclerListordercounterOne(view, position, item)
      }
    }
    )
    viewModel.listordercounterOneList.observe(this) {
      listordercounterOneAdapter.updateData(it)
    }
    binding.iphone13ProMaxSevenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: Gridgrid5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmenuTwo(
    view: View,
    position: Int,
    item: ListmenuTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListordercounterOne(
    view: View,
    position: Int,
    item: ListordercounterOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SEVEN_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSevenTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
