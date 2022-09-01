package com.application.app.modules.onboardingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingFourBinding
import com.application.app.modules.onboardingfour.`data`.viewmodel.OnboardingFourVM
import kotlin.String
import kotlin.Unit

class OnboardingFourActivity :
    BaseActivity<ActivityOnboardingFourBinding>(R.layout.activity_onboarding_four) {
  private val viewModel: OnboardingFourVM by viewModels<OnboardingFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
