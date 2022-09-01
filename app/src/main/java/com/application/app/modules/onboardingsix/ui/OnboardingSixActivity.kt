package com.application.app.modules.onboardingsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingSixBinding
import com.application.app.modules.onboardingsix.`data`.viewmodel.OnboardingSixVM
import kotlin.String
import kotlin.Unit

class OnboardingSixActivity :
    BaseActivity<ActivityOnboardingSixBinding>(R.layout.activity_onboarding_six) {
  private val viewModel: OnboardingSixVM by viewModels<OnboardingSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
