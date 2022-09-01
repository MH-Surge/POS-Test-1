package com.application.app.modules.iphone13promaxfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFiveBinding
import com.application.app.modules.iphone13promaxfive.`data`.viewmodel.Iphone13ProMaxFiveVM
import com.application.app.modules.iphone13promaxfourteen.ui.Iphone13ProMaxFourteenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFiveActivity :
    BaseActivity<ActivityIphone13ProMaxFiveBinding>(R.layout.activity_iphone_13_pro_max_five) {
  private val viewModel: Iphone13ProMaxFiveVM by viewModels<Iphone13ProMaxFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddItems.setOnClickListener {
      val destIntent = Iphone13ProMaxFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
