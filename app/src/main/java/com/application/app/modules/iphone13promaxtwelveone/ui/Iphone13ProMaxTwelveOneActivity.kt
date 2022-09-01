package com.application.app.modules.iphone13promaxtwelveone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwelveOneBinding
import com.application.app.modules.iphone13promaxtwelveone.`data`.viewmodel.Iphone13ProMaxTwelveOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwelveOneActivity :
    BaseActivity<ActivityIphone13ProMaxTwelveOneBinding>(R.layout.activity_iphone_13_pro_max_twelve_one)
    {
  private val viewModel: Iphone13ProMaxTwelveOneVM by viewModels<Iphone13ProMaxTwelveOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwelveOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWELVE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTwelveOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
