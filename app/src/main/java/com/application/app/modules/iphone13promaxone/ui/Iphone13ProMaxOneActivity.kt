package com.application.app.modules.iphone13promaxone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxOneBinding
import com.application.app.modules.iphone13promaxone.`data`.viewmodel.Iphone13ProMaxOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxOneActivity :
    BaseActivity<ActivityIphone13ProMaxOneBinding>(R.layout.activity_iphone_13_pro_max_one) {
  private val viewModel: Iphone13ProMaxOneVM by viewModels<Iphone13ProMaxOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
