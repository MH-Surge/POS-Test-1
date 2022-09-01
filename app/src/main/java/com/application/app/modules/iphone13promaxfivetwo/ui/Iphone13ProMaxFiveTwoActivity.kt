package com.application.app.modules.iphone13promaxfivetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFiveTwoBinding
import com.application.app.modules.iphone13promaxfivetwo.`data`.viewmodel.Iphone13ProMaxFiveTwoVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFiveTwoActivity :
    BaseActivity<ActivityIphone13ProMaxFiveTwoBinding>(R.layout.activity_iphone_13_pro_max_five_two)
    {
  private val viewModel: Iphone13ProMaxFiveTwoVM by viewModels<Iphone13ProMaxFiveTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFiveTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FIVE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFiveTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
