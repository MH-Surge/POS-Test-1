package com.application.app.modules.iphone13promaxfifteenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFifteenOneBinding
import com.application.app.modules.iphone13promaxfifteenone.`data`.viewmodel.Iphone13ProMaxFifteenOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFifteenOneActivity :
    BaseActivity<ActivityIphone13ProMaxFifteenOneBinding>(R.layout.activity_iphone_13_pro_max_fifteen_one)
    {
  private val viewModel: Iphone13ProMaxFifteenOneVM by viewModels<Iphone13ProMaxFifteenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFifteenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FIFTEEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFifteenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
