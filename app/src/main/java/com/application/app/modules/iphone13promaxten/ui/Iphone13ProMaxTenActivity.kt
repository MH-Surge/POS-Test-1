package com.application.app.modules.iphone13promaxten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTenBinding
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxten.`data`.viewmodel.Iphone13ProMaxTenVM
import com.application.app.modules.iphone13promaxthirteen.ui.Iphone13ProMaxThirteenActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTenActivity :
    BaseActivity<ActivityIphone13ProMaxTenBinding>(R.layout.activity_iphone_13_pro_max_ten) {
  private val viewModel: Iphone13ProMaxTenVM by viewModels<Iphone13ProMaxTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
