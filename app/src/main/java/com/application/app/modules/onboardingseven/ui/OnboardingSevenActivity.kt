package com.application.app.modules.onboardingseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingSevenBinding
import com.application.app.modules.onboardingseven.`data`.viewmodel.OnboardingSevenVM
import kotlin.String
import kotlin.Unit

class OnboardingSevenActivity :
    BaseActivity<ActivityOnboardingSevenBinding>(R.layout.activity_onboarding_seven) {
  private val viewModel: OnboardingSevenVM by viewModels<OnboardingSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
