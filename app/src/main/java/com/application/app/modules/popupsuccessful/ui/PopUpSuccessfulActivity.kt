package com.application.app.modules.popupsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPopUpSuccessfulBinding
import com.application.app.modules.iphone13promaxthirteen.ui.Iphone13ProMaxThirteenActivity
import com.application.app.modules.popupsuccessful.`data`.viewmodel.PopUpSuccessfulVM
import kotlin.String
import kotlin.Unit

class PopUpSuccessfulActivity :
    BaseActivity<ActivityPopUpSuccessfulBinding>(R.layout.activity_pop_up_successful) {
  private val viewModel: PopUpSuccessfulVM by viewModels<PopUpSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popUpSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDone.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POP_UP_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopUpSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
