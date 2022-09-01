package com.application.app.modules.iphone13promaxseventeen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSeventeenBinding
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.`data`.model.Gridgrid2RowModel
import com.application.app.modules.iphone13promaxseventeen.`data`.viewmodel.Iphone13ProMaxSeventeenVM
import com.application.app.modules.loginsignupone.ui.LogInSignUpOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSeventeenActivity :
    BaseActivity<ActivityIphone13ProMaxSeventeenBinding>(R.layout.activity_iphone_13_pro_max_seventeen)
    {
  private val viewModel: Iphone13ProMaxSeventeenVM by viewModels<Iphone13ProMaxSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridgrid2RowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    binding.iphone13ProMaxSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignOut.setOnClickListener {
      val destIntent = LogInSignUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: Gridgrid2RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumngrid -> {
        val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SEVENTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSeventeenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
