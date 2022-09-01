package com.application.app.modules.forgotpasswordthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityForgotPasswordThreeBinding
import com.application.app.modules.forgotpasswordthree.`data`.viewmodel.ForgotPasswordThreeVM
import com.application.app.modules.loginsignupone.ui.LogInSignUpOneActivity
import kotlin.String
import kotlin.Unit

class ForgotPasswordThreeActivity :
    BaseActivity<ActivityForgotPasswordThreeBinding>(R.layout.activity_forgot_password_three) {
  private val viewModel: ForgotPasswordThreeVM by viewModels<ForgotPasswordThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackellipsetwentytwo.setOnClickListener {
      val destIntent = LogInSignUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
