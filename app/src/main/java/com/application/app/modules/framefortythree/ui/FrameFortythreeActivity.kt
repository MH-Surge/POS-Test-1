package com.application.app.modules.framefortythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFrameFortythreeBinding
import com.application.app.modules.framefortythree.`data`.viewmodel.FrameFortythreeVM
import kotlin.String
import kotlin.Unit

class FrameFortythreeActivity :
    BaseActivity<ActivityFrameFortythreeBinding>(R.layout.activity_frame_fortythree) {
  private val viewModel: FrameFortythreeVM by viewModels<FrameFortythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFortythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_FORTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFortythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
