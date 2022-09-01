package com.application.app.modules.iphone13promaxthirteenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxThirteenOneBinding
import com.application.app.modules.iphone13promaxthirteenone.`data`.viewmodel.Iphone13ProMaxThirteenOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxThirteenOneActivity :
    BaseActivity<ActivityIphone13ProMaxThirteenOneBinding>(R.layout.activity_iphone_13_pro_max_thirteen_one)
    {
  private val viewModel: Iphone13ProMaxThirteenOneVM by viewModels<Iphone13ProMaxThirteenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxThirteenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_THIRTEEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxThirteenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
