package com.application.app.modules.iphone13promaxthreeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxThreeOneBinding
import com.application.app.modules.iphone13promaxthreeone.`data`.model.Gridgrid3RowModel
import com.application.app.modules.iphone13promaxthreeone.`data`.model.ListordercounterOneRowModel
import com.application.app.modules.iphone13promaxthreeone.`data`.viewmodel.Iphone13ProMaxThreeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxThreeOneActivity :
    BaseActivity<ActivityIphone13ProMaxThreeOneBinding>(R.layout.activity_iphone_13_pro_max_three_one)
    {
  private val viewModel: Iphone13ProMaxThreeOneVM by viewModels<Iphone13ProMaxThreeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridgrid3RowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    val listordercounterOneAdapter =
    ListordercounterOneAdapter(viewModel.listordercounterOneList.value?:mutableListOf())
    binding.recyclerListordercounterOne.adapter = listordercounterOneAdapter
    listordercounterOneAdapter.setOnItemClickListener(
    object : ListordercounterOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListordercounterOneRowModel) {
        onClickRecyclerListordercounterOne(view, position, item)
      }
    }
    )
    viewModel.listordercounterOneList.observe(this) {
      listordercounterOneAdapter.updateData(it)
    }
    binding.iphone13ProMaxThreeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: Gridgrid3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListordercounterOne(
    view: View,
    position: Int,
    item: ListordercounterOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_THREE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxThreeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
