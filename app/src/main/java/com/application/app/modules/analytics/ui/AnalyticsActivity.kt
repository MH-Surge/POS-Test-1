package com.application.app.modules.analytics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAnalyticsBinding
import com.application.app.modules.analytics.`data`.viewmodel.AnalyticsVM
import kotlin.String
import kotlin.Unit

class AnalyticsActivity : BaseActivity<ActivityAnalyticsBinding>(R.layout.activity_analytics) {
  private val viewModel: AnalyticsVM by viewModels<AnalyticsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.analyticsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ANALYTICS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AnalyticsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
