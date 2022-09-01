package com.application.app.modules.popupunsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPopUpUnsuccessfulBinding
import com.application.app.modules.iphone13promaxseven.ui.Iphone13ProMaxSevenActivity
import com.application.app.modules.iphone13promaxsix.ui.Iphone13ProMaxSixActivity
import com.application.app.modules.popupunsuccessful.`data`.viewmodel.PopUpUnsuccessfulVM
import kotlin.String
import kotlin.Unit

class PopUpUnsuccessfulActivity :
    BaseActivity<ActivityPopUpUnsuccessfulBinding>(R.layout.activity_pop_up_unsuccessful) {
  private val viewModel: PopUpUnsuccessfulVM by viewModels<PopUpUnsuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popUpUnsuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTryAgain.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnDone.setOnClickListener {
      val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POP_UP_UNSUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopUpUnsuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
