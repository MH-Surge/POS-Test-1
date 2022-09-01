package com.application.app.modules.iphone13promaxsevenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSevenOneBinding
import com.application.app.modules.iphone13promaxsevenone.`data`.model.StaggeredrectanglefifteenRowModel
import com.application.app.modules.iphone13promaxsevenone.`data`.viewmodel.Iphone13ProMaxSevenOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSevenOneActivity :
    BaseActivity<ActivityIphone13ProMaxSevenOneBinding>(R.layout.activity_iphone_13_pro_max_seven_one)
    {
  private val viewModel: Iphone13ProMaxSevenOneVM by viewModels<Iphone13ProMaxSevenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredrectanglefifteenAdapter =
    StaggeredrectanglefifteenAdapter(viewModel.staggeredrectanglefifteenList.value?:mutableListOf())
    binding.recyclerStaggeredrectanglefifteen.adapter = staggeredrectanglefifteenAdapter
    staggeredrectanglefifteenAdapter.setOnItemClickListener(
    object : StaggeredrectanglefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      StaggeredrectanglefifteenRowModel) {
        onClickRecyclerStaggeredrectanglefifteen(view, position, item)
      }
    }
    )
    viewModel.staggeredrectanglefifteenList.observe(this) {
      staggeredrectanglefifteenAdapter.updateData(it)
    }
    binding.iphone13ProMaxSevenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggeredrectanglefifteen(
    view: View,
    position: Int,
    item: StaggeredrectanglefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SEVEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSevenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
