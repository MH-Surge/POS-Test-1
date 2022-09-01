package com.application.app.modules.loginsignup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLogInSignUpBinding
import com.application.app.modules.forgotpasswordone.ui.ForgotPasswordOneActivity
import com.application.app.modules.loginsignup.`data`.viewmodel.LogInSignUpVM
import kotlin.String
import kotlin.Unit

class LogInSignUpActivity :
    BaseActivity<ActivityLogInSignUpBinding>(R.layout.activity_log_in_sign_up) {
  private val viewModel: LogInSignUpVM by viewModels<LogInSignUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInSignUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInSignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
