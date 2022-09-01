package com.application.app.modules.iphone13promaxsixone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSixOneBinding
import com.application.app.modules.iphone13promaxsixone.`data`.viewmodel.Iphone13ProMaxSixOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSixOneActivity :
    BaseActivity<ActivityIphone13ProMaxSixOneBinding>(R.layout.activity_iphone_13_pro_max_six_one) {
  private val viewModel: Iphone13ProMaxSixOneVM by viewModels<Iphone13ProMaxSixOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxSixOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SIX_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSixOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
