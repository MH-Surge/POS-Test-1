package com.application.app.modules.iphone13promaxnineone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxNineOneBinding
import com.application.app.modules.iphone13promaxnineone.`data`.model.GridcategoryRowModel
import com.application.app.modules.iphone13promaxnineone.`data`.viewmodel.Iphone13ProMaxNineOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxNineOneActivity :
    BaseActivity<ActivityIphone13ProMaxNineOneBinding>(R.layout.activity_iphone_13_pro_max_nine_one)
    {
  private val viewModel: Iphone13ProMaxNineOneVM by viewModels<Iphone13ProMaxNineOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridcategoryAdapter =
    GridcategoryAdapter(viewModel.gridcategoryList.value?:mutableListOf())
    binding.recyclerGridcategory.adapter = gridcategoryAdapter
    gridcategoryAdapter.setOnItemClickListener(
    object : GridcategoryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridcategoryRowModel) {
        onClickRecyclerGridcategory(view, position, item)
      }
    }
    )
    viewModel.gridcategoryList.observe(this) {
      gridcategoryAdapter.updateData(it)
    }
    binding.iphone13ProMaxNineOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcategory(
    view: View,
    position: Int,
    item: GridcategoryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_NINE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxNineOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
