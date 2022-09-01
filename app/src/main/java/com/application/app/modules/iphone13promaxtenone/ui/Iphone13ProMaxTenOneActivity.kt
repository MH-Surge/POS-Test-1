package com.application.app.modules.iphone13promaxtenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTenOneBinding
import com.application.app.modules.iphone13promaxtenone.`data`.viewmodel.Iphone13ProMaxTenOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTenOneActivity :
    BaseActivity<ActivityIphone13ProMaxTenOneBinding>(R.layout.activity_iphone_13_pro_max_ten_one) {
  private val viewModel: Iphone13ProMaxTenOneVM by viewModels<Iphone13ProMaxTenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
