package com.application.app.modules.popup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPopUpBinding
import com.application.app.modules.popup.`data`.viewmodel.PopUpVM
import com.application.app.modules.popupone.ui.PopUpOneActivity
import com.application.app.modules.popupunsuccessful.ui.PopUpUnsuccessfulActivity
import kotlin.String
import kotlin.Unit

class PopUpActivity : BaseActivity<ActivityPopUpBinding>(R.layout.activity_pop_up) {
  private val viewModel: PopUpVM by viewModels<PopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = PopUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleEightyTwo.setOnClickListener {
      val destIntent = PopUpUnsuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POP_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
