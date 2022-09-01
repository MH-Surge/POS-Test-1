package com.application.app.modules.iphone13promaxthirteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxThirteenBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthirteen.`data`.model.Gridgrid4RowModel
import com.application.app.modules.iphone13promaxthirteen.`data`.viewmodel.Iphone13ProMaxThirteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxThirteenActivity :
    BaseActivity<ActivityIphone13ProMaxThirteenBinding>(R.layout.activity_iphone_13_pro_max_thirteen)
    {
  private val viewModel: Iphone13ProMaxThirteenVM by viewModels<Iphone13ProMaxThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridgrid4RowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    binding.iphone13ProMaxThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: Gridgrid4RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumngrid ->  {
        val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_THIRTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxThirteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
