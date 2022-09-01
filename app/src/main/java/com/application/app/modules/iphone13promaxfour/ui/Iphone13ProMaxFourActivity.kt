package com.application.app.modules.iphone13promaxfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFourBinding
import com.application.app.modules.iphone13promaxfour.`data`.viewmodel.Iphone13ProMaxFourVM
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseven.ui.Iphone13ProMaxSevenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthree.ui.Iphone13ProMaxThreeActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFourActivity :
    BaseActivity<ActivityIphone13ProMaxFourBinding>(R.layout.activity_iphone_13_pro_max_four) {
  private val viewModel: Iphone13ProMaxFourVM by viewModels<Iphone13ProMaxFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckout.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddNewOrder.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowone.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
