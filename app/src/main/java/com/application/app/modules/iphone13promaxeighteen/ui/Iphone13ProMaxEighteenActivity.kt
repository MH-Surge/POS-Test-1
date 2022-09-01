package com.application.app.modules.iphone13promaxeighteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxEighteenBinding
import com.application.app.modules.iphone13promaxeighteen.`data`.model.GridgridRowModel
import com.application.app.modules.iphone13promaxeighteen.`data`.viewmodel.Iphone13ProMaxEighteenVM
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxtwentyone.ui.Iphone13ProMaxTwentyoneActivity
import com.application.app.modules.iphone13promaxtwentytwo.ui.Iphone13ProMaxTwentytwoActivity
import com.application.app.modules.loginsignupone.ui.LogInSignUpOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxEighteenActivity :
    BaseActivity<ActivityIphone13ProMaxEighteenBinding>(R.layout.activity_iphone_13_pro_max_eighteen)
    {
  private val viewModel: Iphone13ProMaxEighteenVM by viewModels<Iphone13ProMaxEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridgridAdapter = GridgridAdapter(viewModel.gridgridList.value?:mutableListOf())
    binding.recyclerGridgrid.adapter = gridgridAdapter
    gridgridAdapter.setOnItemClickListener(
    object : GridgridAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridgridRowModel) {
        onClickRecyclerGridgrid(view, position, item)
      }
    }
    )
    viewModel.gridgridList.observe(this) {
      gridgridAdapter.updateData(it)
    }
    binding.iphone13ProMaxEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvector.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentytwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtAddAnOrder.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtOpenOrdersOne.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtPastOrdersOne.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentyoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignOut.setOnClickListener {
      val destIntent = LogInSignUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridgrid(
    view: View,
    position: Int,
    item: GridgridRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumngrid ->  {
        val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_EIGHTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxEighteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
