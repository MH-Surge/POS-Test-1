package com.application.app.modules.forgotpasswordtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityForgotPasswordTwoBinding
import com.application.app.modules.forgotpasswordthree.ui.ForgotPasswordThreeActivity
import com.application.app.modules.forgotpasswordtwo.`data`.viewmodel.ForgotPasswordTwoVM
import kotlin.String
import kotlin.Unit

class ForgotPasswordTwoActivity :
    BaseActivity<ActivityForgotPasswordTwoBinding>(R.layout.activity_forgot_password_two) {
  private val viewModel: ForgotPasswordTwoVM by viewModels<ForgotPasswordTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipsetwentytwo.setOnClickListener {
      val destIntent = ForgotPasswordThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
