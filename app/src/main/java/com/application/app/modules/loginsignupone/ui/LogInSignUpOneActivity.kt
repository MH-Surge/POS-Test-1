package com.application.app.modules.loginsignupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityLogInSignUpOneBinding
import com.application.app.modules.forgotpasswordtwo.ui.ForgotPasswordTwoActivity
import com.application.app.modules.iphone13promaxthree.ui.Iphone13ProMaxThreeActivity
import com.application.app.modules.loginsignupone.`data`.viewmodel.LogInSignUpOneVM
import kotlin.String
import kotlin.Unit

class LogInSignUpOneActivity :
    BaseActivity<ActivityLogInSignUpOneBinding>(R.layout.activity_log_in_sign_up_one) {
  private val viewModel: LogInSignUpOneVM by viewModels<LogInSignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInSignUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignIn.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_SIGN_UP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInSignUpOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
