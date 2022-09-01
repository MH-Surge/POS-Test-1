package com.application.app.modules.iphone13promaxtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwoBinding
import com.application.app.modules.iphone13promaxtwo.`data`.viewmodel.Iphone13ProMaxTwoVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwoActivity :
    BaseActivity<ActivityIphone13ProMaxTwoBinding>(R.layout.activity_iphone_13_pro_max_two) {
  private val viewModel: Iphone13ProMaxTwoVM by viewModels<Iphone13ProMaxTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
