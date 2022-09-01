package com.application.app.modules.framefortytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFrameFortytwoBinding
import com.application.app.modules.framefortytwo.`data`.viewmodel.FrameFortytwoVM
import kotlin.String
import kotlin.Unit

class FrameFortytwoActivity :
    BaseActivity<ActivityFrameFortytwoBinding>(R.layout.activity_frame_fortytwo) {
  private val viewModel: FrameFortytwoVM by viewModels<FrameFortytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFortytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_FORTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFortytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
