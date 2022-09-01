package com.application.app.modules.onboardingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingThreeBinding
import com.application.app.modules.onboardingthree.`data`.viewmodel.OnboardingThreeVM
import kotlin.String
import kotlin.Unit

class OnboardingThreeActivity :
    BaseActivity<ActivityOnboardingThreeBinding>(R.layout.activity_onboarding_three) {
  private val viewModel: OnboardingThreeVM by viewModels<OnboardingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
